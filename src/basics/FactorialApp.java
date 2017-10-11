package basics;

public class FactorialApp {

	public static void main(String[] args) {
		// factorial number is defined by the product of an integer and all the integers below it
		// fac(0) = 0
		// fac(1) = 1 x 1 = 1
		// fac(2) = 2 x 1 = 2
		// fac(3) = 3 x 2 x 1 = 6
		// fac(4) = 4 x 3 x 2 x 1 = 24
		
		System.out.println((2));

	}
	
	public static int fac(int n) {
		if (n == 0) {
			return 1;
		}
		else if (n == 1) {
			return 1;
		}
		return (fac(n-1) * fac(n));
	}

}
