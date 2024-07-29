package Nikhil;


class AThread extends Thread {
	
	public void run() {
		for(int i=0;i< 50;i++) {
			int count;
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class BThread extends Thread {
	
	public void run() {
		for(int j=0;j< 50;j++) {
			System.out.println("Hii");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class SampleThread {

	public static void main(String[] args) {
		
		AThread obj1 = new AThread();
		BThread obj2 = new BThread();
		
		obj1.setPriority(1);
		obj1.start();
		obj2.start();
	
		
		
		// TODO Auto-generated method stub

	}

}
