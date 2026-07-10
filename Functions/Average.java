package Functions;
import java.util.*;

public class Average {

    int average(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Num:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Average ob = new Average();
        System.out.println("Average: " + ob.average(a,b,c));
        sc.close();
    }
}
