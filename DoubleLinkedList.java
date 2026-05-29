import java.util.*;

public class DoubleLinkedList {
    
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
        // System.out.println("Linked List (reverse): ");
        // temp = tail;
        // while(temp != null){
        //     System.out.print(temp.data + " <-> ");
        //     temp = temp.prev;
        // }

        // System.out.println();        
    }

    void delete(int data){
        boolean flag = false;

        if(head.data == data){
            head = head.next;
            head.prev = null;
            flag = true;
            return;
        } else if(tail.data == data){
            tail = tail.prev;
            tail.next = null;
            flag = true;
            return;
        }

        Node temp = head.next;

        while(temp != tail){
            if(temp.data == data){
                flag = true;
                break;
            } 
            temp = temp.next;
        }

        if(flag == true){
            (temp.prev).next = temp.next;
            (temp.next).prev = temp.prev;
        } else{
            System.out.println(data + " Not found in linked list.");
            return;
        } 

        System.out.println(data + " is deleted from linked list");

    }

    void insertAfter(int data, int val){
        boolean flag = false;
        Node newNode = new Node(val);

        if(head.data == data){
            (head.next).prev = newNode;
            newNode.next = head.next;
            flag = true;
            head.next = newNode;
            newNode.prev = head;

            System.out.println(val + " is inserted after " + data);
            return;
            
        } else if(tail.data == data){
            newNode.prev = tail;
            newNode.next = null;
            flag = true;
            tail.next = newNode;
            tail = newNode;

            System.out.println(val + " is inserted after " + data);
            return;
        }

        Node temp = head.next;
        while(temp != tail){
            if(temp.data == data){
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if(flag == true){
            newNode.prev = temp;
            newNode.next = temp.next;

            (temp.next).prev = newNode;
            temp.next = newNode;
            System.out.println(val + " is inserted after " + data);
            
        } else System.out.println(data + " is not found in linked list");

    }


    void insertBefore(int data, int val){
        Node newNode = new Node(val);

        if(head.data == data){
            newNode.prev = null;
            newNode.next = head;

            head.prev = newNode;
            head = newNode;
            System.out.println(val + " entered before " + data);
            return;
        } else if(tail.data == data){
            
            newNode.prev = tail.prev;
            newNode.next = tail;

            (tail.prev).next = newNode;
            tail.prev = newNode;
            System.out.println(val + " entered before " + data);
            return;
        }

        boolean flag = false;
        Node temp = head.next;
        while(temp != tail){
            if(temp.data == data){
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if(flag){
            newNode.prev = temp.prev;
            newNode.next = temp;

            (temp.prev).next = newNode;
            temp.prev = newNode;
            System.out.println(val + " is entered before " + data);
        } else System.out.println(data + " is not in linked list");

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");

        DoubleLinkedList ob = new DoubleLinkedList();
        for(int i = 0; i < n;i++){
            ob.addNode(sc.nextInt());
        }
        ob.display();

        System.out.println("Enter data and val to enter: ");
        int data = sc.nextInt(), val = sc.nextInt();

        // ob.insertAfter(data, val);

        // System.out.print("Data to delete: ");
        // int del = sc.nextInt();

        // ob.delete(del);

        ob.insertBefore(data, val);

        ob.display();
    }


}
