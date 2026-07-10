package Functions;
import java.util.*;

public class OddSumTillN {

    int oddSum(int n){
        int sum = 0;
        for(int i = 1; i <= n;i= i+2){
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        OddSumTillN ob = new OddSumTillN();
        System.out.print("N: ");
        int n = sc.nextInt();
        System.out.println("Odd Sum till " + n + ": " + ob.oddSum(n));
    }    
}
