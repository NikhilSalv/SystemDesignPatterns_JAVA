package TakeuforwardAtoZ;

public class insertionSort {
	
	public static void swap(int[] array, int a,int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
	}
	
	public static int[] InsertionSort(int[] arr) {
		
		for(int i=0;i < arr.length ;i++) {
			for(int j =i ; j > 0 ; j--) {
				while (arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
				
			}
		}
		
		return arr;
	}
	
	public static int[] InsertionSortRecurtion(int[] arr, int i) {
		
		if(i > arr.length -1) {
			return arr;
		};
		int j = i;
		while(j>0) {
			
			if(arr[j] < arr[j-1]) {
				swap(arr, j, j-1);
			}
				j--;
	
		}
		return InsertionSortRecurtion(arr, i+1);
		
	}
	

	public static void main(String[] args) {
		
		
		
		final int[] nums = {12,3,33,4,23,122,3442,21,1,34,2,0,434,21,34};
		
		int[] result = InsertionSortRecurtion(nums,0);
		
		for(int n: result) {
			System.out.println(n);
		}
		// TODO Auto-generated method stub

	}

}
