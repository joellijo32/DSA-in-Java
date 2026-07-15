package Array;
import java.util.*;

public class Spiral2D {

    void spiralOrder(int[][] arr){
        int rows = arr.length, columns = arr[0].length;
        int numberOfElements = rows * columns, visitedElements = 0;
        
        int i = 0, j = 0, counter = 0;
        while(visitedElements != numberOfElements){
            while(j < columns-counter){
                System.out.print(arr[i][j] + "  ");
                visitedElements++;
                j++;
            } counter++;
            
            i++;
            j--;
            counter = 0;
            while(i < rows-counter){
                System.out.print(arr[i][j] + "  ");
                visitedElements++;
                i++;
            } counter += 2;
            
            
        }
        System.out.println();
    }

    public static void main(String args[]){
        Spiral2D ob = new Spiral2D();
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: "); int rows = sc.nextInt();
        System.out.print("Columns: "); int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];
        System.out.println("Elements: ");
        for(int i = 0; i < rows;i++){
            for(int j = 0; j < columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Order: ");
        ob.spiralOrder(arr);
        sc.close();
    }
}
