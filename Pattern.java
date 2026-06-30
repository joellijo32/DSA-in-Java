public class Pattern {
    public static void main(String args[]){
        int binary = 1;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(binary + " ");
                 binary = 1 - binary;
            } System.out.println();
            if(i%2 != 0) binary = 1- binary;
        }
    }
}
