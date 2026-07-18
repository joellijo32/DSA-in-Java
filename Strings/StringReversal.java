package Strings;
import java.util.*;

public class StringReversal {

    String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < str.length()/2; i++){
            char frontChar = str.charAt(i);
            char backChar = str.charAt(str.length()-1-i);
            sb.setCharAt(i, backChar);
            sb.setCharAt(str.length()-1-i, frontChar);
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String str = sc.nextLine();

        StringReversal ob = new StringReversal();
        String reversedString = ob.reverseString(str);

        System.out.println("Reversed String: " + reversedString);
        sc.close();
    }
}
