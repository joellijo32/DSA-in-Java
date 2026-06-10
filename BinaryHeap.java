import java.util.*;

public class BinaryHeap {

    List<Integer> heap = new ArrayList<>();
    BinaryHeap(){

    }

    BinaryHeap(List<Integer> array){
        buildHeap(array);
    }

    void buildHeap(List<Integer> array){
        heap = array;
        for(int i = parent(heap.size()- 1); i> -1; i--  ){
            shiftDown(i);

        }
    }

    void shiftDown(int currentIdx){
        int endIdx = heap.size() - 1;
        int leftIdx = leftChild(currentIdx);

        while(leftIdx <= endIdx){
            int rightIdx = rightChild(currentIdx);
            int idxToShift;
            if(rightIdx <= endIdx && heap.get(rightIdx) < heap.get(leftIdx)){
                idxToShift = rightIdx;

            } else {
                idxToShift = leftIdx;
            }
            if(heap.get(currentIdx) > heap.get(idxToShift)){
                Collections.swap(heap, currentIdx, idxToShift);
                currentIdx = idxToShift;
                leftIdx = leftChild(currentIdx);
            } else return;
        }
    }

    void shiftUp(int currentIdx){
        int parentIdx = parent(currentIdx);
        while(currentIdx > 0 && heap.get(currentIdx) < heap.get(parentIdx)){
             Collections.swap(heap, currentIdx, parentIdx);
             currentIdx = parentIdx;
             parentIdx = parent(currentIdx);

        }
    }

    int peek(){
        if(heap.size() == 0){
            System.out.println("\nEmpty Heap");
            return -1;
        }
        return heap.get(0);
    }

    void remove(){
        Collections.swap(heap, 0, heap.size() - 1);
        heap.remove(heap.size() - 1);

        shiftDown(0);
    }

    void insert(int data){
        heap.add(data);
        shiftUp(heap.size() - 1);
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
            System.out.print(heap.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        List<Integer> array = new ArrayList<>(Arrays.asList(32,5,15));
        BinaryHeap ob = new BinaryHeap(array);
        ob.display();
      
        ob.insert(1);
        ob.insert(47);
        ob.insert(2);

        ob.display();
        ob.buildHeap(array);
        ob.display();
        System.out.println("\nPeeking Value: " + ob.peek());

        ob.remove();
        ob.remove();
        System.out.println("After two remove: " );  ob.display();


        
    }



}
