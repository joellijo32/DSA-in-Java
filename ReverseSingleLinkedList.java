import java.util.*;

public class ReverseSingleLinkedList {
    
    public class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
        }
    }
    
    Node head, tail;
    Node revHead, revTail;

    void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    void display(Node dis){
        Node temp = dis;
        System.out.println("Linked List: ");
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();

    }

    void insertBefore(int data){
        Node newNode = new Node(data);

        if(revTail == null){
            revTail = newNode;
            revHead = revTail;
            return;
        }

        newNode.next =revHead;
        revHead = newNode;  
        
        
    }

    void reverse(){
        Node temp = head;
        while(temp != null){
            insertBefore(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ReverseSingleLinkedList ob = new ReverseSingleLinkedList();
        System.out.print("Size: "); int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i = 0;i < n;i++){
            ob.addNode(sc.nextInt());
        } 
        ob.display(ob.head);
        System.out.print("Reversed ");
        ob.reverse();
        ob.display(ob.revHead);

        sc.close();
    }

}
