public class Operations {
    int num1;
    int num2;
    public void Addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public int Division(int num1, int num2) {
        return (num1 / num2);
    }
public static void main (String args[]){
    Operations obj1 = new Operations();
    obj1.Addition(10, 20);
    System.out.println( " " + obj1.Division(20, 10));
}
}
