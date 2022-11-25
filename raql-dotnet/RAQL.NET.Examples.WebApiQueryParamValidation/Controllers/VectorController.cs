using Microsoft.AspNetCore.Mvc;
using RAQL.NET.AspNetCore;
using RAQL.NET.Linq;

namespace RAQL.NET.Examples.WebApiQueryParamValidation.Controllers
{
    [ApiController]
    [Route("api/vector")]
    public class VectorController : ControllerBase
    {
        [HttpGet]
        public ActionResult<IEnumerable<Vector>> QueryVectors([FromQuery] string q)
        {
            RaqlQueryParam query = q;

            IEnumerable<Vector> vectors = new List<Vector>()
            {
                new Vector(1,2),
                new Vector(2,1),
                new Vector(3,1),
                new Vector(3,2),
                new Vector(2,4),
                new Vector(6,3)
            };
            if(query.Query == null)
            {
                return BadRequest(query);
            }
            return Ok(vectors.AsQueryable().Raql(query).ToList());
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
