package my_project.capitulo8;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DrawFrame extends JFrame {
    public DrawFrame(List<Drawable> drawables) {
        setTitle("Shape Drawing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel panel = new DrawPanel(drawables);
        JButton rotateButton = new JButton("Rotar figuras");
        rotateButton.addActionListener(e -> panel.rotateShapes());

        add(panel, BorderLayout.CENTER);
        add(rotateButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}

