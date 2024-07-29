package Nikhil;

class CalcA {
	public int add(int a, int b) {
		return a +b;
	}
}

class AdvanceCalc extends CalcA{
	
}

public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdvanceCalc obj = new AdvanceCalc();
		System.out.println(obj.add(4, 1));
		System.out.println(obj.getClass().getName());

	}

}
