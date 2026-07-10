package Functions;
import java.util.*;

public class GCD {

    int gcd(int a, int b){
        if(a == 0 && b == 0) return 0;
        if(a == 0 || b == 0) return Math.min(a, b);
        int result = Math.min(a, b);
        while(result > 0){
            if(a % result == 0 && b % result == 0) return result;
            result--;
        }
        return -1;
    }

    public static void main(String args[]){
        GCD ob = new GCD();
        Scanner sc = new Scanner(System.in);

        System.out.print("a: "); int a = sc.nextInt();
        System.out.print("b: "); int b = sc.nextInt();
        System.out.println("GCD: " + ob.gcd(a, b));
        sc.close();
    }    
}
