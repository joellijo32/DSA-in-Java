import java.util.Arrays;

public class QuickSort {

    void quickSortHelper(int[] arr, int startIdx, int endIdx){
        if(startIdx >= endIdx){
            return;
        }
        int pivotIdx = startIdx;
        int leftIdx = startIdx+1;
        int rightIdx = endIdx;
        while(leftIdx <=  rightIdx){
            if(arr[leftIdx] > arr[pivotIdx] && arr[rightIdx] < arr[pivotIdx]){
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx++; rightIdx--;
            }
            if(arr[leftIdx] <=arr[pivotIdx]){
                leftIdx++;
            }
            if(arr[rightIdx] >= arr[pivotIdx]){
                rightIdx--;
            }
        }
        int temp = arr[rightIdx];
        arr[rightIdx] = arr[pivotIdx];
        arr[pivotIdx] = temp;
        quickSortHelper(arr, startIdx, rightIdx-1);
        quickSortHelper(arr, rightIdx+1, endIdx);
    }

    void quickSort(int[] arr){
        quickSortHelper(arr, 0, arr.length-1);
    }

    public static void main(String args[]){
        QuickSort ob = new QuickSort();
        int arr[] ={46,546,486,354,68,819,4355,981,-86,46,84};
        System.out.println("Array: " + Arrays.toString(arr));
        ob.quickSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));

    }

}
