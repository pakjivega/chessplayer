package com.pakjivega.chessplayer

sealed abstract class Piece(val initial: Char, val value:Int, val color: Char = 'N' ) {


  override def toString = s"$initial"
}

class Pawn(color:Char )     extends Piece(initial = 'P', value = 1,   color ) {}
class Bishop(color:Char )   extends Piece(initial = 'B', value = 3,   color ) {}
class Knight(color:Char )   extends Piece(initial = 'N', value = 3,   color ) {}
class Rook(color:Char )     extends Piece(initial = 'R', value = 5,   color ) {}
class Queen(color:Char )    extends Piece(initial = 'Q', value = 9,   color ) {}
class King(color:Char )     extends Piece(initial = 'K', value = 999, color ) {}

class NoPiece( )     extends Piece(initial = '_', value = 0 ) {}

