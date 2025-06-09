package my_project.capitulo7;

class Coin {
    public String getFace() {
        return Math.random() < 0.5 ? "heads" : "tails";
    }
}
