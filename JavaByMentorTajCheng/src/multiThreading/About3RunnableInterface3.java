package multiThreading;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(" MyRunnable ");
			System.out.println(Thread.currentThread().getId()+ "value : " + i);
			
		}
		
	}
	
}
public class About3RunnableInterface3 {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
		System.out.println(" t");
		Thread t2 = new Thread(new MyRunnable());
		t2.start();
		System.out.println(" t2 ");

	}

}
