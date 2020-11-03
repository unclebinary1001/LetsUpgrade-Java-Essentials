
public class PrintOddValues {
	public static void main(String args[]) {
		//Declare array with five values
		int[] arr = {45,67,24,64,124};
		//Check arr for odd values and then print them
		for(int i = 0; i<arr.length; i++) {
			if((arr[i]%2)!=0) {
				System.out.println(arr[i]);
			}
		}
	}
}
