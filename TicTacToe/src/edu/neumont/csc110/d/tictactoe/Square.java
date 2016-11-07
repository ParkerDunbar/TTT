package edu.neumont.csc110.d.tictactoe;

public class Square {
	public static final char X = 'X';
	public static final char O = 'O';
	public static final char AVAILABLE = ' ';
	
	public char takenBy;
	
	public boolean isAvailable() {
		if(takenBy == AVAILABLE) {
			return true;
		}
		return false;
	}
}
