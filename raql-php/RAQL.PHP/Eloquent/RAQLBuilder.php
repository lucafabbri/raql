<?php

use Illuminate\Database\Query\Builder;

class RAQLBuilder extends Builder
{

  /**
   * Create a new Eloquent query builder instance with RAQL support.
   *
   * @param  \Illuminate\Database\Query\Builder  $query
   * @return void
   */
  public function __construct(Builder $query)
  {
    $this->query = $query;
  }

  /**
   * Build the Eloquent query from RAQL
   * 
   * @param string $query
   * @return $this
   */
  public function raql(string $query){
    if(!empty($query)){
      //call visitor
    }
    return $this;
  }
}