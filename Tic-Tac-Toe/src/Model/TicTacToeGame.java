package Model;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

	Deque<Player> players;
	Board gameBoard;
	TicTacToeGame(){
		intializeGame();
	}
	
	public void intializeGame() {
		players=new LinkedList<>();
		PlayingPieceX crossPiece=new PlayingPieceX();
		Player player1=new Player("Player1",crossPiece);
		PlayingPieceO notPiece=new PlayingPieceO();
		Player player2=new Player("Player2",notPiece);
		
		players.add(player1);
		players.add(player2);
		gameBoard=new Board(3);
		
	}
	
	public String startGame() {
		boolean noWinner =true;
		
		while(noWinner) {
			
			Player playerTurn=players.removeFirst();
			
			gameBoard.printBoard();
			List<int[]> freeSpaces=gameBoard.getFreeCells();
			if(freeSpaces.isEmpty()) {
				noWinner=false;
				continue;
			}
			System.out.print("Player:" + playerTurn.playerName + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn, playerTurn.piece);
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
           // freeSpaces.removeFirst();
            //System.out.println(freeSpaces);
            players.addLast(playerTurn);
            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.piece.type);
            if(winner) {
            	return playerTurn.playerName;
            }
		}
		return "tie";

        }

	private boolean isThereWinner(int row, int column, PieceType pieceType) {
		// TODO Auto-generated method stub
		boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;


        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].type != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].type != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

	}
	
	}
