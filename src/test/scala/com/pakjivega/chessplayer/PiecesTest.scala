package com.pakjivega.chessplayer

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import com.pakjivega.chessplayer.Bishop

class PiecesTest extends AnyFlatSpec with Matchers{

  "The bishop " should "values more than pawn" in {
    val bishop = new Bishop
    val pawn = new Pawn
    bishop.Value should be > pawn.Value
  }

}
