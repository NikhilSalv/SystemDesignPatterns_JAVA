package BasicRecursion;

public class ReverseNum {
	
	public static  String ReverseNumber(int i, int n) {
		if( i < n) {
			String result = "Finished";
			return result;
			
		}
		System.out.println(i);
		return ReverseNumber(i-1,n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseNumber(50,12));

	}

}
