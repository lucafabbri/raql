<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use App\Models\Vector;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     *
     * @return void
     */
    public function run()
    {
        Vector::truncate();

        for ($i = 0; $i < 50; $i++) {
            Vector::create([
                'x' => rand(0, 50),
                'y' => rand(0, 50),
            ]);
        }
    }
}
