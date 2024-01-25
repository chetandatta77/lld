package Entity;

public class Board {
    private Cell[][] cells = new Cell[8][8];

    public void initialize(){

        for(int k=0; k<8; k++){
            Piece pawn = new Pawn("black");
            Cell cell = new Cell(pawn, 1, k)
            cells[1][k] = cell;
        }

        for(int k=0; k<8; k++){
            Piece pawn = new Pawn("black");
            Cell cell = new Cell(pawn, 1, k)
            cells[6][k] = cell;
        }
    }
}
