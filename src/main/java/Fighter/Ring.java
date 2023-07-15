package Fighter;

public class Ring {
    Fighter fighterOne;
    Fighter fighterTwo;
    int minWeight;
    int maxWeight;

    Ring(Fighter fighterOne, Fighter fighterTwo, int minWeight, int maxWeight) {
        this.fighterOne = fighterOne;
        this.fighterTwo = fighterTwo;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }
    public void fight() {

        if(isCheck()){
            while (fighterOne.health > 0 && fighterTwo.health > 0) {
                System.out.println("\n============= YENİ ROUND =============");
                fighterTwo.health = fighterOne.hit(fighterTwo);
                if (isWin()) {
                    break;
                }
                fighterOne.health = fighterTwo.hit(fighterOne);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        }else
            System.out.println("Aynı siklette değiller !");
    }

    public boolean isCheck() {
        return (this.fighterOne.weight >= minWeight && this.fighterOne.weight <= maxWeight) && (this.fighterTwo.weight >= minWeight && this.fighterTwo.weight <= maxWeight);
    }

    public boolean isWin() {
        if (fighterOne.health == 0) {
            System.out.println("Maçı Kazanan : " + fighterTwo.name);
            return true;
        } else if (fighterTwo.health == 0) {
            System.out.println("Maçı Kazanan : " + fighterOne.name);
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println();
        System.out.println(" ");
        System.out.println(fighterOne.name + " Kalan Can\t:" + fighterOne.health);
        System.out.println(fighterTwo.name + " Kalan Can\t:" + fighterTwo.health);


    }

}
