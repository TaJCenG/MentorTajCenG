package multiThreading;


class MyThread extends Thread{
	public void run() {
		
			 System.out.println("Running");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}


//OUTPUT
//NEW
//RUNNABLE
//Running
//TIMED_WAITING
//TERMINATED




public class About4ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(200);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());
	
	}

}
