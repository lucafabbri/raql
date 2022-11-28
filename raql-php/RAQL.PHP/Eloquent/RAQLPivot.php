<?php

use Illuminate\Database\Eloquent\Relations\Concerns\AsPivot;

class RAQLPivot extends RAQLModel
{
  use AsPivot;

  /**
   * Indicates if the IDs are auto-incrementing.
   *
   * @var bool
   */
  public $incrementing = false;

  /**
   * The attributes that aren't mass assignable.
   *
   * @var array
   */
  protected $guarded = [];
}