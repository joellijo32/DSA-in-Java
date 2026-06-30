public class Pattern {
    public static void main(String args[]){
        int number = 1;int limit = 1;
        for(int i = 0; i < 5; i++){
            for(int j = 1; j <= 4-i; j++){
                System.out.print("  ");
            }
            number = i+1;boolean isOneFound = false;
            for(int j = 0; j < limit; j++){
                System.out.print(number + " ");
                if(!isOneFound){
                    number--; 
                    if(number == 0){
                        number = 2;
                        isOneFound = true;
                    } 
                } else number++;
                
            }
            System.out.println();
            limit = limit + 2;
        }
    }
}
