import java.util.*;

public class BinaryHeap {

    List<Integer> heap = new ArrayList<>();
    BinaryHeap(){

    }

    BinaryHeap(List<Integer> array){

    }

    void buildHeap(List<Integer> array){

    }

    void shiftDown(int currentIdx){

    }

    void shiftUp(int currentIdx){

    }

    int peek(){
        return 0;
    }

    void remove(){

    }

    void insert(int data){

    }

    int parent(int i){
        return (i-1)/2;
    }

    int leftChild(int i){
        return (2*i) + 1;
    }

    int rightChild(int  i){
        return (2*i)+2;
    }

    void display(){
        System.out.print("\nHeap: ");
        for(int i = 0;i < heap.size() ;i++ ){
            System.out.print("" + heap.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        List<Integer> array = new ArrayList<>(Arrays.asList(32,5,1));
        BinaryHeap ob = new BinaryHeap(array);

        
        
    }



}
