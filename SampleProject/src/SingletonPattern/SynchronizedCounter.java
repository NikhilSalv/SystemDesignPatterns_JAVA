package SingletonPattern;

public class SynchronizedCounter {
	
	public static int instance = 0;
	
	public synchronized static void increament() {
		instance ++;
	}
	
	public static int getCount(){
		return instance;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(()-> {
			for(int i = 0; i <100000; i++) {
				SynchronizedCounter.increament();
			}
			
		});
		
		Thread t2 = new Thread(()-> {
			for(int i = 0; i <100000; i++) {
				SynchronizedCounter.increament();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int result = SynchronizedCounter.getCount();
		System.out.println(result);

	}

}
