package com.pakjivega.chessplayer

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BoardTest extends AnyFlatSpec with Matchers{
  "The board " should "initialize properly" in {
    Board.initialBoard()

    Board.board(0)(0).getOrElse(new NoPiece()).initial shouldBe  'R'
    Board.board(0)(0).getOrElse(new NoPiece()).color shouldBe  'B'
    Board.board(0)(1).getOrElse(new NoPiece()).initial shouldBe  'N'
    Board.board(0)(1).getOrElse(new NoPiece()).color shouldBe  'B'
    Board.board(0)(2).getOrElse(new NoPiece()).initial shouldBe  'B'
    Board.board(0)(2).getOrElse(new NoPiece()).color shouldBe  'B'
    Board.board(0)(3).getOrElse(new NoPiece()).initial shouldBe  'Q'
    Board.board(0)(3).getOrElse(new NoPiece()).color shouldBe  'B'
    Board.board(0)(4).getOrElse(new NoPiece()).initial shouldBe  'K'
    Board.board(0)(4).getOrElse(new NoPiece()).color shouldBe  'B'

    Board.board(1)(1).getOrElse(new NoPiece()).initial shouldBe  'P'
    Board.board(1)(1).getOrElse(new NoPiece()).color shouldBe  'B'

    Board.board(7)(0).getOrElse(new NoPiece()).initial shouldBe  'R'
    Board.board(7)(0).getOrElse(new NoPiece()).color shouldBe  'N'
    Board.board(7)(4).getOrElse(new NoPiece()).initial shouldBe  'K'
    Board.board(7)(4).getOrElse(new NoPiece()).color shouldBe  'N'

    Board.board(7)(7).getOrElse(new NoPiece()).initial shouldBe  'R'
    Board.board(7)(7).getOrElse(new NoPiece()).color shouldBe  'N'



  }
}
