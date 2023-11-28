package collectionslist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<=100; i+=10) {
			list.add(i);
		}
		
		System.out.println("list: " + list);
		list.add(2, 100);
		System.out.println("List after insertion: " + list);
		list.set(3, 200);
		System.out.println("List after Replace: " + list);
		
		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		
		System.out.println("Second List: " + secondList);
		list.addAll(4, secondList);
		System.out.println("First List after merging second:" + list);
		
		
		for(int i : list) {
			System.out.println(i);
		}
		
		list.remove(1);
		
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		
		System.out.println("list after removal: " + list);
	}
}
