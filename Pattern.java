public class Pattern {
    public static void main(String args[]){
        int number = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if(j >= (6-i) ) System.out.print(number + " ");
                else System.out.print(" ");
            } System.out.println();
            number++;
        }
    }
}
