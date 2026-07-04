public class Pattern {
    public static void main(String args[]){
        int n = 4;int spaceIdx = (n/2);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= ((n*2)-spaceIdx); j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
            spaceIdx+= 2;
        }

        spaceIdx = n*2;
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= ((n*2)-spaceIdx); j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
            spaceIdx -= 2;
        }
    }
}
