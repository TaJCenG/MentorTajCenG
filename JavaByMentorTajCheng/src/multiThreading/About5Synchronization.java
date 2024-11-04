package multiThreading;




public class About5Synchronization {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Sync t1 = new Sync(counter);
		Sync t2 = new Sync(counter);
		t1.start();	
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			
		}System.out.println(counter.getCount());
	}

}
