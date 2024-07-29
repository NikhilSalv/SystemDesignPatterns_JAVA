package BasicRecursion;

public class FactorialN {
	
	public static int product = 1;
	
	public static int Factorial(int n) {
		
		if(n <1) {
			return product;
		}
		product *= n;
		return Factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial(5));

	}

}
