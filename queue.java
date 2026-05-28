import java.util.*;

public class queue {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }    

    Node front, rear;


    void display(){
        if(front == null){
            System.out.println("Queue empty. ");
            return;
        }

        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        
        System.out.println();

    }

    void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = front;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if(front == null){
            System.out.println("Queue underflow. ");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if(front == null) rear = null;
        return val;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        queue ob= new queue();

        System.out.print("Size: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n;i++){
            ob.enqueue(sc.nextInt());
        }

        ob.display();

        System.out.println("Dequeue: " + ob.dequeue());
        ob.display();
        
        System.out.println("Dequeue: " + ob.dequeue());
        ob.display();
        System.out.println("Dequeue: " + ob.dequeue());
        ob.display();
        System.out.println("Dequeue: " + ob.dequeue());
        ob.display();
        ob.display();
    }
}
