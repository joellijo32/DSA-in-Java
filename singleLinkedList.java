import java.util.*;
public class singleLinkedList {


    public class Node{
        int data; 
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    Node head = null;
    Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head= newNode;
            
        } else {
            tail.next = newNode;
            
        }
        tail = newNode;

    }


    void display(){
        if(head == null){
            System.out.println("Head is null. The linked list is empty.");
            return;
        }
        Node temp = head;
        System.out.println("Linked List: ");
        while(temp != null){
            System.out.print(temp.data + " "); 
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        singleLinkedList ob = new singleLinkedList();

        System.out.print("Enter size: "); int n = sc.nextInt();
        System.out.println("Enter the contents: ");
        for(int i = 0; i< n;i++) ob.addNode(sc.nextInt());


        ob.display();
      
        
    }

}
