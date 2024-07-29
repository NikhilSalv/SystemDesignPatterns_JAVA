package Nikhil;

class Calc {
	public  int add(int x,int y) {
		return x + y ;
		
	}
	
	
}

public class Demo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		int num1 = 5;
//		int num2 = 6;
//		Calc cal = new Calc();
//		System.out.println(cal.add(num1, num2));	
		int num[] = new int[4];
		int num2[][] = new int[3][3];
		
		for(int i=0; i < num2.length;) {
			
			for(int j=0; j < num2[0].length;) {
				
				num2[i][j] = (int)(Math.random() *10);
				System.out.print(num2[i][j] + " ");
				j++;
			}
			System.out.println("");
			i++;
			}
		for(int g[] :num2) {
			for(int h :g) {
				System.out.println(h);
			}
			
		}

	}

}
