import java.util.*;
public class SumOfTwoElements10{

    public int[] sum(int ar[], int target){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < ar.length; i++){
            int num = ar[i];
            int match = target - num;
            if(set.contains(match)){
                return new int[]{num, match};
            }
            set.add(num);
        }
        return new int[0];
    }

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int n; System.out.print("Enter the size: "); n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n;i++) ar[i] = sc.nextInt();
           sc.close();
        System.out.println("Entered Array: ");
        for(int i = 0; i < n; i++) System.out.print(ar[i] + " ");
        SumOfTwoElements10 ob = new SumOfTwoElements10();
        int result[] = ob.sum(ar, 10);
        if(result.length == 0){
            System.out.println("No matching pairs.");return;
        }
        for(int i = 0; i < result.length; i++) System.out.print("(" + result[0] + ", " + result[1] + ")  ");

     
    }
}