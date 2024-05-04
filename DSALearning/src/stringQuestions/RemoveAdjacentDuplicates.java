package stringQuestions;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		
		String res = removeAdjacentDuplicatesUsingStack("aazbbby");
		System.out.println(res);
		
	}
	
	static String removeAdjacent(String str) {
		
		if(str.length() == 1) {
			return str;
		}
		
		ArrayList<Character> result = new ArrayList<Character>();
		
		char[] sArray = str.toCharArray();
		result.add(sArray[0]);
		int last = 0;
		
		int size = sArray.length;
		
		int i = 1;
		while(i < size) {
			
			if(result.size() == 0 || result.get(last) != sArray[i]) {
				result.add(sArray[i]);
				last++;
			}
			
			else{
				result.remove(last);
				last--;
			}
			
			i++;
		}
		
		String output = "";
		for(char c : result) {
			output+=c;
		}
		return output;
	}
	
    public static String removeAdjacentDuplicatesUsingStack(String str) {
        Stack<Character> stack = new Stack();
        for (char c : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

}
