package ArrayProblems;


class Solution {
//    public static int largest(int n, int[] arr) {
//        // int max = arr[0];
//        // for(int i = 1; i<n; i++){
//        //     if(arr[i] > max){
//        //         max = arr[i];
//        //     }
//            
//        // }
//        // return max;
//        return largestRecursive(arr,n-1);
        
        public static int largestRecursive(int[] arr, int index){
            if(index == 0){
                return arr[0];
            }
            
            int current = arr[index];
            int prevElement = largestRecursive(arr, index-1);
            return Math.max(current,prevElement );
            
        };
    }

public class LargestNum {
	
	static int LargestElement(int[] arr) {
		int max = arr[0];
		
		for(int i=1; i < arr.length; i++ ) {
			if(arr[i] > max) {
				max = arr[i];
			}
	}
	// TODO Auto-generated method stub
		return max;
	
	};
	
    public static int largestRecursive(int[] arr, int index){
        if(index == 0){
            return arr[0];
        }
        
        int current = arr[index];
        int prevElement = largestRecursive(arr, index-1);
        return Math.max(current,prevElement );
        
    };

	public static void main(String[] args) {
		
		int[] arr = {2,422,5,3,66,7,8,1,34};
		
		int result2 = largestRecursive(arr, arr.length-1);
		

		int result = LargestElement(arr);
		System.out.println(result2);
		
		

	}

}