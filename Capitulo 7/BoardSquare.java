package my_project.capitulo7;

public class BoardSquare {
    private Snake aSnake = null;
    private Ladder aLadder = null;
    private int position;

    public BoardSquare(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void addSnake(Snake s) {
        aSnake = s;
    }

    public void addLadder(Ladder l) {
        aLadder = l;
    }

    public void movePlayerPiece(PlayerPiece counter) {
        counter.setCurrentPosition(this);
        if (aSnake != null) aSnake.movePlayerPiece(counter);
        if (aLadder != null) aLadder.movePlayerPiece(counter);
    }
}

