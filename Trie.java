import java.util.*;

public class Trie {
         static class TrieNode{
            Map<Character, TrieNode> children = new HashMap<>();
         }

         TrieNode root = new TrieNode();
         char endSymbol = '*';

         public Trie(String str){
            populateSuffixTree(str);
         }

         void populateSuffixTree(String str){
            for(int i = 0; i < str.length() ;i++){
                insertSubstringStartingAt(i, str);
            }  
         }

         void insertSubstringStartingAt(int idx, String str){
            TrieNode node = root;
            for(int i=idx; i < str.length(); i++){
                char b = str.charAt(i);
                if(!node.children.containsKey(b)){
                    TrieNode newNode = new TrieNode();
                    node.children.put(b, newNode);
                } 
                node = node.children.get(b);
            
            }

            node.children.put(endSymbol, null);
         }

         boolean contains(String str){
            TrieNode node = root;
            for(int i = 0;i < str.length(); i++){
                char b = str.charAt(i);
                if(!node.children.containsKey(b)){
                    return false;
                }
                node = node.children.get(b);
            }
            return node.children.containsKey(endSymbol) ;
         }

         public static void main(String args[]){
            Trie trie = new Trie("Trie");
            System.out.println(trie.contains("e"));
         }
}
