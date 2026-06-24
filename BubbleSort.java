import java.util.*;

public class BubbleSort {

    void bubbleSort(int[] arr){
        int len = arr.length; 
        for(int i = 0; i < len;i++){
            for(int j = 0; j < len-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }   

    void display(int[] arr){
        System.out.print("\nArray: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        BubbleSort ob = new BubbleSort();
        int arr[] = {45,-345,234,2,75,587,235,15,846,56,5,7,3};
        ob.display(arr);
        System.out.println("After sorting: ");ob.bubbleSort(arr);
        ob.display(arr);
    }
}
