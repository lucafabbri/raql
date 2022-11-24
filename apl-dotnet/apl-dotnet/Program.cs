// See https://aka.ms/new-console-template for more information
using System.Linq.Expressions;
using System.Reflection;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

//var value = "(x=3 and y>10) or (x in [3,4,5] and y in [6,7,8])";
var value = "x=3 ";
AntlrInputStream inputStream = new AntlrInputStream(value);
APLGrammarLexer lexer = new APLGrammarLexer(inputStream);
CommonTokenStream tokenStream = new CommonTokenStream(lexer);
APLGrammarParser parser = new APLGrammarParser(tokenStream);

var tree = parser.clause();


Console.ReadLine();

public class ClauseVisitor<TEntity> : APLGrammarBaseVisitor<Expression<Func<TEntity, bool>>> where TEntity : class 
{
    private readonly Expression<Func<TEntity, bool>> Predicate;

    public ClauseVisitor()
    {
        Predicate = PredicateBuilder.False<>;
    }

    public override Expression<Func<TEntity, bool>> VisitClause([NotNull] APLGrammarParser.ClauseContext context)
    {
        if(context.conjunction() != null)
        {
            var clauses = context.clause();
            if(clauses != null)
            {
                switch (clauses.Length)
                {
                    case 2:
                        var clauseVisitor1 = new ClauseVisitor<TEntity>(Predicate).Visit(clauses.First());
                        return clauses[0].Vis
                    case 1:
                    case 0:
                    default:
                        break;

                }
            }
        }
    }
}

public class StringOperationVisitor<TEntity> : APLGrammarBaseVisitor<Expression<Func<TEntity, bool>>> where TEntity : class
{
    private readonly Expression<Func<TEntity, bool>> Predicate;

    public StringOperationVisitor(Expression<Func<TEntity, bool>> predicate)
    {
        Predicate = predicate;
    }
}

public class NumberOperationVisitor<TEntity> : APLGrammarBaseVisitor<Expression<Func<TEntity, bool>>> where TEntity : class
{
    private readonly Expression<Func<TEntity, bool>> Predicate;

    public NumberOperationVisitor(Expression<Func<TEntity, bool>> predicate)
    {
        Predicate = predicate;
    }

}

public class BoolOperationVisitor<TEntity> : APLGrammarBaseVisitor<Expression<Func<TEntity, bool>>> where TEntity : class
{
    private readonly Expression<Func<TEntity, bool>> Predicate;

    public BoolOperationVisitor(Expression<Func<TEntity, bool>> predicate)
    {
        Predicate = predicate;
    }

}