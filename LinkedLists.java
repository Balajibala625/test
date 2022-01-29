import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedLists
{
	public static void main(String[] args) {
		LinkedList<Integer> a1=new LinkedList<Integer>();
		a1.add(56);
		a1.add(78);
		a1.add(98);
		a1.add(2,43);
		a1.addFirst(1);
		a1.addLast(100);
		System.out.println(a1);
		System.out.println(a1.element());
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println(a1.indexOf(a1));
		System.out.println(a1.offerFirst(65));
		System.out.println(a1.offerLast(101));
		System.out.println(a1);
		System.out.println(a1.peekFirst());
		System.out.println(a1.peekLast());
		System.out.println(a1.poll());
		System.out.println(a1);
		System.out.println(a1.pop());
		System.out.println(a1);
		a1.push(102);
		System.out.println(a1);
		
	}
}