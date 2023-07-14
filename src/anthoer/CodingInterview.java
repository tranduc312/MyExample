package anthoer;

public class CodingInterview {
	

	private static final String BREAK_LINE = "****************************";

	public static void main(String[] args) {
		// cols, rows, max
		print(4, 9, 9);
		
	}

	static void print(int cols, int rows, int max) {
		int fromMax = 1;
		int section = (int) Math.ceil((float) max / cols);
		printHeader(cols, rows, max);
		for (int i = 0; i < section; i++) {
			printSection(cols, rows, max, fromMax);
			// set fromMax
			fromMax += cols;
			System.out.println(BREAK_LINE);
		}
	}
	
	static void printHeader(int cols, int rows, int max) {
		System.out.println("********* Complex Answer *********");
		System.out.println("input cols : " + cols);
		System.out.println("input rows : " + rows);
		System.out.println("input max : " + max);
		System.out.println(BREAK_LINE);
	}
	
	static void printSection(int cols, int rows, int max, int fromMax) {
		for (int i = 1; i <= rows; i++) {
			printRow(i, cols, max, fromMax);
			System.out.println();
		}
	}

	static void printRow(int index, int cols, int max, int fromMax) {
		for (int i = 1; i <= cols; i++) {
			multiplication(fromMax, index, max);
			fromMax++;
		}
	}
	
	static void multiplication(int a, int b, int max) {
		if (a > max) return;
		System.out.print(a + " * " + b + " = " + a * b);
		System.out.print("\t");
	}
	
}
