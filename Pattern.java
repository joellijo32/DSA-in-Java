public class Pattern {
    public static void main(String args[]){
        int n = 4;int spaceIdx = 2;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= (8-spaceIdx); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
            spaceIdx+= 2;
        }
    }
}
