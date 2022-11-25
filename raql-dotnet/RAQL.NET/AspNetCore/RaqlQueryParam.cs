using RAQL.NET.Models;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RAQL.NET.AspNetCore
{
    public class RaqlQueryParam : IValidatableObject
    {
        string message = "";
        public RaqlQuery? Query { get; private set; } = null;

        public RaqlQueryParam(string query)
        {
            try
            {
                Query = new RaqlQuery(query);
            }
            catch(Exception e)
            {
                message = e.Message;
                Debug.WriteLine(e);
            }
        }

        public static implicit operator RaqlQueryParam(string query)
        {
            return new RaqlQueryParam(query);
        }

        public static implicit operator RaqlQuery?(RaqlQueryParam param)
        {
            return param?.Query;
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        {
            if (Query == null)
            {
                yield return new ValidationResult(message, new[] { nameof(Query) });
            }
        }
    }
}
