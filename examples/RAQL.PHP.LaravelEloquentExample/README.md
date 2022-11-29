# RAQL.PHP Laravel Eloquent Example

## Run the example
Create an empty Database and change the .env file accordingly

```
DB_CONNECTION=mysql
DB_HOST=127.0.0.1
DB_PORT=3306
DB_DATABASE=here your database name
DB_USERNAME=here database username
DB_PASSWORD=here database password
```
apply migrations to prepare database

```bash
php artisan migrate
php artisan db:seed
php artisan serve
```

Open your browser to http://localhost:8000/api/vectors to get  list of items.

You can play around with query q parameters to filter data

examples:

```
http://localhost:8000/api/vectors?q=x=3
http://localhost:8000/api/vectors?q=x>1 and y=2
http://localhost:8000/api/vectors?q=(x > 1 and x < 4) or (y >= 1 and y <=3)
```