package Nikhil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Consumer<Integer> con = (Integer n) ->  System.out.println(n);
		Function<Integer,Integer> fun = new Function<Integer,Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*t;
			}
			
		};
		
		var list = Arrays.asList(1,2,3,4,55,6,4,50);
		System.out.println("Type is : " + list.getClass());
		
		list.forEach(con);
		
//		list.forEach((Consumer<? super Integer>) fun);
	}

}
