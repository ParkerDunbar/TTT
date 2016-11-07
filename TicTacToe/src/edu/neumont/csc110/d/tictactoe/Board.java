package edu.neumont.csc110.d.tictactoe;

public class Board {
	private Game game;
	public final static int CELLS_IN_A_ROW = 3;
	
	public Square[][] squares = new Square[CELLS_IN_A_ROW][CELLS_IN_A_ROW];
	
	
	public boolean isAvailable(int row, int col) {
		return squares[row][col].isAvailable();
	}
	
	public void takeSquare(Player player, int row, int col) {
		//Game play;
		squares[row][col] = player;
	}
	
	
	
	
	
	
	
	
	
	/*public static void createBoard() {	
		final int rows = 3;
		final int columns = 3;
		Square[][] s = new Square[rows][columns];
	
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				Square[i][j] = s.Square;
			}
		
		}
	}*/
}