import java.util.*;
public class linkedlist{
	public static void main(String args[]){
		/*
		LinkedList<Integer> link = new LinkedList<Integer>();
		link.add(3);
		link.add(532);
		link.add(0, 2);
		System.out.println("Original Linkedlist: " + link);
		link.set(0, -31);
		System.out.println("First value swapped: " + link);
		link.remove(Integer.valueOf(-31));
		System.out.println("After removing -31: " + link);
		link.add(0, -31);
		link.remove(0);
		System.out.println("The linked list: ");
		for(int i = 0; i < link.size(); i++){
			System.out.print(link.get(i) + " ");
		}
		System.out.println();

					*/

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.print("Enter the size: "); int size = sc.nextInt();
		if(size <= 0){
			System.out.println("Invalid size.");return;
		}
		System.out.println("Enter the values: ");
		for(int i = 0;i < size; i++){
			list.add(sc.nextInt());
		}
		System.out.println("The linked list entered: " + list);

	}
}
