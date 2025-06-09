package my_project.capitulo7;

public class PlayerPiece {
    private String color;
    private BoardSquare currentPosition;

    public PlayerPiece(String color) {
        this.color = color;
    }

    public void moveTo(BoardSquare square) {
        setCurrentPosition(square);
        square.movePlayerPiece(this);
    }

    public String getColor() {
        return color;
    }

    public BoardSquare getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(BoardSquare square) {
        this.currentPosition = square;
    }
}

