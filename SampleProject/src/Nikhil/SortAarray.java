package Nikhil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


 class Student2{
	
	int age;
	String name;


	public Student2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student2 [age=" + age + ", name=" + name + "]";
	}
	
	
	
}

public class SortAarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Comparator<Integer> com = new Comparator<>() {
//			public int compare(Integer i, Integer j) {
//				if( i%10 >  j%10)
//					return 1;
//				else
//					return -1;
//				
//			}
//		};
		Comparator<String> stringcom = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
                return s1.compareTo(s2);  // natural ordering
            }
		};
		
		List<Integer> list = new ArrayList<>();
		List<String> obj = new ArrayList<>();
		
		List<Student2> stud = new ArrayList<>();
		
		stud.add(new Student2(20,"Nikhil"));
		stud.add(new Student2(22,"Soa"));
		System.out.println(stud.get(0));
		
		
		obj.add("hi");
		obj.add("hjfdjk");
		obj.add("lisjefg");
		
		obj.add("");
		obj.add("l");
		
		list.add(23);
		list.add(12);
		list.add(288);
		list.add(21);
		list.add(122);
		list.add(120);
		list.add(129);
		
//		Collections.sort(list,com);
		Collections.sort(obj,stringcom);
		
		System.out.println(list);
		System.out.println(obj.get(1));
		System.out.println(obj.get(2));
		
		
		System.out.println(obj.get(2).compareTo(obj.get(1)));
		
//		int l = obj.size();
//		for(int l =obj.size() ;l>=0;l--) {
//			try {
//			System.out.println(obj.get(l).compareTo(obj.get(l+1)));
//			}
//			catch (IndexOutOfBoundsException e) {
//				System.out.println("Index Exhausted  " + e);
//			}
//		}
//		

	}

}
