package collectionsSet;

import java.util.Set;
import java.util.TreeSet;

import comparator.StringComparator;

public class StringTreeSet {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(new StringComparator());

		set.add("abcjfiffd");
		set.add("xyzd");
		set.add("deffdbdfbgdghdhh");
		set.add("mn");
		
		for(String str : set) {
			System.out.println(str);
		}
	}

}
