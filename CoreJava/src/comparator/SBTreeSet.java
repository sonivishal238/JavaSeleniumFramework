package comparator;

import java.util.Set;
import java.util.TreeSet;

public class SBTreeSet {

	public static void main(String[] args) {
		
		Set<StringBuffer> set = new TreeSet<>(new SBComparator());

		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("def"));
		set.add(new StringBuffer("mno"));
		
		for(StringBuffer str : set) {
			System.out.println(str);
		}
	}

}
