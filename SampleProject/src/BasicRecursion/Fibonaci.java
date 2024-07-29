package BasicRecursion;

public class Fibonaci {
	
	public static int[] FibonacciSeries(int n) {
		
		int[] series = new int[n+1];
		series[0] = 0;
		series[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			series[i] = series[i-1] + series[i-2];
		}
		
		
		return series;
		
	}
	
	public static int[] FibonacciRecursion(int[] series,int n, int j) {
		
		if(j > n) {
			return series;
		}
		
		series[j] = series[j-1] + series[j-2];
		return FibonacciRecursion(series, n, j+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 6;
		int[] series = new int[m+1];
		series[0] = 0;
		series[1] = 1;
		int [] result = FibonacciRecursion(series,6,2);
		
		System.out.println("The Fibonacci Series up to "+m+"th term:");
		for(int n: result) {
			System.out.println(n);
		}
		
	}

}
