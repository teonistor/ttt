package io.github.teonistor.ttt

class GameOverChecker {

  private val transformations = LazyList(curry(line), curry(column), curry(diagonalUp), curry(diagonalDown))
//    private val transformations = LazyList[(Int,Int) => Set[(Int,Int)]](line, column, diagonalUp, diagonalDown).map(curry)

  def check(state: GameState): Option[Player] = {

    val xWins = sass(state.xs)
    val oWins = sass(state.os)


    if (xWins) Option(Player.X)
    else if (oWins) Option(Player.O)
    else Option.empty
  }

  private def sass(coords: Set[(Int, Int)]) = {
    transformations.flatMap(transformation => coords.map(transformation))
      .map(_ & coords)
      .exists(_.size == 5)
  }

  private def curry(fun: (Int, Int) => Set[(Int, Int)]): ((Int, Int)) => Set[(Int, Int)] = pair => fun(pair._1, pair._2)

  private def line(i: Int, j: Int) = Set((i, j), (i, j + 1), (i, j + 2), (i, j + 3), (i, j + 4))

  private def column(i: Int, j: Int) = Set((i, j), (i + 1, j), (i + 2, j), (i + 3, j), (i + 4, j))

  private def diagonalUp(i: Int, j: Int) = Set((i, j), (i - 1, j + 1), (i - 2, j + 2), (i - 3, j + 3), (i - 4, j + 4))

  private def diagonalDown(i: Int, j: Int) = Set((i, j), (i + 1, j + 1), (i + 2, j + 2), (i + 3, j + 3), (i + 4, j + 4))
}
