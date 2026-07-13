package Array;
import java.util.*;

public class IsSorted {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: "); int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true; int min = arr[0];
        for(int  i = 1;i < n ; i++){
            if(min > arr[i]){ 
                isSorted = false; 
                break;
            }
            min = arr[i];
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        } else System.out.println("Array is Unsorted");
    }
}
