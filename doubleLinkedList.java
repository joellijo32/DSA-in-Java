import java.util.*;

public class doubleLinkedList {
    
    public class Node{
        Node prev, next;
        int data;

        Node(int data){
            this.data = data;
        }
    }

    public Node head, tail;

    void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = head;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("Linked list is null."); 
            return;
        }
        System.out.println("Linked List (forward): ");
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println("Linked List (reverse): ");
        temp = tail;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println();        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");

        doubleLinkedList ob = new doubleLinkedList();
        for(int i = 0; i < n;i++){
            ob.addNode(sc.nextInt());
        }
        ob.display();
    }


}
