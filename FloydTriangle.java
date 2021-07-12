import java.util.Scanner;
public class FloydTriangle {

	public static void main(String[] args) {
		int rows, number = 1, i,j;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows for Floyd's Triangle: ");
		rows = input.nextInt();
		System.out.println("Floyd's Triangle");
		System.out.println("*****************************");
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(number+ " ");
				number++;
			}
			System.out.println();
		}

	}

}
