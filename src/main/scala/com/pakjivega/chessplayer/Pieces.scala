package com.pakjivega.chessplayer

sealed abstract class Piece(val Initial: Char, val Value:Int, val color: Char = 'N' ) {


  override def toString = s"$Initial"
}

class Pawn(color:Char )     extends Piece(Initial = 'P', Value = 1,   color ) {}
class Bishop(color:Char )   extends Piece(Initial = 'B', Value = 3,   color ) {}
class Knight(color:Char )   extends Piece(Initial = 'N', Value = 3,   color ) {}
class Rook(color:Char )     extends Piece(Initial = 'R', Value = 5,   color ) {}
class Queen(color:Char )    extends Piece(Initial = 'Q', Value = 9,   color ) {}
class King(color:Char )     extends Piece(Initial = 'K', Value = 999, color ) {}

class NoPiece( )     extends Piece(Initial = '_', Value = 0 ) {}

