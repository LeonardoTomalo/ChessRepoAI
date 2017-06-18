package main;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import chesspresso.Chess;
import chesspresso.move.Move;

public class TestChess extends Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// \n
		
		ChesspressoGameBrowser chessFrame = new ChesspressoGameBrowser();
        chessFrame.setVisible(true);
        System.out.println(" *****************************************************");
        System.out.println(" ********** PRUEBA POR CONSOLA *********** \n");
        /*
        int fromn,ton;
        String from = "";
        String to = "Chess.";
        Scanner moveFrom = new Scanner(System.in);
        Scanner moveTo = new Scanner(System.in);
		System.out.println("Ingrese Posicion de Pieza a Mover (ejem: E2):\n " + moveFrom.nextLine());
        from = from + moveFrom;
		System.out.println("Ingrese Posicion de Pieza a donde Mover (ejem: E4): " + moveTo.nextLine());
        to = to + moveTo;
      
        //chessFrame.addMove(moveFrom,moveTo,false, "prueba1");
        
        // tengo que usar el metodo strToSqi pa ver que me retorna
        
        Chess.strToSqi(from);
        System.out.println(Chess.strToSqi(from));
		System.out.println("lo que me devuelve ksjbdkasj"+from);
		  */
		String s1="", s2="";
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese pisicion de pieza a mover: ");
        s1 = in.next();
        System.out.println("Movera la pieza: " + s1 + " a donde.? : ");
        s2 = in.next();
        System.out.println(s1 + " "+ s2);
        //short ss = s1;
        //Short ss = "Chess."+s1;
        ;
        //coorToSqi(0, 2);
        
        int from = strToSqi(s1);
        int to = strToSqi(s2);
        
        
        System.out.println("move: " + from + " to:  "+ to);
        chessFrame.addMove(from,to,false, "prueba1");
        
	}

}
