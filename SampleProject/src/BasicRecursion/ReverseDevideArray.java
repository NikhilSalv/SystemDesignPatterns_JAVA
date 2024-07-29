package BasicRecursion;

public class ReverseDevideArray {
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	public static int[] RreverseDevide(int[] arr) {
		
		int p2 = arr.length -1;
		int p1 = 0;
		
		while(p1<p2) {
			swap(arr,p1, p2);
			p1++;
			p2--;
			
		}
		return arr;
		
		
	}
	

	public static int[] RreverseRecurse(int[] arr,int start, int end) {
		
		if(start>=end ) {
			return arr;
		}
		swap(arr, start, end);
		
		return RreverseRecurse(arr, start +1, end -1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,2,4,54,3,0,3};
//		int [] result = RreverseDevide(arr);
//		for (int n=0;  n < result.length; n++) {
//			System.out.println(result[n]);
//		}
		int start =0;
		int end = arr.length -1;
		int [] result2 = RreverseRecurse(arr,start , end);
		System.out.println("Reverse using recursion : ");
		for (int m=0;  m < result2.length; m++) {
			System.out.println(result2[m]);

	}
	}
}
