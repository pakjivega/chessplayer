package com.pakjivega.chessplayer

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import com.pakjivega.chessplayer.Bishop

class PiecesTest extends AnyFlatSpec with Matchers{

  "The bishop " should "values more than pawn" in {
    val bishop = new Bishop(color = 'B')
    val pawn = new Pawn(color = 'B')
    bishop.Value should be > pawn.Value
  }

}
