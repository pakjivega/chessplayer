package com.pakjivega.chessplayer

sealed abstract class Piece(val Initial: Char, val Value:Int, val color: Char = 'N') {

}

class Pawn   extends Piece(Initial = 'P', Value = 1  ) {}
class Bishop extends Piece(Initial = 'B', Value = 3  ) {}
class Knight extends Piece(Initial = 'N', Value = 3  ) {}
class Rook   extends Piece(Initial = 'R', Value = 5  ) {}
class Queen  extends Piece(Initial = 'Q', Value = 9  ) {}
class King   extends Piece(Initial = 'K', Value = 999) {}

