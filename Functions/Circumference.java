package Functions;
import java.util.*;

public class Circumference {

    double circumference(double radius){
        return (2 * (Math.PI) * radius);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextInt();

        Circumference ob = new Circumference();
        System.out.println("Circumference: " + ob.circumference(radius));
        sc.close();
    }
}
