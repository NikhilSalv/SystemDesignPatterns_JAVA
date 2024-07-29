package BasicRecursion;
import java.util.Arrays;

public class SortBruteforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int[] nums = {12,3,33,4,23,122,3442,21,1,34,2,0,434,21,34};
		
		Arrays.sort(nums);
		
		for(int n: nums) {
			System.out.println(n);
		}

	}

}
