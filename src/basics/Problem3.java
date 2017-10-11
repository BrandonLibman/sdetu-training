package basics;

public class Problem3 {

	public static void main(String[] args) {
		
		int[] values = new int[] {8,7,2,3,1,10,4,5,6,9};
		
		System.out.println("AVG value of array is: " + Average(values));
		System.out.println("Min value of array is: " + Min(values));
		System.out.println("Max value of array is: " + Max(values));

	}

	public static double Average(int[] values) {
		double average = SumOfArray(values) / values.length;
		
		return average;
	}
	
	public static double SumOfArray(int[] values){
		int sum = 0;
		
		for(int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		
		return sum;
	}
	
	public static int Min(int[] values) {
		int min = values[0];
		
		for(int i = 0; i < values.length; i++) {
			int currentValue = values[i];
			
			if (currentValue < min) {
				min = currentValue;
			}
		}
		
		return min;
	}

	public static int Max(int[] values) {
		int max = values[0];
		
		for(int i = 0; i < values.length; i++) {
			int currentValue = values[i];
			
			if (currentValue > max) {
				max = currentValue;
			}
		}
		
		return max;
	}
	
	

}
