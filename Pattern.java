public class Pattern {
    public static void main(String args[]){
        for(int i = 3; i >= 0; i--){
            for(int j = 0; j < 4; j++){
                if(j >= i) System.out.print("*");
                else System.out.print(" ");
                System.out.print(" ");
            } System.out.println();
        }
    }
}
