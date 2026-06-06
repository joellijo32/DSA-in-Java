import java.util.*;
public class SingleLinkedList {


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


    void delete(int data){
        Node temp = head, prev = null;
        
        if(temp != null && temp.data == data){
            head = head.next;
            temp = temp.next;
            System.out.println("Deleted " + data );
            return;
        }

        while(temp != null && temp.data != data){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            System.out.println(data + " not found in linked list");
            return;
        }

        if(temp == tail ){
            tail = prev;
            tail.next = null;
            System.out.println("Deleted " + data);
            return;
        }

        if(temp.data == data){
            System.out.println("Deleted " + data);
            prev.next = temp.next;   
            return;
        }
    }

    void insert(int pos, int data){
        
        Node newNode = new Node(data);
        Node temp = head;

        while(temp != null && temp.data != pos){
            temp = temp.next;
        }

        if(temp == null){
            return ; 
        } else if(temp == tail){
            tail.next = newNode;
            tail = newNode;
        } else if(temp.data == pos){
            newNode.next = temp.next;
            temp.next = newNode;
        }


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
        SingleLinkedList ob = new SingleLinkedList();

        System.out.print("Enter size: "); int n = sc.nextInt();
        System.out.println("Enter the contents: ");
        for(int i = 0; i< n;i++) ob.addNode(sc.nextInt());


        ob.display();
        // System.out.print("Data to delete: ");
        // int del = sc.nextInt();
        // ob.delete(del);

        System.out.print("Pos and data to enter: ");
        int pos = sc.nextInt(), data  = sc.nextInt();
        ob.insert(pos, data);
        ob.display();
      
        sc.close();
    }

}
