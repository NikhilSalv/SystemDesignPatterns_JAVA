package TakeuforwardAtoZ;

import java.util.Scanner;

public class SampleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		System.out.println("Number is " + num);
		
		switch(num) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tue");
			break;
		case 3 :
			System.out.println("Wed");
			break;
		case 4 :
			System.out.println("Thur");
			break;
		case 5 :
			System.out.println("fRI");
			break;
		case 6 :
			System.out.println("Sat");
			break;
		case 7 :
			System.out.println("Sun");
			break;
		default :
			System.out.println("Invalid");
		
		}
		scanner.close();
		

	}

}
