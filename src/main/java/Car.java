class Car {
    // Nitelikleri değişkenle belirle
    String type;
    String model;
    String color;
    int speed;
    int speedLimit=300;

    Car(String model, int speed, String color, String type){
        this.model=model;
        this.speed=speed;
        this.color=color;
        this.type=type;
    }

    //davranışları metotlarla belirle
    void increaseSpeed(int increment) {
        if (speed + increment < speedLimit) {
           this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease){
        if (speed>0) {
            this.speed -= decrease;
        }


        }
    void  printSpeed(){
        System.out.println(model + " hızınız: " + speed);
    }
    void printInfo(){
        System.out.println("Model :\t" + this.model);
        System.out.println("Color :\t" + this.color);
        System.out.println("Type :\t" + this.type);
        System.out.println("Speed :\t" + this.speed);
    }
}
