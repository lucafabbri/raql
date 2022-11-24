// See https://aka.ms/new-console-template for more information
using Antlr4.Runtime;
var value = "(x=3 and y>10) or (x in [3,4,5] and y in [6,7,8])";
AntlrInputStream inputStream = new AntlrInputStream(value);
APLGrammarLexer aplGrammarLexer = new APLGrammarLexer(inputStream);
CommonTokenStream commonTokenStream = new CommonTokenStream(aplGrammarLexer);
APLGrammarParser aplGrammarParser = new APLGrammarParser(commonTokenStream);
APLGrammarParser.ClauseContext clauseContext = aplGrammarParser.clause();
APLVisitor visitor = new APLVisitor();
var visit = visitor.Visit(clauseContext);

Console.WriteLine(visit.ToString());

public class APLVisitor : APLGrammarBaseVisitor<object>
{}