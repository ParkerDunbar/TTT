package edu.neumont.csc110.d.tictactoe;

import java.io.IOException;

import edu.neumont.csc110.d.consoleio.ConsoleUI;

public class Game {
	
	public Board board = new Board();
	public Player xPlayer = new Player();
	public Player oPlayer = new Player();
	public Player playerChange = new Player();
	public Player whoseTurnIsIt;
	public Boolean validSpace;
	public Boolean ifWin;

	
	public void play() throws IOException {
		xPlayer.whoAmI = Square.X;
		oPlayer.whoAmI = Square.O;
		whoseTurnIsIt = xPlayer;
		board.boardInit();

		 do {
			 
			int row = ConsoleUI.promptForInt("What row?", 0, 2);
			int col = ConsoleUI.promptForInt("What col?", 0, 2);
			
			do {
				if(board.isAvailable(row, col)) {
					board.takeSquare(whoseTurnIsIt, row, col);
					validSpace = true;
				}
				else {
					board.boardPrint();
					System.out.println("That space is already taken. Please choose another one.");
					row = ConsoleUI.promptForInt("What row?", 0, 2);
					col = ConsoleUI.promptForInt("What col?", 0, 2);
					validSpace = false;
				}
			}while(validSpace == false);
			
			board.boardPrint();
			ifWin = board.checkWin();

			
			if(whoseTurnIsIt == xPlayer) {
				whoseTurnIsIt = oPlayer;
			}
			else if(whoseTurnIsIt == oPlayer) {
				whoseTurnIsIt = xPlayer;
			}
			

		} while(ifWin == false);
		 if(ifWin = true) {
			 System.out.println("Winner!");
				if(whoseTurnIsIt == xPlayer) {
					whoseTurnIsIt = oPlayer;
				}
				else if(whoseTurnIsIt == oPlayer) {
					whoseTurnIsIt = xPlayer;
				}
			 System.out.println("Player " + whoseTurnIsIt.whoAmI);
			 
		 }
	}


}
