package BasicRecursion;

public class BasRec {
	public static String printFun(int i, int n) {
		if(i>n) {
			String result = "Finisshed";
			return result;
		}
//		i += 1;
		System.out.println(i);
		return printFun( i+1,  n);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String finalStack = printFun(4,10);
		System.out.println(finalStack);

	}

}
