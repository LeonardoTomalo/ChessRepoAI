package main;

import javax.swing.JFrame;

import chesspresso.Chess;
import chesspresso.game.Game;
import chesspresso.game.view.GameBrowser;
import chesspresso.move.IllegalMoveException;
import chesspresso.move.Move;

public class ChesspressoGameBrowser extends JFrame {
	 
	 private Game chessGame = new Game();
	 private GameBrowser gameBrowser = new GameBrowser(chessGame);
	 private static final long serialVersionUID = -6856238414376776882L;
	 
	 public ChesspressoGameBrowser() {
	  setTitle("Chesspresso  test");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	  add(gameBrowser);
	  pack();
	 
	  addMove(Chess.E2, Chess.E4, false, "Controlando el centro");
	  addMove(Chess.E7, Chess.E5, false, "Clasica respuesta");
	   
	  addMove(Chess.G1, Chess.F3, false, null);
	  addMove(Chess.B8, Chess.C6, false, null);
	   
	  addMove(Chess.F1, Chess.B5, false, "Apertura Ruy Lopez");
	  addMove(Chess.A7, Chess.A6, false, null);
	 }
	 
	 private void addMove(int fromSquareIndex, int toSquareIndex, boolean isCapturingMove, String comment) {
	  try {
	   short move = Move.getRegularMove(fromSquareIndex, toSquareIndex, isCapturingMove);
	   if (Move.isValid(move)) {
	    chessGame.getPosition().doMove(move);
	    if (comment != null && comment.length() > 0)
	     chessGame.addComment(comment);
	   }
	  } catch (IllegalMoveException e) {
	   e.printStackTrace();
	  }
	 }
	 
	 
	}

