package Data;

public class Board {

	private int size;
	private Square[][] board;


	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setBoard() {
		board = new Square[size][size];
		int counter = 0;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				Square square = new Square(++counter, row, col, '0');
				board[row][col] = square;
			}
		}
	}

	public Square[][] getBoard() {
		return board;
	}


}
