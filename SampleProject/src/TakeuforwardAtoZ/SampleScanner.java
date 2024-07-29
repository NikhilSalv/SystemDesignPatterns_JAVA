package TakeuforwardAtoZ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class SampleScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner prompt = new Scanner(System.in);
//		
//		System.out.println("Enter text");
//		String text = prompt.nextLine();
//		prompt.close();
//		System.out.println("Enterred" + text);
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		String name = bf.readLine();
		System.out.println("Enterred name");
		System.out.println(name);
		
		System.out.print("Enter your age: ");
        int age = Integer.parseInt(bf.readLine());
        System.out.println("Enterred age");
		System.out.println(age);

	}

}
