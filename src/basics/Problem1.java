package basics;

public class Problem1 {

	public static void main(String[] args) {

		System.out.println("Sum = " + Sum(10)); 
		System.out.println("Sum = " + Sum(11)); 
		System.out.println("Sum = " + Sum(12));
		System.out.println("Sum = " + Sum(13)); 
			
		
	}
	
	public static int Sum(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

}
