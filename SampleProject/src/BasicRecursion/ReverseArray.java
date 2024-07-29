package BasicRecursion;

public class ReverseArray {
	
	public static int[] reverse(int[] arr) {
		int[] ans =new int[arr.length];
		for(int i = arr.length -1; i < 1 ; i--) {
			ans[arr.length - i - 1] = arr[i];
		};
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,2,4,54,3,0,3};
		int [] result = reverse(arr);
		for (int n=0;  n < result.length; n++) {
			System.out.println(result[n]);
		}

	}

}
