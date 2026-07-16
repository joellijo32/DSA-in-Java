package Strings;
import java.util.*;

public class CharReplacement {
    
    String replaceChar(String original, char originalChar, char replacingChar){
        String result = "";
        for(int i = 0; i < original.length(); i++){
            char currentChar = original.charAt(i);
            if(currentChar == originalChar){
                result += replacingChar;
            } else result += currentChar;
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        CharReplacement ob = new CharReplacement();

        System.out.print("Enter: "); String original = sc.nextLine();
        char originalChar = 'e', replacingChar = 'i';
        String result = ob.replaceChar(original, originalChar, replacingChar);
        System.out.println("Char replaced string: " + result);
        sc.close();
    }
}
