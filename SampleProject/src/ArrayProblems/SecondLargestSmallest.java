package ArrayProblems;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestSmallest {
	
	public static int print2largest(List<Integer> arr) {
		int firstlargest = arr.getFirst();
		int secondlargest = 0;
        for(int i = 1; i < arr.size(); i++ ) {
        	if(arr.get(i) > firstlargest) {
        		firstlargest = arr.get(i);
        	}
        }
        System.out.println(firstlargest);
        
        for(int j = 0; j < arr.size(); j++ ) {
        	if(arr.get(j) < firstlargest && arr.get(j) > secondlargest ) {
        		secondlargest = arr.get(j);
        		System.out.println("Yes, Smaller " + secondlargest);
        	}
        
        	
        }
        // Code Here
		return secondlargest;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(2,1,3,1,33,4,2,4553,2,13,4,1,3,4);
		System.out.println(print2largest(arr));

	}

}
