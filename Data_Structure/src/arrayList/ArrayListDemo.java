package arrayList;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		// by default capacity is 10
		ArrayList<Integer> arr = new ArrayList<>();
		
		// or specify the capacity
//		ArrayList<Integer> arr = new ArrayList<>(20);

		arr.add(10);		// size = 1
		arr.add(20);		// size = 2
		arr.add(30);
		arr.add(10);
//		arr.set(0, 44);
//		arr.add(1, 50);
//		arr.remove(1);
		// Integer object
		Integer p = 10;
		arr.remove(p);
		
		for(int i = 0 ;i <arr.size() ; i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println();
		
		// enhanced for loop
		for(int i : arr) {
			System.out.println(i);
		}
		
//		System.out.println(arr.get(1));
//		System.out.println(arr.size());
		
		
//		ArrayList<String> str = new ArrayList<>();
//		str.add("Mudit");
//		str.add("Garg");
//		System.out.println(str.get(0));

	}

}
