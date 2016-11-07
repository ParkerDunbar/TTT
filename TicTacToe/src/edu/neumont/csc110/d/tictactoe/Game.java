package edu.neumont.csc110.d.tictactoe;

import java.io.IOException;

import edu.neumont.csc110.d.consoleio.ConsoleUI;

public class Game {
	
	public Board board = new Board();
	public Player xPlayer = new Player();
	public Player oPlayer = new Player();
	public Player whoseTurnIsIt;
	
	public void play() throws IOException {
		xPlayer.whoAmI = Square.X;
		oPlayer.whoAmI = Square.O;
		whoseTurnIsIt = xPlayer;
		
		
		
		while(true) {
			int row = ConsoleUI.promptForInt("What row?", 0, 2);
			int col = ConsoleUI.promptForInt("What col?", 0, 2);
			if(!board.isAvailable(row, col)) {
				board.takeSquare(whoseTurnIsIt, row, col);
			}
		}
	}


}
