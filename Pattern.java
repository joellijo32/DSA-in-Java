public class Pattern {
    public static void main(String args[]){
        int n = 9, number = 1; boolean isOneFound = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n-i-1); j++){
                System.out.print("  ");
            }
            number = i+1; isOneFound = false;
            for(int j = 0; j < (2*i+1); j++){
                System.out.print(number + " ");
                if(number == 1){
                    isOneFound = true;
                }
                if(isOneFound){
                    number++;
                } else number--;
            }
            System.out.println();
        }
    }
}
