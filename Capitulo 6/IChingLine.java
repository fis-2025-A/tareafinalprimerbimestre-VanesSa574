package my_project.capitulo6;

public class IChingLine {
    public static void main(String[] args) {
        Coin[] coins = { new Coin(), new Coin(), new Coin() };
        int heads = 0;

        for (Coin c : coins) {
            String face = c.getFace();
            System.out.println("Moneda: " + face);
            if (face.equals("heads")) heads++;
        }

        switch (heads) {
            case 3 -> System.out.println("Old Yang: ---- o ----");
            case 2 -> System.out.println("Young Yang: -----------");
            case 1 -> System.out.println("Young Yin: ----   ----");
            case 0 -> System.out.println("Old Yin: ---- x ----");
        }
    }
}

