import Model.Board;
import Model.Player;
import Model.Symbol;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class GameController {

    Deque<Player> playerDeque;
    Board board;

    public GameController(int size, Symbol firstPlayerSymbol, Symbol SecondPlayerSymbol){
        this.board = new Board(size);
        Player player1 = new Player(firstPlayerSymbol);
        Player player2 = new Player(SecondPlayerSymbol);

        playerDeque = new LinkedList<>();
        playerDeque.add(player1);
        playerDeque.add(player2);
    }

    public void startGame(){
        boolean anyWinner = false;
        Player currPlayer = new Player(Symbol.X);
        while (!anyWinner){
            if (board.isFullyOccupied()){
                System.out.println("Its a tie");
                return;
            }
            currPlayer = playerDeque.removeFirst();
            board.printBoard();
            System.out.println("Enter row and column (row,col) - ");
            Scanner inputScanner = new Scanner(System.in);
            String userInputString = inputScanner.nextLine();
            String[] values = userInputString.split(",");
            int row = Integer.parseInt(values[0]);
            int col = Integer.parseInt(values[1]);

            boolean isPlaced = board.placeTheSymbol(row, col, currPlayer.getSymbol());
            if (!isPlaced){
                System.out.println("Enter a valid row and column");
                playerDeque.addFirst(currPlayer);
                continue;
            }

            if (winnerLogic(row, col, currPlayer.getSymbol())){
                anyWinner = true;
                board.printBoard();
                System.out.println("Player "+ currPlayer.getSymbol()+" is the winner");
            }
            playerDeque.addLast(currPlayer);
        }

    }

    private boolean winnerLogic(int row, int col, Symbol symbol) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //row match
        for (int i=0; i<board.getSize();i++){
            if (board.getSymbol(row,i)==null || board.getSymbol(row,i)!=symbol){
                rowMatch =false;
                break;
            }
        }

        //col match
        for (int i=0; i<board.getSize();i++){
            if (board.getSymbol(i,col)==null || board.getSymbol(i,col)!=symbol){
                columnMatch =false;
                break;
            }
        }

        //Diagonal match
        for (int i=0,j=0; i<board.getSize();i++,j++){
            if (board.getSymbol(i,j)==null || board.getSymbol(i,j)!=symbol){
                diagonalMatch =false;
                break;
            }
        }

        //Anti Diagonal match
        for (int i=0,j= board.getSize()-1; i<board.getSize();i++,j--){
            if (board.getSymbol(i,j)==null || board.getSymbol(i,j)!=symbol){
                antiDiagonalMatch =false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
