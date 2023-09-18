package Model;

public class Board {
    private Symbol[][] board;

    private int size;


    public Board(int size) {
        this.size = size;
        this.board = new Symbol[size][size];
    }

    public void printBoard(){
        for (int i=0; i< board.length; i++){
            for (int j=0; j< board.length; j++){
                if (board[i][j]!=null){
                    System.out.print(board[i][j]);
                }
                System.out.print(" |");
            }
            System.out.println();
        }
    }

    public boolean placeTheSymbol(int row, int col, Symbol symbol){
        if(row>=size || col>=size) return false;
        if (board[row][col]==null){
            board[row][col] =symbol;
            return true;
        }
        return false;
    }

    public boolean isFullyOccupied(){
        for (Symbol[] symbols : board) {
            for (int j = 0; j < board.length; j++) {
                if (symbols[j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    public Symbol getSymbol(int row, int col){
        return board[row][col];
    }
}
