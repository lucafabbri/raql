<?php

use Illuminate\Database\Eloquent\Model;

class RAQLModel extends Model
{

  /**
   * Create a new Eloquent query builder for the model with RAQL support.
   *
   * @param  \Illuminate\Database\Query\Builder  $query
   * @return \RAQL\PHP\RAQLBuilder|static
   */
  public function newEloquentBuilder($query)
  {
    return new RAQLBuilder($query);
  }
}