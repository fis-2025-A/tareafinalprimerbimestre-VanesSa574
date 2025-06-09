package my_project.capitulo8;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DrawPanel extends JPanel {
    private List<Drawable> drawables;

    public DrawPanel(List<Drawable> drawables) {
        this.drawables = drawables;
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Drawable d : drawables) {
            d.draw(g);
        }
    }

    public void rotateShapes() {
        for (Drawable d : drawables) {
            if (d instanceof Rotatable rotatable) {
                rotatable.rotate();
            }
        }
        repaint(); // redibuja el panel con las figuras rotadas
    }
}

