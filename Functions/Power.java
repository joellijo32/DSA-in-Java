package Functions;
import java.util.*;

public class Power {

    int power(int x, int n){
        int result = 1;
        if(n == 0) return result;
        else{
            for(int i = 1; i <= n; i++){
                result = result * result;
            }
            if(n > 0){
                return result;
            } else {
                return (1/result);
            }
        }
    }

    public static void main(String args[]){
        Power ob = new Power();
        Scanner sc = new Scanner(System.in);

        System.out.print("x: "); int x = sc.nextInt();
        System.out.print("n: "); int n = sc.nextInt();
        System.out.println("Result: " + ob.power(x, n));

        sc.close();
    }
}
