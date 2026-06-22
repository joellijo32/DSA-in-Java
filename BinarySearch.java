import java.util.*;

public class BinarySearch{

    void binaryIt(int[] arr, int target){
        int f = 0, l = arr.length, mid = 0;
        while(f < l){
            mid = f + ((l-f)/2);
            if(arr[mid] == target){
                System.out.println(target + " found at " + mid);
                return;
            }else if(arr[mid] < target) f = mid + 1;
                else l = mid-1;
        }
        System.out.println(target + " NOT found");
    }

    public static void main(String args[]){
        System.out.println("Iterative: ");
        int arr[] = {0,1,2,3,4,6,7,8,9};
        BinarySearch ob = new BinarySearch();
        ob.binaryIt(arr, 8);
    }
}