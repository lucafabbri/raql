// See https://aka.ms/new-console-template for more information
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

public class ClauseVisitor<TEntity> : APLGrammarBaseVisitor<IQueryable<TEntity>> where TEntity : class 
{
    private readonly IQueryable<TEntity> Items;

    public ClauseVisitor(IQueryable<TEntity> items)
    {
        Items = items;
    }

    public override IQueryable<TEntity> VisitClause([NotNull] APLGrammarParser.ClauseContext context)
    {
        if(context.conjunction() != null)
        {
        }
        return new ClauseExpression();
    }
}

public class StringOperationVisitor<TEntity> : APLGrammarBaseVisitor<IQueryable<TEntity>> where TEntity : class
{
    private readonly IQueryable<TEntity> Items;

    public StringOperationVisitor(IQueryable<TEntity> items)
    {
        Items = items;
    }
}

public class NumberOperationVisitor<TEntity> : APLGrammarBaseVisitor<IQueryable<TEntity>> where TEntity : class
{
    private readonly IQueryable<TEntity> Items;

    public NumberOperationVisitor(IQueryable<TEntity> items)
    {
        Items = items;
    }

}

public class BoolOperationVisitor<TEntity> : APLGrammarBaseVisitor<IQueryable<TEntity>> where TEntity : class
{
    private readonly IQueryable<TEntity> Items;

    public BoolOperationVisitor(IQueryable<TEntity> items)
    {
        Items = items;
    }

}