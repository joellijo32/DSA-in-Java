public class Pattern {

    int factorial(int n){
        if(n == 0) return 1;
        else return n*factorial(n-1);
    }

    public static void main(String args[]){
        Pattern ob = new Pattern();
        int n = 5;
        for(int i = 0; i < n;i++){  // nth row kth element.
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i+1; j++){
                int number = (ob.factorial(i))/(ob.factorial(j) * (ob.factorial(i-j)));
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
