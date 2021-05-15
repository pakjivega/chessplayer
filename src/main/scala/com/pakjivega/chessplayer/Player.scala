package com.pakjivega.chessplayer

object Player {
  val board = Array.ofDim[Piece](8,8)
  def main(args: Array[String]): Unit = {
    emptyBoard()
    showboard()
    println("Hello, world!")
  }
  def hello(): String = {
    "Hello, world!"
  }

  def emptyBoard()={
    for ( i <- 0 to 7) {
      for ( j <- 0 to 7) {
        board(i)(j) = new Pawn()
      }
    }
  }

  def showboard() = {
    for ( i <- 0 to 7) {
      for ( j <- 0 to 7) {
        print( board(i)(j).Initial)
      }
      println()
    }
  }
}
