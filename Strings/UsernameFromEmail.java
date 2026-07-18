package Strings;
import java.util.*;

public class UsernameFromEmail {
    
    String usernameFromEmail(String email){
        int index = email.indexOf('@');
        if(index == -1){
            System.out.println("Invalid e-mail.");
            System.exit(0);
        }
        String result = email.substring(0, index);
        return result;
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        UsernameFromEmail ob = new UsernameFromEmail();

        System.out.print("Enter e-mail: ");
        String email = sc.nextLine();
        String username = ob.usernameFromEmail(email);
        System.out.println("Username: " + username);
        sc.close();
    }
}
