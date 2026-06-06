import java.util.*;

public class BinarySearchTree {
    
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
        if(root == null) return false;

        Node currentNode = root;
        while(currentNode != null){
            if(currentNode.data == data) return true;
            else if(currentNode.data > data){
                currentNode = currentNode.left;
                continue;
            } else currentNode = currentNode.right;
        }

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

        BinarySearchTree ob = new BinarySearchTree();
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n;i++){
            ob.insert(sc.nextInt());
        } 

        System.out.println("Binary Search Tree: ");
        ob.display(ob.root);

        System.out.print("\nElement to Search: ");
        int e = sc.nextInt();

        if(ob.contains(e)){
            System.out.println(e + " is present in the BST");
        } else System.out.println (e + " is NOT present in BST");



    }
}
