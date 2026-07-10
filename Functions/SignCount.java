package Functions;
import java.util.*;

public class SignCount {

    int signCheck(int num){
        if(num > 0) return 1;
        else if(num < 0) return -1;
        else return num;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        SignCount ob = new SignCount();

        String b = ""; int pos = 0, neg = 0, zero = 0;
        System.out.println("Enter numbers (! to stop): ");
        b = sc.next();
        while(!b.equals("!")){
            int output = ob.signCheck(Integer.parseInt(b));
            if(output == 0) zero++;
            else if(output == 1) pos++;
            else neg++;
            b = sc.next();
        }
        System.out.println("\nPositive: " + pos + "\nNegative: " + neg + "\nZeros: " + zero);
        sc.close();
    }
}
