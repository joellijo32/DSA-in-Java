import java.util.Arrays;

public class SelectionSort {

    void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1;i++){
            int small = arr[i], idx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < small){
                    small = arr[j];
                    idx = j;
                }
            }
            arr[idx] = arr[i];
            arr[i] = small;
        }
    }

    public static void main(String args[]){
        SelectionSort ob = new SelectionSort();
        int[] arr = {6584,684,65,86,351,846,153,846,-35};
        System.out.println("Array: " + Arrays.toString(arr));
        ob.selectionSort(arr);
        System.out.println("After sorting array: " + Arrays.toString(arr));
    }
}
