package Entity;

public class Pawn extends Piece{

    public Pawn(String color) {
        super.color = color;
    }

    @Override
    public boolean isMoveValid() {
        return false;
    }
}
