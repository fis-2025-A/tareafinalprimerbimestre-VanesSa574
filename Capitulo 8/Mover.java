package my_project.capitulo8;

public abstract class Mover {
    protected BoardSquare from;
    protected BoardSquare to;

    public Mover(BoardSquare from, BoardSquare to) {
        this.from = from;
        this.to = to;
        from.setMover(this);
    }

    public abstract void showMessage();

    public void movePlayerPiece(PlayerPiece piece) {
        showMessage();
        piece.setCurrentPosition(to);
    }
}
