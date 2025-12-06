package Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
  int size;
  PlayingPiece[][] board;
public Board(int size) {
	this.size = size;
	board=new PlayingPiece[size][size];
	//this.board = board;
}


public boolean addPiece(int row,int column,PlayingPiece Piece) {
	if(board[row][column]!=null) {
		return false;
	}
	//freeCells.remove(new int[] {row,column});
	board[row][column]=Piece;
	return true;
}

public List<int[]> getFreeCells(){
	List<int[]> freeCells=new ArrayList<>();
	
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			if(board[i][j]==null) {
			freeCells.add(new int[]{i,j});
			}
		}
	}
	return freeCells;
}
public void printBoard() {

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (board[i][j] != null) {
               System.out.print(board[i][j].type.name() + "   ");
            } else {
                System.out.print("    ");

            }
            System.out.print(" | ");
        }
        System.out.println();

    }
}

  
}
