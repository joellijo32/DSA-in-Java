package Functions;
import java.util.*;

public class PrimeNumber {
    
    boolean isPrimeNumber(int number){
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0) return false;
        }
        return true ;
    }

    public static void main(String args[]){
        PrimeNumber ob = new PrimeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: "); int number = sc.nextInt();
        System.out.println(ob.isPrimeNumber(number));
    }
}
