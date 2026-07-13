package Array;
import java.util.*;

public class MaxAndMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: "); int n  = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        System.out.println("Maximum: " + max + "\nMininum: " + min);
        sc.close();
    }
}
