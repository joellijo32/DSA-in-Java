public class Pattern {
    public static void main(String args[]){
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                if(j == 0 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j = 0; j < (2*(n-i-1)); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i+1; j++){
                if(j == 0 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 5; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(j == 0 | j == i-1) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j = 0; j < (2*(n-i)); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                if(j == 0 | j == i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
