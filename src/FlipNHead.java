public class FlipNHead {
    public static void main(String[] args) {
        int n = 4;
        flipNHead(n);
    }

    public static void flipNHead(int n) {
        int heads = 0;
        int flips = 0;
        do {
            double flip = Math.random();
            if (flip >= .5) {
                System.out.println("Heads");
                heads++;
            } else {
                System.out.println("Tails");
                heads = 0;
            }
            flips++;
        } while (heads != n);
        System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
    }
}
