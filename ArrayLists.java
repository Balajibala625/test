import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayLists
{
	public static void main(String[] args) {
	
		ArrayList<Integer> a1=new ArrayList<Integer>();
	    a1.add(10);//1st Method
		a1.add(6); 
		a1.add(5); 
		a1.add(2,7);//2nd Method 
		System.out.println(a1);
		System.out.println(a1.indexOf(6));//4th Method
		System.out.println(a1.indexOf(a1));
		System.out.println(a1.lastIndexOf(a1));
		System.out.println(a1.size());//5th Method
		System.out.println(a1.isEmpty());//6th Method
		System.out.println(a1.set(3,199));//7th Method
		System.out.println(a1);
		System.out.println(a1.contains(199));//8th Method
		System.out.println(a1.get(1));//9th Method
		System.out.println(a1.remove(2));//10th Method
		System.out.println(a1);
		a1.clear();//11th Method
		System.out.println(a1);
		
	}
}
