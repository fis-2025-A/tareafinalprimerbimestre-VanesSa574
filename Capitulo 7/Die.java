package my_project.capitulo7;

import java.util.Random;

public class Die {
    private Random rand = new Random();

    public int roll() {
        return rand.nextInt(6) + 1;
    }
}

