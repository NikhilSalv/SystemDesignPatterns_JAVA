package TakeuforwardAtoZ;


public class SelectionSort {
	
	static int[] nums = {12,3,33,4,23,122,3442,21,1,34,2,0,434,21,34};

	public static void swap(int[] array, int a,int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
	}
	
	public static int[] selectionSort(int[] array) {
			for(int i =0; i < array.length -1; i++){
				int mini = i;
				for(int j = i+1; j<array.length;j++) {
					if(array[j] < array[mini]) {
						mini = j;
					}
				}
				swap(array,mini,i);
		}
		return array;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] result = selectionSort(nums);
		
		for(int n: result) {
			System.out.println(n);
		}
		


	}

}
