package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int input = 13;
		// Declare a boolean variable flag as false
		boolean flag = false;
		// Iterate from 2 to half of the input
		for (int i = 2; i <= input / 2; ++i) {
			// Divide the input with each for loop variable and check the remainder (if its
			// not a prime number)
			if (input % i == 0) {
				flag = true;
				// break the iterator
				break;
			}

		}
		// Print 'Prime' when the condition matches
		if (!flag)
			System.out.println(input + " is a prime number.");
		// Print 'Not a Prime' when the condition doesn't match
		else
			System.out.println(input + " is not a prime number.");
	}

}