package com.pakjivega.chessplayer

object Board {

  val board = Array.ofDim[Option[Piece]](8,8)

  def initialBoard()={
    var i = 0
    board(i)(0) = Some(new Rook(color = 'B'))
    board(i)(1) = Some(new Knight(color = 'B'))
    board(i)(2) = Some(new Bishop(color = 'B'))
    board(i)(3) = Some(new Queen(color = 'B'))
    board(i)(4) = Some(new King(color = 'B'))
    board(i)(5) = Some(new Bishop(color = 'B'))
    board(i)(6) = Some(new Knight(color = 'B'))
    board(i)(7) = Some(new Rook(color = 'B'))

    i = 1
    for ( j <- 0 to 7) {
      board(i)(j) = Some(new Pawn(color = 'B'))
    }

    for ( i <- 2 to 5) {
      for ( j <- 0 to 7) {
        board(i)(j) = Some(new NoPiece())
      }
    }
    i = 6
    for ( j <- 0 to 7) {
      board(i)(j) = Some(new Pawn(color = 'N'))
    }
    i = 7
    board(i)(0) = Some(new Rook(color = 'N'))
    board(i)(1) = Some(new Knight(color = 'N'))
    board(i)(2) = Some(new Bishop(color = 'N'))
    board(i)(3) = Some(new Queen(color = 'N'))
    board(i)(4) = Some(new King(color = 'N'))
    board(i)(5) = Some(new Bishop(color = 'N'))
    board(i)(6) = Some(new Knight(color = 'N'))
    board(i)(7) = Some(new Rook(color = 'N'))
  }

  def showboard() = {
    for ( i <- 0 to 7) {
      for ( j <- 0 to 7) {
        val piece = board(i)(j).getOrElse(new NoPiece())
        print( (if (piece.color.equals('B'))  scala.Console.BLUE else Console.RED ) + piece.Initial)
      }
      println()
    }
  }
}
