const express = require('express');
const { RAQLKnex } = require('raql.ts');
const database = RAQLKnex({
  client: 'sqlite3',
  connection: {
    filename: "vectors.db"
  },
});

const app = express()
const port = 3000

app.get('/', async (req, res) => {
  let query = req.query.q;

  res.json(await database('vectors').raql(query));
})

app.listen(port, () => {
  console.log(`Example app listening on address:port http://localhost:${port}`)
})