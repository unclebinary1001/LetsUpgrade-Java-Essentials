import java.util.Scanner;
public class SumOfArray {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.println("Enter 5 numbers and press enter "
				+ "after every entry");
		for(int i=0; i<arr.length;i++) {
			arr[i] = input.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println();
		System.out.println("The sum of the input values "
				+ "is "+sum);
	}
}
