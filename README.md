# RAQL
## Rest Api Query Language

RAQL is a SQL-Like Query Language for Rest Api dedicated to querying Rest Api Endpoints that outputs List of Results.

## Yet another query language
WHy RAQL when you have GraphQL? Because Graph QL not only queries data, but also requires you to specificy which fields you want to get. 
This requires a big payload using POST even if you want to filter one field. Secondly GraphQL approach it is perfect for querying different sources at once, 
but quite often you just need to provide your Rest Api consumers the ability to filter data and get the usual Data Transfer Object.

## Server side implementations

| name     | version | supports                           | language   | repo                                      |
|----------|---------|------------------------------------|------------|-------------------------------------------|
| RAQL.NET |  1.0.0  | - Asp.Net - Linq - EntityFramework | C#         | https://github.com/lucafabbri/raql-dotnet |
| RAQL.PHP |  1.0.0  | - Laravel - Eloquent               | PHP        | https://github.com/lucafabbri/raql-php    |
| RAQL.JS  |  1.0.0  | - Node - Express.js - Knex.js      | Javascript | https://github.com/lucafabbri/raql-js     |

## Quick start
### Specification
RAQL base unit is called Operation, which is a simple structure that requires a field, an operator and a value. 
```
x > 3
name like 'Luca'
field != true
```
Operations can be link together with classic QL where operator AND, OR, two operations linked in this way is called Clause. 
```
x > 3 and y = 5
name like 'Luca' and age > 20
field != true and branch = 'master'
```
Clauses can be wrapped with optional parentesis
```
(x > 3 and y = 5)
(name like 'Luca' and age > 20)
(field != true and branch = 'master')
```
Clauses can be linked with QL where operator as well and uses parentesis is possible to nest properly the query
```
(x > 3 and y = 5) or x = 100
(name like 'Luca' and age > 20) or (name = null)
field != true and (branch = 'master' or branch = 'dev')
```
