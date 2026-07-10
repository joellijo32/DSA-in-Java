package Functions;
import java.util.*;

public class Fibonacci {

    void fibonacci(int n){
        int f = 0, s = 1;
        if(n == f){
            System.out.println("0");
            return;
        }
        if(n == s){
            System.out.println("0, 1");
            return;
        }
        System.out.print("0, 1, ");int count = 0, sum = f+s;
        for(int i = 1; i < n;i++){
            sum = f+s;
            f = s;
            s = sum;
            if(count == 0){
                System.out.print(sum);
                count++;
            } else System.out.print(", " + sum);
        }
        System.out.println();
    }

    public static void main(String args[]){
        Fibonacci ob = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");int n = sc.nextInt();

        System.out.println("Fibonnaci: ");
        ob.fibonacci(n);
        sc.close();

    }
}
