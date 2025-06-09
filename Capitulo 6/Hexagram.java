package my_project.capitulo6;

public class Hexagram {
    public void display() {
        for (int i = 0; i < 6; i++) {
            new IChingLine();
			IChingLine.main(null); 
        }
    }

    public static void main(String[] args) {
        new Hexagram().display();
    }
}

