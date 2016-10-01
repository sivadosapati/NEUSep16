
public class Arrays {
	
	public int smallestNumberInArrayOfThreeNumbers(int array[]){
		if( array[0] < array[1]){
			if( array[0] < array[2]){
				return array[0];
			}
			return array[2];
		}
		else{
			if( array[1] < array[2]){
				return array[1];
			}
			else{
				return array[2];
			}
		}
	}

	public int[] arrangeInAscendingOrder(int[] numbers) {
		int output[] = new int[3];
		output[0] = numbers[0];
		output[1] = numbers[1];
		output[2] = numbers[2];
		int a = numbers[0];
		int b = numbers[1];
		int c = numbers[2];
		if (a > b) {
			if (a > c) {
				output[2] = a;
				if (b > c) {
					output[1] = b;
					output[0] = c;
				} else {
					output[1] = c;
					output[0] = b;
				}
			} else {
				output[2] = c;
				output[1] = a;
				output[0] = b;
			}
		} else {
			if (b > c) {
				output[2] = b;
				if (a > c) {
					output[1] = a;
					output[0] = c;
				} else {
					output[1] = c;
					output[0] = a;
				}
			} else {
				output[2] = c;
				output[1] = b;
				output[0] = a;
			}
		}
		return output;
	}

	void printArray(int array[]) {
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}

	public static void main(String args[]) {
		Arrays arrays = new Arrays();

		int numbers[] = { 10, 11, 5 };
		System.out.println(arrays.smallestNumberInArrayOfThreeNumbers(numbers));
		int output[] = arrays.arrangeInAscendingOrder(numbers);
		arrays.printArray(output);
	}
}
