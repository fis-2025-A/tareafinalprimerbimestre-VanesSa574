package my_project.capitulo8;

public class Ladder extends Mover {
    public Ladder(BoardSquare from, BoardSquare to) {
        super(from, to);
    }

    @Override
    public void showMessage() {
        System.out.println("Up the ladder to square " + to.getPosition());
    }
}
