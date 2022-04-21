package week1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)
		int fN = 0, sN = 1, tN, i, count = 8;
		// Print first number
		System.out.println(fN +"\n"+ sN);
		for (i = 2; i <= count; ++i) {
			// add first and second number assign to sum
			tN = fN + sN; // add first and second number assign to sum
			System.out.println(" " + tN);
			fN = sN;
			sN = tN;
		}

	}
}