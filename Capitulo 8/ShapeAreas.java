package my_project.capitulo8;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeAreas {
    public static void main(String[] args) {
        List<Drawable> drawables = new ArrayList<>();

        Rectangle rect = new Rectangle(new Point(50, 70), 80, 40);
        drawables.add(rect);

        EquilateralTriangle triangle = new EquilateralTriangle(new Point(200, 100), 60);
        drawables.add(triangle); // si no rota, no importa

        new DrawFrame(drawables);
    }
}
