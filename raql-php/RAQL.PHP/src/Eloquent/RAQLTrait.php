<?php 
namespace RAQL\PHP\Eloquent;

use RAQL\PHP\Eloquent\RAQLBuilder;

trait RAQLTrait
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