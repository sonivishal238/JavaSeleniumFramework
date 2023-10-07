package Program;
import java.util.Scanner;
import static java.lang.System.out;

public class Practice {

	public static void main(String[] args) {

	System.out.println("Enter two numbers: ");
	Scanner console = new Scanner(System.in);
	
	int number1 = Integer.parseInt(console.next());
	int number2 = Integer.parseInt(console.next());
	
	out.println("Sum is: " + (number1 + number2));
	console.close();
	
	System.out.println(Math.sqrt(2));
	}
	
}
