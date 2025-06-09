package my_project.capitulo6;

public class Coin {
    public String getFace() {
        return Math.random() < 0.5 ? "heads" : "tails";
    }
}

