import java.util.*;

public class FactorialUsingRecursion {
    int factorial(int n){
        if(n == 0) return 1;
        else return n * factorial(n-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = sc.nextInt();

        FactorialUsingRecursion ob = new FactorialUsingRecursion();
        System.out.println("Factorial of " + n + " = " + ob.factorial(n));
    }
}
