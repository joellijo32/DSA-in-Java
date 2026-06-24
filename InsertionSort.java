public class InsertionSort {
    void insertionSort(int[] arr){
        System.out.println("\nSorting: ");
        for(int i = 1; i < arr.length; i++){
            int current = arr[i], idx = i-1;
            while(idx >= 0 && current < arr[idx]){
                arr[idx+1] = arr[idx];
                idx--;
            }
            arr[idx+1] = current;
        }
        System.out.println("\nSorting over.\n");
    }

    void display(int arr[]){
        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int[] arr = {45,-345,234,2,75,587,235,15,846,56,5,7,3};
        InsertionSort ob = new InsertionSort();
        ob.display(arr);
        System.out.println("After sorting: ");
        ob.insertionSort(arr);
        ob.display(arr);
    }
}
