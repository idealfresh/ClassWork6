
public class Main {

	public static void main(String[] args) {
		

int[] numbers = new int[12];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;

		for (int i = 4; i < numbers.length; i++) {
		    numbers[i] = i + 1;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
	}
}