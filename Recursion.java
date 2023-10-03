import java.util.*;
public class Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number -> ");
		int number = sc.nextInt();


		int result = factorial(number);
		System.out.println("Factorial number of " + number + " is: " + result);
	}

	public static int factorial(int number) {
		if(number == 0) {
			return 1;
		}else {
			return number * factorial(number - 1);
		}
		

	}

}
