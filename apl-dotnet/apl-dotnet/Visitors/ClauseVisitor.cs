// See https://aka.ms/new-console-template for more information
using System.Linq.Expressions;
using Antlr4.Runtime.Misc;
using Higrow.RAQL.Linq;

namespace Higrow.AQL.Visitors
{
    public class ClauseVisitor<TEntity> : RAQLBaseVisitor<Expression<Func<TEntity, bool>>> where TEntity : class
    {
        public override Expression<Func<TEntity, bool>> VisitClause([NotNull] RAQLParser.ClauseContext context)
        {
            var conjunction = context.conjunction();
            var clauses = context.clause();
            var operations = context.operation();

            if (conjunction != null)
            {
                var isAnd = conjunction.GetText().ToLower().Contains("and");
                if (clauses != null && operations == null && clauses.Length == 2)
                {
                    var clause1 = new ClauseVisitor<TEntity>().VisitClause(clauses.First());
                    var clause2 = new ClauseVisitor<TEntity>().VisitClause(clauses.Last());
                    return isAnd ? clause1.And(clause2) : clause1.Or(clause2);
                }
                else if (clauses != null && operations != null && clauses.Length == 1 && operations.Length == 1)
                {
                    var clause = new ClauseVisitor<TEntity>().VisitClause(clauses.First());
                    if (operations != null && operations.Length == 1)
                    {
                        var operation = new OperationVisitor<TEntity>().VisitOperation(operations.First());
                        if (operation != null)
                        {
                            return isAnd ? clause.And(operation) : clause.Or(operation);
                        }
                        else
                        {
                            return isAnd ? PredicateBuilder.False<TEntity>() : clause;
                        }
                    }
                }
                else if (clauses == null && operations != null && operations.Length == 2)
                {
                    var operation1 = new OperationVisitor<TEntity>().VisitOperation(operations.First());
                    var operation2 = new OperationVisitor<TEntity>().VisitOperation(operations.Last());
                    if (operation1 != null && operation2 != null)
                    {
                        return isAnd ? operation1.And(operation2) : operation1.Or(operation2);
                    }
                    else if (operation1 != null && operation2 == null)
                    {
                        return isAnd ? PredicateBuilder.False<TEntity>() : operation1;
                    }
                    else if (operation1 == null && operation2 != null)
                    {
                        return isAnd ? PredicateBuilder.False<TEntity>() : operation2;
                    }
                }
            }
            else if (conjunction is null && operations.Length == 1)
            {
                return new OperationVisitor<TEntity>().VisitOperation(operations.Last()) ?? PredicateBuilder.False<TEntity>();
            }

            return PredicateBuilder.False<TEntity>();
        }
    }
}