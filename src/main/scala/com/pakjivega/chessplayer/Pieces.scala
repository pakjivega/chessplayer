package com.pakjivega.chessplayer

sealed abstract class Piece(val Initial: Char, val Value:Int) {

}

class Pawn extends Piece('P', 1){}
class Bishop extends Piece('B',3)  {}
class Knight extends Piece('N',3)  {}
class Rook extends Piece('R',5)  {}
class Queen extends Piece('Q',9)  {}
class King extends Piece('K',999)  {}

