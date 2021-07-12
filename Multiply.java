import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int i = scan.nextInt();
		System.out.println("Enter second number: ");
		int j = scan.nextInt();
		int mul = i*j;
		System.out.println("The Multiplication is: "+ mul);

	}

}
