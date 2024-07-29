package BasicRecursion;

public class FirstNSum {
	public static int sum = 0;
	
	public static int SumFirstN(int n) {
		if (n<1) {
			return sum;
		}
		sum = sum + n;
		SumFirstN(n-1);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumFirstN(6));

	}

}
