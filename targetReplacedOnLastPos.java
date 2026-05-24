import java.util.*;
public class targetReplacedOnLastPos {

    public int[] repl(int ar[], int target){
        
        int temp = 0;
        int i = 0, j = ar.length-1;
        while(i <= j){
            
            if(ar[j] == target){
                j--; continue;
            } 
            if(ar[i] != target){
                i++; continue;
            } 
            else {
                temp = ar[i]; ar[i] = ar[j]; ar[j] = temp;
                i++; j--;
            }

        }
        return ar;
    }


    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Size: "); int n = sc.nextInt();
        int ar[] = new int[n];

        System.out.println("Elements:");
        for(int i = 0; i < n;i++){
            ar[i] = sc.nextInt();
        }

        targetReplacedOnLastPos ob = new targetReplacedOnLastPos();

        int target; System.out.print("Target: "); target = sc.nextInt();

        int result[] = ob.repl(ar, target);

        System.out.println("After replacing: ");
        for(int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
        System.out.println();

    }
}
