package main;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import chesspresso.Chess;

public class TestChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChesspressoGameBrowser chessFrame = new ChesspressoGameBrowser();
        chessFrame.setVisible(true);
        System.out.println(" *****************************************************");
        System.out.println(" ********** PRUEBA POR CONSOLA ***********");
        int fromn,ton;
        String from = "";
        String to = "Chess.";
        Scanner moveFrom = new Scanner(System.in);
        Scanner moveTo = new Scanner(System.in);
		System.out.println("Ingrese Posicion de Pieza a Mover (ejem: E2): " + moveFrom.nextLine());
        from = from + moveFrom;
		System.out.println("Ingrese Posicion de Pieza a donde Mover (ejem: E4): " + moveTo.nextLine());
        to = to + moveTo;
        
        //chessFrame.addMove(moveFrom,moveTo,false, "prueba1");
        
        // tengo que usar el metodo strToSqi pa ver que me retorna
        
        Chess.strToSqi(from);
        System.out.println(Chess.strToSqi(from));
		System.out.println("lo que me devuelve ksjbdkasj"+from);
	}

}
