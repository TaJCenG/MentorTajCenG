package multiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Async Process
//Thread 2 Attempting to withdraw 50
//Thread 1 Attempting to withdraw 50
//Thread 2 Processing withdraw amount 
//Thread 1 Processing withdraw amount 
//Thread 2Completed withdrawl, Remaining balance: 900
//Thread 1Completed withdrawl, Remaining balance: 950
//class BankAccount{
//	private int  balance = 1000;
//	
//	public void withdraw(int amount) {
//		System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
//		if(balance >= amount) {
//			System.out.println(Thread.currentThread().getName() + " Processing withdraw amount ");
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				
//			}balance -= amount;
//			System.out.println(Thread.currentThread().getName() + "Completed withdrawl, Remaining balance: " + balance);
//		}else {
//			System.out.println(Thread.currentThread().getName() + " Insufficient balance");
//		}
//	}
//}

//Sync Process
//Thread 1 Attempting to withdraw 50
//Thread 1 Processing withdraw amount 
//Thread 1Completed withdrawl, Remaining balance: 950
//Thread 2 Attempting to withdraw 50
//Thread 2 Processing withdraw amount 
//Thread 2Completed withdrawl, Remaining balance: 900

class BankAccount{
	private int  balance = 1000;
	private final Lock lock = new ReentrantLock();
	public synchronized  void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);
		try {
		if(lock.tryLock(1000,TimeUnit.MILLISECONDS)) {		
		if(balance >= amount) {
			try {
			System.out.println(Thread.currentThread().getName() + " Processing withdraw amount ");
				Thread.sleep(3000);
				balance -= amount;
				System.out.println(Thread.currentThread().getName() + "Completed withdrawl, Remaining balance: " + balance);
			}catch(Exception e) {			
			}finally {
				lock.unlock();
			}
		}else {
			System.out.println(Thread.currentThread().getName() + " Insufficient balance");
		}
	}else {
		System.out.println(Thread.currentThread().getName() + " Insufficient balance");
	}		
	}catch(Exception e) {
}}
}
public class About5Lock {

	public static void main(String[] args) {

		BankAccount sbi = new BankAccount();
		Runnable task = new Runnable() {

			@Override
			public void run() {
				sbi.withdraw(50);
			}
		};

		Thread t1 = new Thread(task, "Thread 1");
		Thread t2 = new Thread(task, "Thread 2");
		t1.start();
		t2.start();
	}

}
