import java.util.*;

public class StringDecipher{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);
        
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            char temp = (char)((int)str.charAt(i) + 2);
            newStr = newStr + temp;
        }

        System.out.println("Deciphered String: " + newStr);
    }
}