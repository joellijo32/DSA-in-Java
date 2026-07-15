package Array;
import java.util.*;

public class Spiral2D {

    void spiralOrder(int[][] arr){
        int rows = arr.length, columns = arr[0].length;
        int numberOfElements = rows * columns, visitedElements = 0;
        
        int i = 0, j = 0, top = 0, bottom = rows, left = 0, right = columns;
        while(visitedElements < numberOfElements){
            
            while(j < right && visitedElements < numberOfElements){
                System.out.print(arr[i][j] + "  ");
                visitedElements++;
                j++;
            } right--;
            i++;
            j--;
            while(i < bottom && visitedElements < numberOfElements){
                System.out.print(arr[i][j] + "  ");
                visitedElements++;
                i++;
            } bottom--;
            rows--;

            i--;
            j--;
            while(j >= left && visitedElements < numberOfElements){
                System.out.print(arr[i][j] + "  ");
                visitedElements++;
                j--;
            } left++;

            j++;
            i--;
            while(i > top && visitedElements < numberOfElements){
                System.out.print(arr[i][j] + "  ");
                visitedElements++;
                i--;
            } top++;
            j++;
            i++;
            columns--;
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
