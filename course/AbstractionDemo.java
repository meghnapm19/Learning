abstract class Car {
    public abstract void drive();

    public void playMusic(){
        System.out.println("Music playing...");
    }
}

class WagonR extends Car {
    public void drive(){
        System.out.println("Driving");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
