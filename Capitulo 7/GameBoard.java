package my_project.capitulo7;

public class GameBoard {
    private BoardSquare[] squares;
    private Die die = new Die();
    public static final int MAX_SQUARES = 100;

    public GameBoard() {
        squares = new BoardSquare[MAX_SQUARES + 1];
        for (int i = 1; i <= MAX_SQUARES; i++) {
            squares[i] = new BoardSquare(i);
        }
        // Agregar escaleras
        new Ladder(squares[38], squares[1]);
        new Ladder(squares[14], squares[4]);
        // ... puedes agregar más

        // Agregar serpientes
        new Snake(squares[16], squares[6]);
        new Snake(squares[47], squares[26]);
        // ... puedes agregar más
    }

    public BoardSquare getStartSquare() {
        return squares[1];
    }

    public void movePlayerPiece(PlayerPiece counter) {
        int next = counter.getCurrentPosition().getPosition() + die.roll();
        if (next > MAX_SQUARES) {
            System.out.println("¡" + counter.getColor() + " necesita caer exacto!");
        } else {
            counter.moveTo(squares[next]);
        }
        System.out.println(counter.getColor() + " en " + counter.getCurrentPosition().getPosition());
    }
}

