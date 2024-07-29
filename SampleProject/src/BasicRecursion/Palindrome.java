package BasicRecursion;

public class Palindrome {
	
	public static boolean IfPalndrome(String s) {
		
		int left = 0, right = s.length() -1;
		while (left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(IfPalndrome("ABCDCBs"));

	}

}
