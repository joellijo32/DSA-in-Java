package Strings;
import java.util.*;

public class StringBuilderSample {
    
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Sample String");
        System.out.println(sb);

        System.out.println(sb.charAt(3));

        sb.setCharAt(1, 'o');
        System.out.println(sb);
    }
}
