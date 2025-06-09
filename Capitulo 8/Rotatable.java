package my_project.capitulo8;

public interface Rotatable {
    void rotate(); // rota 90° sentido horario

    default void rotate180() {
        rotate();
        rotate();
    }

    default void rotateCounterClockwise() {
        rotate();
        rotate();
        rotate(); // rotar 270° horario = 90° antihorario
    }
}
