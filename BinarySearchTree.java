import java.util.*;
import java.lang.*;

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
        removeHelper(data, root, null); 
    }

    private void removeHelper(int data, Node currentNode, Node parentNode){
        while(currentNode != null){
             if(data < currentNode.data){
                 parentNode = currentNode;
                 currentNode = currentNode.left;
             } else if(data > currentNode.data){
                parentNode = currentNode;
                currentNode = currentNode.right;
             } else {
                if(currentNode.left != null && currentNode.right != null){
                    currentNode.data =  getMinValue(currentNode.right) ;
                    removeHelper(currentNode.data, currentNode.right, currentNode);
                } else {
                    if(parentNode == null){
                        if(currentNode.right == null){
                            root = currentNode.left;
                        } else if(currentNode.left == null) root = currentNode.right;
                    } else {
                        if(parentNode.left == currentNode){
                            if(currentNode.right == null){
                                parentNode.left = currentNode.left;
                            } else {
                                parentNode.left = currentNode.right;
                            }
                        }else {
                            if(currentNode.right == null){
                                parentNode.right = currentNode.left;
                            } else {
                                parentNode.right = currentNode.right;
                            }
                        }
                    }
                }
                break; 
             }
        }
    }

    int getMinValue(Node currentNode){
        if(currentNode.left == null) return currentNode.data;
        else return getMinValue(currentNode.left);
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

    void inOrder(Node currentNode){
        if(currentNode == null) return;

        inOrder(currentNode.left);
        System.out.print(currentNode.data + " ");
        inOrder(currentNode.right);
    }

    void postOrder(Node currentNode){
        if(currentNode == null) return;

        postOrder(currentNode.left);
        postOrder(currentNode.right);
        System.out.print(currentNode.data + " ");
    }

    void preOrder(Node currentNode){
        if(currentNode == null) return;

        System.out.print(currentNode.data + " ");
        preOrder(currentNode.left);
        preOrder(currentNode.right);
    }


    int findClosest(int data){
        Node currentNode = root;
        int closest = currentNode.data;
        int diff = Math.abs((closest - data));
        while(currentNode != null){
            if(currentNode.data == data) return data;
            if(diff >  Math.abs((currentNode.data - data))){
                closest = currentNode.data;
            }
            if(currentNode.data > data) currentNode = currentNode.left;
            else currentNode = currentNode.right;
            
        }

        return closest;
    }

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Number of elements: ");
        // int n = sc.nextInt();

        BinarySearchTree ob = new BinarySearchTree();
        ob.insert(10);        // System.out.println("Enter the elements: ");
        ob.insert(8);        // System.out.println("Enter the elements: ");
        ob.insert(11);        // System.out.println("Enter the elements: ");
        ob.insert(4);        // System.out.println("Enter the elements: ");
        ob.insert(25);        // System.out.println("Enter the elements: ");
        // for(int i = 0; i < n;i++){
        //     ob.insert(sc.nextInt());
        // } 


        System.out.println("Binary Search Tree: ");
        ob.display(ob.root);

        // System.out.print("\nElement to Search: ");
        // int e = sc.nextInt();

        // ob.remove(8);
        // if(ob.contains(8)){
        //     System.out.println(8 + " is present in the BST");
        // } else System.out.println (8 + " is NOT present in BST");

        // ob.display(ob.root);

        System.out.print("\nIn Order: " );
        ob.inOrder(ob.root);

        System.out.print("\nPre Order: ");
        ob.preOrder(ob.root);

        System.out.print("\nPost Order: ");
        ob.postOrder(ob.root);

        System.out.println("\nClosest to 15: " + ob.findClosest(15));

        // System.out.print("Element to delete: ");
        // int del = sc.nextInt();

        // ob.remove(del);
        // ob.display(ob.root);

        // sc.close();

    }
}
