package my_project.capitulo8;

public class PlayerPiece {
    private BoardSquare currentPosition;

    public void setCurrentPosition(BoardSquare pos) {
        currentPosition = pos;
    }

    public BoardSquare getCurrentPosition() {
        return currentPosition;
    }
}
