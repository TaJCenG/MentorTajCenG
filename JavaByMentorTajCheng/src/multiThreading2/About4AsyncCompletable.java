package multiThreading2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class About4AsyncCompletable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture.runAsync(() -> {
			System.out.println("Thread name: " + Thread.currentThread().getName());
			System.out.println("Http call goes here...");
		});
		
		TimeUnit.SECONDS.sleep(2);
		
		ExecutorService es = Executors.newCachedThreadPool();
		CompletableFuture.runAsync(() -> {
			System.out.println("Thread name: " + Thread.currentThread().getName());
			System.out.println("Http call goes here...");
		}, es);
		
		es.shutdown();
		
	}

}
