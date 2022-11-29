<?php

namespace RAQL\PHP\Eloquent;

use Illuminate\Database\Eloquent\Builder;
use Antlr\Antlr4\Runtime\InputStream;
use Antlr\Antlr4\Runtime\CommonTokenStream;
use Antlr\Antlr4\Runtime\Error\Listeners\ANTLRErrorListener;
use RAQL\PHP\Grammar\RAQLLexer;
use RAQL\PHP\Grammar\RAQLParser;
use RAQL\PHP\Visitors\EloquentVisitor;
use Antlr\Antlr4\Runtime\Atn\ATNConfigSet;
use Antlr\Antlr4\Runtime\Dfa\DFA;
use Antlr\Antlr4\Runtime\Error\Exceptions\RecognitionException;
use Antlr\Antlr4\Runtime\Parser;
use Antlr\Antlr4\Runtime\Recognizer;
use Antlr\Antlr4\Runtime\Utils\BitSet;

class RAQLBuilder extends Builder implements ANTLRErrorListener
{
  private $valid = true;
  private $errorMessage;
  /**
   * Create a new Eloquent query builder instance with RAQL support.
   *
   * @param  \Illuminate\Database\Query\Builder  $query
   * @return void
   */
  public function __construct($query)
  {
    $this->query = $query;
  }

  /**
   * Build the Eloquent query from RAQL
   * 
   * @param string $query
   * @return $this
   */
  public function raql(string $query)
  {
    if (!empty($query)) {

      $input = InputStream::fromString($query);
      $lexer = new RAQLLexer($input);
      $tokens = new CommonTokenStream($lexer);
      $parser = new RAQLParser($tokens);
      $parser->addErrorListener($this);
      $tree = $parser->raql();
      if ($this->valid) {
        return (new EloquentVisitor())->visitClause($tree->clause(), $this);
      }
    }
    return $this;
  }
  public function syntaxError(
    Recognizer $recognizer,
    ?object $offendingSymbol,
    int $line,
    int $charPositionInLine,
    string $msg,
    ?RecognitionException $e
  ): void {
    $this->valid = false;
    $this->errorMessage = "The provided query in not well formed. line: " + $line + ", position: " + $charPositionInLine + ".\n" + $msg;
  }

  public function reportAmbiguity(
    Parser $recognizer,
    DFA $dfa,
    int $startIndex,
    int $stopIndex,
    bool $exact,
    ?BitSet $ambigAlts,
    ATNConfigSet $configs
  ): void {
  }

  public function reportAttemptingFullContext(
    Parser $recognizer,
    DFA $dfa,
    int $startIndex,
    int $stopIndex,
    ?BitSet $conflictingAlts,
    ATNConfigSet $configs
  ): void {
  }

  public function reportContextSensitivity(
    Parser $recognizer,
    DFA $dfa,
    int $startIndex,
    int $stopIndex,
    int $prediction,
    ATNConfigSet $configs
  ): void {
  }
}
