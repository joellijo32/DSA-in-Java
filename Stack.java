import java.util.*;

public class Stack {
    
    public class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public Node top;

    void display(){

        if(top == null){
            System.out.println("Stack empty.");
            return;
        }
        Node temp = top;
        System.out.println("Stack: ");
        int flag = 0;
        while(temp != null){
            if(flag == 0){
                System.out.println(temp.data + " <- top");
                flag = 1; temp = temp.next;
                continue;
            }
            System.out.println(temp.data);

            temp = temp.next;
        }
        
    }


    void push(int data){
        Node newNode = new Node(data);

        if(top == null){
            top = newNode;
            return;
        }

        newNode.next = top;
        top = newNode;
    }


    int pop(){
        if(top == null){
            System.out.print(" Underflow: ");
            return -1;
        }
        System.out.print("Popped: ");
        int val = top.data;
        top = top.next;
        return val;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack ob = new Stack();

        System.out.print("Size: ");
        int n= sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n;i++) ob.push(sc.nextInt());

        ob.display();

        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());

        ob.display();
    }


}
