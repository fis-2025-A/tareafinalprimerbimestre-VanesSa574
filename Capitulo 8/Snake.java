package my_project.capitulo8;

public class Snake extends Mover {
    public Snake(BoardSquare from, BoardSquare to) {
        super(from, to);
    }

    @Override
    public void showMessage() {
        System.out.println("Down the snake to square " + to.getPosition());
    }
}
