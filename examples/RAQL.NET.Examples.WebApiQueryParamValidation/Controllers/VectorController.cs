using Microsoft.AspNetCore.Mvc;
using RAQL.NET.AspNetCore;
using RAQL.NET.Linq;
using RAQL.NET.Models;

namespace RAQL.NET.Examples.WebApiQueryParamValidation.Controllers
{
  [ApiController]
  [Route("api/vectors")]
  public class VectorController : ControllerBase
  {
    [HttpGet]
    public ActionResult<IEnumerable<Vector>> QueryVectors([FromQuery] RaqlQuery q)
    {
      IEnumerable<Vector> vectors = new List<Vector>()
            {
                new Vector(1,2),
                new Vector(2,1),
                new Vector(3,1),
                new Vector(3,2),
                new Vector(2,4),
                new Vector(6,3)
            };

      return Ok(vectors.AsQueryable().Raql(q).ToList());
    }
  }

  public class Vector
  {
    public int x { get; set; }
    public int y { get; set; }

    public Vector(int x, int y)
    {
      this.x = x;
      this.y = y;
    }
  }
}
