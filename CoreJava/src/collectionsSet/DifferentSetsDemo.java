//package collectionsSet;
//
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Random;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class DifferentSetsDemo {
//
//	public static void main(String[] args) {
//		
//		// HashSet
//		// LinkedHashSet
//		// TreeSet
//
//		Random random = new Random();
//		
//		Set<Integer> hashSet = new HashSet<Integer>();
//		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
//		Set<Integer> treeSet = new TreeSet<Integer>();
//		
//		for(int i = 0; i<=5; i++) {
//			int number = random.nextInt(100);
//			hashSet.add(number);
//			linkedHashSet.add(number);
//			treeSet.add(number);
//			System.out.println(number);
//		}
//		
//		System.out.println("Hashset:" + hashSet);
//		System.out.println("Linked Hashset:" + linkedHashSet);
//		System.out.println("tree set:" + treeSet);
//	}
//}
