package com.pakjivega.chessplayer

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PlayerTest extends AnyFlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Player.hello shouldEqual "Hello, world!"
  }
}
