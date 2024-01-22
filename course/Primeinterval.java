public class Primeinterval {
public static void main(String[] args) {
    System.out.println("Prime numbers between 1 to 10");

    for(int x=1; x<=10; x++){
        int i;
        if(x<=1){
            continue;
        }
        else{
            for (i=2; i<=x/2; i++){
                if(x%i == 0){
                    break;
                }
            }
            if (i>x/2){
                System.out.println(x);
            }
        }
    }
}
}
