import java.util.*;

public class Graph {
    Map<Integer, List<Integer>> map = new HashMap<>();

    void addVertex(Integer key){
        map.put(key, new ArrayList<>());
    }

    void insertNode(Integer vertex, Integer edge, boolean isBidirectional ){
        if(!map.containsKey(vertex)){
            addVertex(vertex);
        }
        if(!map.containsKey(edge)){
                addVertex(edge);
        }

        map.get(vertex).add(edge);
        if(isBidirectional){
            map.get(edge).add(vertex);
        }
    }

    void display(){
        System.out.println();
        for(Integer x : map.keySet()){
            System.out.print(x + ": ");
            for(Integer y: map.get(x)){
                System.out.print(y + "  ");
            }
            System.out.println();
        }        
    }

    public static void main(String args[]){
         Graph ob = new Graph();
         ob.insertNode(3, 5, true);
         ob.insertNode(3, 4, true);
         ob.insertNode(5, 6, true);

         ob.display();
         
    }
}
