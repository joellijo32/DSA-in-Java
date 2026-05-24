import java.util.*;
public class sumOfTwoElements10{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int n; System.out.print("Enter the size: "); n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n;i++) ar[i] = sc.nextInt();
        System.out.println("Entered Array: ");
        for(int i = 0; i < n; i++) System.out.print(ar[i] + " ");
        System.out.println();
    }
}