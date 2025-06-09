package my_project.capitulo7;

public class Ladder {
    private BoardSquare top;

    public Ladder(BoardSquare top, BoardSquare foot) {
        this.top = top;
        foot.addLadder(this);
    }

    public void movePlayerPiece(PlayerPiece counter) {
        System.out.println("Up the ladder to " + top.getPosition());
        counter.setCurrentPosition(top);
    }
}
