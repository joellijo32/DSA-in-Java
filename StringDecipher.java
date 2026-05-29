import java.util.*;

public class StringDecipher{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);
        
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            char temp = '\0';
            int val = str.charAt(i);
            if((val + 2) > 122){
                temp = (char)(int)(97 + ((val+1) % 122));
            } else {
                temp = (char)(int)(val + 2);
            }

            newStr = newStr + temp;
        }

        System.out.println("Deciphered String: " + newStr);
    }
}