package my_project.capitulo7;

public class SnakesAndLadders {
    private GameBoard board;

    public SnakesAndLadders() {
        board = new GameBoard();
    }

    public void play() {
        PlayerPiece red = new PlayerPiece("Red");
        PlayerPiece blue = new PlayerPiece("Blue");

        red.setCurrentPosition(board.getStartSquare());
        blue.setCurrentPosition(board.getStartSquare());

        boolean redFinished = false;
        boolean blueFinished = false;

        while (!redFinished && !blueFinished) {
            board.movePlayerPiece(red);
            redFinished = red.getCurrentPosition().getPosition() == 100;
            if (redFinished) {
                System.out.println("¡Red gana!");
                break;
            }

            board.movePlayerPiece(blue);
            blueFinished = blue.getCurrentPosition().getPosition() == 100;
            if (blueFinished) {
                System.out.println("¡Blue gana!");
            }
        }
    }

    public static void main(String[] args) {
        SnakesAndLadders game = new SnakesAndLadders();
        game.play();
    }
}

