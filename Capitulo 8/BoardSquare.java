package my_project.capitulo8;

public class BoardSquare {
    private Mover mover;
    private int position;

    public BoardSquare(int position) {
        this.position = position;
    }

    public void setMover(Mover m) {
        this.mover = m;
    }

    public void movePlayerPiece(PlayerPiece p) {
        p.setCurrentPosition(this);
        if (mover != null) mover.movePlayerPiece(p);
    }

    public int getPosition() {
        return position;
    }
}

