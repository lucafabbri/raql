using Antlr4.Runtime;
using Higrow.AQL.Visitors;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Higrow.AQL.Linq
{
    public static class AQLlExtension
    {
        public static IQueryable<T> Aql<T>(this IQueryable<T> items, string query) where T : class
        {
            AntlrInputStream inputStream = new AntlrInputStream(query);
            RAQLLexer lexer = new RAQLLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            RAQLParser parser = new RAQLParser(tokenStream);
            var clause = parser.clause();

            if (clause != null)
            {
                return items.Where(new ClauseVisitor<T>().VisitClause(clause));
            }
            return items;
        }
    }
}
