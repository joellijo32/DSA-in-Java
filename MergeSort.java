import java.util.Arrays;

public class MergeSort {

    int[] join(int[] firstArr, int[] secondArr){
        int i = 0, j = 0, k = 0;
        int newArr[] = new int[firstArr.length + secondArr.length];
        while(i < firstArr.length && j < secondArr.length){
            if(firstArr[i] < secondArr[j]){
                newArr[k++] = firstArr[i++];
            } else {
                newArr[k++] = secondArr[j++];
            }
        }

        while(i < firstArr.length){
            newArr[k++] = firstArr[i++];
        }
        while(j < secondArr.length){
            newArr[k++] = secondArr[j++];
        }

        return newArr;
    }

    int[] mergeSort(int[] arr){
        if(arr.length <= 1) return arr;
        int middleIdx = arr.length/2;
        int[] firstHalf = Arrays.copyOfRange(arr, 0, middleIdx);
        int[] secondHalf = Arrays.copyOfRange(arr, middleIdx, arr.length);

       

        return join( mergeSort(firstHalf),mergeSort(secondHalf));
        
        
    }

    public static void main(String args[]){
        int[] arr = {65,6,84,846,15,156,89, -654,-186};
        MergeSort ob = new MergeSort();
        int[] sortedArr = ob.mergeSort(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sorted: " + Arrays.toString(sortedArr));
    }
}
