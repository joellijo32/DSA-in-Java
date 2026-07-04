public class Pattern {
    public static void main(String args[]){
        int n = 6; int number = 1;
        for(int i = 0; i < n;i++){
            for(int j = 0; j < (n-i+1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < number; j++){
                System.out.print(number + " ");
            }
            System.out.println(); 
            number++;
        }
    }
}
