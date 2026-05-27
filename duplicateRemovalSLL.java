import java.util.*;

public class duplicateRemovalSLL {
    
    public class Node{
        int data;
        Node next;

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
        tail = newNode;
    }

    void display(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        System.out.println("Linked list: ");
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    void removeDuplicates(){
        Node current = head;

        while(current != null){
            Node next = current.next;

            while(next != null){
                if(current.data != next.data){
                    current.next = next;
                    break;
                }
                if(next == tail){
                    current.next = null;
                    tail = current;
                    break;
                }
                next = next.next;
            }
            current = current.next;
        }

        System.out.println("Removed Duplicates.");
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: "); 
        int n = sc.nextInt();

        duplicateRemovalSLL ob = new duplicateRemovalSLL();
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n;i++) ob.addNode(sc.nextInt());

        ob.display();

        ob.removeDuplicates();

        ob.display();

    }
}
