package edu.neumont.csc110.d.tictactoe;

public class Board {
	public final static int CELLS_IN_A_ROW = 3;
	
	public Square[][] squares = new Square[CELLS_IN_A_ROW][CELLS_IN_A_ROW];
	
	public void boardInit() {
		for(int i=0;i<squares.length;i++) {
			for(int j=0;j<squares.length;j++) {
				squares[i][j] = new Square();
				squares[i][j].takenBy = (Square.AVAILABLE);
				System.out.print(squares[i][j].takenBy + " ");
			}
			System.out.println();
		}

	}
	
	public void boardPrint() {
		for(int i=0;i<squares.length;i++) {
			for(int j=0;j<squares.length;j++) {
				System.out.print(squares[i][j].takenBy + " ");
			}
			System.out.println();
		}
	}
	
	public boolean isAvailable(int row, int col) {
		return squares[row][col].isAvailable();
	}
	
	public void takeSquare(Player player, int row, int col) {
		squares[row][col].takenBy = (player.whoAmI);
	}

	public boolean checkWin() {
		//Vertical X
		if(squares[0][0].takenBy == Square.X && squares[0][1].takenBy == Square.X && squares[0][2].takenBy == Square.X) {
			return true;
		}
		else if(squares[1][0].takenBy == Square.X && squares[1][1].takenBy == Square.X && squares[1][2].takenBy == Square.X) {
			return true;
		}
		else if(squares[2][0].takenBy == Square.X && squares[2][1].takenBy == Square.X && squares[2][2].takenBy == Square.X) {
			return true;
		}
		
		//Horizontal X
		if(squares[0][0].takenBy == Square.X && squares[1][0].takenBy == Square.X && squares[2][0].takenBy == Square.X) {
			return true;
		}
		else if(squares[0][1].takenBy == Square.X && squares[1][1].takenBy == Square.X && squares[2][1].takenBy == Square.X) {
			return true;
		}
		else if(squares[0][2].takenBy == Square.X && squares[1][2].takenBy == Square.X && squares[2][2].takenBy == Square.X) {
			return true;
		}
		
		//Diagonal X
		if(squares[0][0].takenBy == Square.X && squares[1][1].takenBy == Square.X && squares[2][2].takenBy == Square.X) {
			return true;
		}
		else if(squares[0][2].takenBy == Square.X && squares[1][1].takenBy == Square.X && squares[2][0].takenBy == Square.X) {
			return true;
		}
		
		
		
		//Vertical O
		if(squares[0][0].takenBy == Square.O && squares[0][1].takenBy == Square.O && squares[0][2].takenBy == Square.O) {
			return true;
		}
		else if(squares[1][0].takenBy == Square.O && squares[1][1].takenBy == Square.O && squares[1][2].takenBy == Square.O) {
			return true;
		}
		else if(squares[2][0].takenBy == Square.O && squares[2][1].takenBy == Square.O && squares[2][2].takenBy == Square.O) {
			return true;
		}
		
		//Horizontal O
		if(squares[0][0].takenBy == Square.O && squares[1][0].takenBy == Square.O && squares[2][0].takenBy == Square.O) {
			return true;
		}
		else if(squares[0][1].takenBy == Square.O && squares[1][1].takenBy == Square.O && squares[2][1].takenBy == Square.O) {
			return true;
		}
		else if(squares[0][2].takenBy == Square.O && squares[1][2].takenBy == Square.O && squares[2][2].takenBy == Square.O) {
			return true;
		}
		
		//Diagonal O
		if(squares[0][0].takenBy == Square.O && squares[1][1].takenBy == Square.O && squares[2][2].takenBy == Square.O) {
			return true;
		}
		else if(squares[0][2].takenBy == Square.O && squares[1][1].takenBy == Square.O && squares[2][0].takenBy == Square.O) {
			return true;
		}
		
		return false;
	}

	
	
	public Boolean checkTie() {
		int test = 0;
		for(int i=0;i<squares.length;i++) {
			for(int j=0;j<squares.length;j++) {
				if(squares[i][j].takenBy == Square.AVAILABLE) {
					test++;
				}
			}
		}
		
		if(test == 9) {
			return false;
		}
		
		return true;
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