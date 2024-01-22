class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int n){
         age = n;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
       name = s;
    }
    }

public class Encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(10);
        obj.setName("Meghna");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
}
}
