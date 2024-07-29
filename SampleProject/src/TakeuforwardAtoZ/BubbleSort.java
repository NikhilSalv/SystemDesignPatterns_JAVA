package TakeuforwardAtoZ;

public class BubbleSort {
	
	public static void swap(int[] array, int a,int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
	}
	
	public static int[] BubbleSortalgo(int[] arr) {
		for(int i= arr.length -1; i >= 0 ; i--) {
			for(int j=0; j< i;j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
					
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] nums = {12,3,33,4,23,122,3442,21,1,34,2,0,434,21,34};
		
		int[] result = BubbleSortalgo(nums);
		
		for(int n: result) {
			System.out.println(n);
		}

	}

}
