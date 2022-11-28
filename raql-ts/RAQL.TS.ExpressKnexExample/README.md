# RAQL.TS Express.js Knex Example

## Run the example

```
node app.js
```

Open your browser to http://localhost:3000 to get  list of items.

You can play around with query q parameters to filter data

examples:

```
http://localhost:3000?q=x=3
http://localhost:3000?q=x>1 and y=2
http://localhost:3000?q=(x > 1 and x < 4) or (y >= 1 and y <=3)
```