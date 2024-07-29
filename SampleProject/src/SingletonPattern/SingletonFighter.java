package SingletonPattern;

public class SingletonFighter {
	
	private static SingletonFighter fighterInstance;
	
//	fighterInstance = new SingletonFighter();
	
	
	
	private SingletonFighter() {};
	
	public static synchronized SingletonFighter getInstance() {
		
		if( fighterInstance == null) {
			
			fighterInstance = new SingletonFighter();

		}
		
		return fighterInstance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Thread t1 = new Thread(()-> {
//			for(int i = 0; i < 1000; i++) {
//				System.out.println(SingletonFighter.getInstance());
//
//				
//			}
//			
//		});
//		
//		Thread t2 = new Thread(()-> {
//			
//			for(int i = 0; i < 1000; i++) {
//				System.out.println(SingletonFighter.getInstance());
//		
//			}
//			
//		});
//		
//		t1.start();
//		t2.start();
//		
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		SingletonFighter result = SingletonFighter.getInstance();
		
		System.out.println(result);
		

	}

}
