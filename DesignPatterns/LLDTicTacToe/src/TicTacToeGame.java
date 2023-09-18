import Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame(){
        players = new LinkedList<>();

        //creating players
        PlayingPieceX crossPiece = new PlayingPieceX(PieceType.X);
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO(PieceType.O);
        Player player2 = new Player("Player2", noughtsPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while (noWinner){

            //take out the next player
            Player playerTurn = players.removeFirst();

            //print board
            gameBoard.printBoard();

            //get the free spaces
            List<List<Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            //get the input from the user
            System.out.print("Player:" + playerTurn.name + "Enter row, column:");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            //place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn,playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                System.out.println("Incorrect position chosen, try again");
                players.add(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if (winner){
                return playerTurn.name;
            }
        }
        return "tie";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //checking for row Match
        for (int i =0; i<gameBoard.size; i++){
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType)
                rowMatch = false;
        }

        //checking the column Match
        for (int i =0; i<gameBoard.size; i++){
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType)
                columnMatch = false;
        }

        //checking the diagonal Match
        for (int i =0, j=0; i<gameBoard.size; i++, j++){
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType)
                diagonalMatch = false;
        }

        //checking the anti diagonal Match
        for (int i =0, j=gameBoard.size-1; i<gameBoard.size; i++, j--){
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType)
                antiDiagonalMatch = false;
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
