import java.util.*;

public class StringCounting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String newStr = "";
        int i;int count = 1;
        for(i = 0;i < str.length()-1;){
            count = 1;
            char b = str.charAt(i);
            int j = i+1;
            while(j < str.length() && b == str.charAt(j)  ){
                count++;
                j++;
            }
            if(j == str.length() ){
                i = str.length()-1;
                break;
            }
            i = j;
            newStr += count + "" + b;
        }
        
        newStr +=  count +  "" + (char)(str.charAt(i));
        System.out.println("Desired String: " + newStr);

        sc.close();
        
    }
}
