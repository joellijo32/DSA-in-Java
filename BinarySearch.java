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

    int binaryRecHelper(int[] arr, int target, int f, int l){
        if(f > l) return -1;
        int mid = f + ((l-f)/2);
        if(target == arr[mid]) return mid;
        else if(arr[mid] < target) return binaryRecHelper(arr, target, mid+1, l);
            else return binaryRecHelper(arr, target, f, mid-1);
        
    }

    int binaryRec(int[] arr, int target){
        return binaryRecHelper(arr, target, 0, arr.length-1);
    }

    public static void main(String args[]){
        System.out.println("Iterative: ");
        int arr[] = {0,1,2,3,4,6,7,8,9};
        BinarySearch ob = new BinarySearch();
        ob.binaryIt(arr, 8);
        System.out.println("Recursive: ");
        if(ob.binaryRec(arr, 8) == -1){
            System.out.println(8 + " NOT found");
        }else System.out.println(8 + " found at " + ob.binaryRec(arr, 8));
    }
}