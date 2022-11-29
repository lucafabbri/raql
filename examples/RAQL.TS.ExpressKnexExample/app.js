const express = require('express');
const { RAQLKnex } = require('@higrow/raql.js');
const database = RAQLKnex({
  client: 'sqlite3',
  connection: {
    filename: "vectors.db"
  },
});

const app = express()
const port = 3000

app.get('/api/vectors', async (req, res) => {
  let query = req.query.q;
  console.log(query)
  res.json(await database('vectors').raql(query));
})

app.listen(port, () => {
  console.log(`Example app listening on address:port http://localhost:${port}/api/vectors?q=x=3`)
})