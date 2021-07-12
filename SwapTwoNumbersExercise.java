
public class SwapTwoNumbersExercise {
	
	public static void main(String[] args) {
		float first = 2.50f, second = 4.50f;
		System.out.println("--Before Swapping--");
		System.out.println("First Number = "+first);
		System.out.println("Second Number = "+second);
		
		float temp = first;
		first = second;
		second = temp;
		
		System.out.println("--After Swap--");
		System.out.println("First Number = "+first);
		System.out.println("Second Number = "+second);
		
	}

}
