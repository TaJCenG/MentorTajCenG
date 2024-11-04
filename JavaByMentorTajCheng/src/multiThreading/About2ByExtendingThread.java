package multiThreading;


class byExtrending extends Thread{
	public void run() {
		for (int o =0; o<5; o++) {//running
			 System.out.println("Hi" +Thread.currentThread().getName());
		}
	}
}

public class About2ByExtendingThread {

	public static void main(String[] args) {
		byExtrending be1 = new byExtrending();//new
		byExtrending be2 = new byExtrending();
		be1.start();///runnable
		be2.start();
	}

}
