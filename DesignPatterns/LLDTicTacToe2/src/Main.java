import Model.Symbol;

public class Main {

    public static void main(String[] args) {
        GameController gameController = new GameController(3, Symbol.X, Symbol.O);
        gameController.startGame();
    }

}
