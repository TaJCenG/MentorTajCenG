package multiThreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
   private static final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
   private static final int MAX_SIZE = 10;

   public static void main(String[] args) {
       Thread producerThread = new Thread(() -> {
           try {
               while (true) {
                   int number = (int) (Math.random() * 100);
                   queue.put(number);
                   System.out.println("Producer produced: " + number);
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       });

       Thread consumerThread = new Thread(() -> {
           try {
               while (true) {
                   int number = queue.take();
                   System.out.println("Consumer consumed: " + number);
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       });

       producerThread.start();
       consumerThread.start();
   }
}