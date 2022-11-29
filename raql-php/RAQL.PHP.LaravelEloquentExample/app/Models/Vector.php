<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use RAQL\PHP\Eloquent\RAQLTrait;

class Vector extends Model
{
    use HasFactory;
    use RAQLTrait;
    public $fillable = [
        'x',
        'y',
    ];
}
