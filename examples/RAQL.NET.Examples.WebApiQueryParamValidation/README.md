# RAQL .NET with Linq Example
## Run the example

```bash
  dotnet build RAQL.NET.Examples.WebApiQueryParamValidation.csproj
  dotnet run RAQL.NET.Examples.WebApiQueryParamValidation.csproj
```

Open your browser to http://localhost:7279/api/vectors to get  list of items.

You can play around with query q parameters to filter data

examples:

```
http://localhost:7279/api/vectors?q=x=3
http://localhost:7279/api/vectors?q=x>1 and y=2
http://localhost:7279/api/vectors?q=(x > 1 and x < 4) or (y >= 1 and y <=3)
```