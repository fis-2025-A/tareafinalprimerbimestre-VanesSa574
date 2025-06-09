package my_project.capitulo7;

public class Snake {
    private BoardSquare tail;

    public Snake(BoardSquare head, BoardSquare tail) {
        this.tail = tail;
        head.addSnake(this);
    }

    public void movePlayerPiece(PlayerPiece counter) {
        System.out.println("Down the snake to " + tail.getPosition());
        counter.setCurrentPosition(tail);
    }
}


