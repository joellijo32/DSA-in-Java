import java.util.*;
public class linkedlist{
	public static void main(String args[]){
		LinkedList<Integer> link = new LinkedList<Integer>();
		link.add(3);
		link.add(532);
		link.add(0, 2);
		System.out.println("Original Linkedlist: " + link);
		link.set(0, -31);
		System.out.println("First value swapped: " + link);
	}
}
