import java.util.*;

public class BinaryTree {
    
    public class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }

    Node root;

    void insert(int data){
        Node currentNode = root;
        if(root == null){
            root = new Node(data);
            return;
        }
        
        Node newNode = new Node(data);
        while(true){
            if(currentNode.data > newNode.data){
                if(currentNode.left == null)   {
                    currentNode.left = newNode;
                    break;
                } else currentNode = currentNode.left;
            } else {
                if(currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                }else currentNode = currentNode.right;
            }
        }
    }

    boolean contains(int data){
        Node currentNode = root;
        return false;
    }


    void remove(int data){
        Node currentNode = root;
    }

    void display(Node currentNode){
        if(currentNode == null){
            System.out.println("Null");
            return;
        }
     
            
            System.out.println("Root: " + currentNode.data);
       
            System.out.println("Left : ");
            display(currentNode.left);
            System.out.println("Right: ");
            display(currentNode.right);
           
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = sc.nextInt();

        BinaryTree ob = new BinaryTree();
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n;i++){
            ob.insert(sc.nextInt());
        } 

        System.out.println("Binary Search Tree: ");
        ob.display(ob.root);



    }
}
