package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous numbers
		// Fib(0) = 0
		// Fib(1) = 1
		// Fib(2) = Fib(1) + Fib(0) = 0 + 1 = 1
		// Fib(3) = Fib(2) + Fib(1) = 1 + 1 = 2
		// Fib(4) = Fib(3) + Fib(2) = 2 + 1 = 3
		// Fib(5) = Fib(4) + Fib(3) = 3 + 2 = 5
		System.out.println(fib(40));
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}

	
}
