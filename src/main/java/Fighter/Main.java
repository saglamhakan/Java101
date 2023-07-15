package Fighter;

public class Main {
    public static void main(String[] args) {
        Fighter mert = new Fighter("Mert", 10, 120,72,10);
        Fighter hakan = new Fighter("Emre", 10,120,85,10);

        Ring round = new Ring(mert,hakan,70,100);
        round.fight();

    }



}
