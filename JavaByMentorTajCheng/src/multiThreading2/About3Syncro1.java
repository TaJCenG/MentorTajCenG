package multiThreading2;

import java.util.concurrent.TimeUnit;

class Notifier implements Runnable {

	private Message message;

	public Notifier(Message m) {
		this.message = m;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			TimeUnit.MILLISECONDS.sleep(100);
			synchronized (message) {
				message.setMessage(name + " Notifier work done");
//				message.notify();
				message.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Notifier finished work");
	}

}

 class Reader implements Runnable {

	private Message message;

	public Reader(Message m) {
		this.message = m;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (message) {
			try {
				System.out.println(name + 
						" waiting to get notified at time:" 
						+ System.currentTimeMillis());
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " waiter thread got notified at time:" + System.currentTimeMillis());
			System.out.println(name + " processed: " + message.getMessage());
		}
	}

}

 class Message {
	private String message;
    
    public Message(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
 }
    
public class About3Syncro1 {

	public static void main(String[] args) throws InterruptedException {
		Message message = new Message("process it");
		Reader reader1 = new Reader(message);
		new Thread(reader1, "READER 1").start();

		Reader reader2 = new Reader(message);
		new Thread(reader2, "READER 2").start();

		Notifier notifier = new Notifier(message);
		new Thread(notifier, "NOTIFIER").start();
		System.out.println("All the threads are started");
	}

}