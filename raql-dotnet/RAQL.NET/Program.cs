// See https://aka.ms/new-console-template for more information
using System.Linq;
using System.Reflection;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using RAQL.NET.Linq;

//var value = "(x=3 and y>10) or (x in [3,4,5] and y in [6,7,8])";
var query = "x in [1,2]";

IEnumerable<Vector> vectors = new List<Vector>()
    {
        new Vector(1,2),
        new Vector(2,1),
        new Vector(3,1),
        new Vector(3,2),
        new Vector(2,4),
        new Vector(6,3)
    };

foreach (var vector in vectors.AsQueryable().Aql(query).ToList())
{
  Console.WriteLine($"[{vector.x},{vector.y}]");
}


Console.ReadLine();

class Vector
{
  public int x { get; set; }
  public int y { get; set; }

  public Vector(int x, int y)
  {
    this.x = x;
    this.y = y;
  }
}