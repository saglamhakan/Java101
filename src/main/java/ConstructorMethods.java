public class ConstructorMethods {
    public static void main(String[] args) {
        Car audi= new Car("Audi", 150, "black", "A7");

      /*  System.out.println(audi.model+ " Hızı: " + audi.speed);
        System.out.println(audi.color);
        System.out.println(audi.type);
        audi.printSpeed();

       */
        audi.printInfo();
    }

}
