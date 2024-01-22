abstract class Animal {
    public abstract void sound();


}

public class Dog extends Animal {
    public void sound(){
        System.out.println("Bow Bow");
    }

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
