package multiThreading;

public class Sync extends Thread{
		private Counter counter;
		@Override
		public void run() {
			for(int i=0; i<100; i++) {
				counter.increment();
			}
		}
		public Sync(Counter counter) {
			super();
			this.counter = counter;
		}
	}

	class Counter{
		private int count = 0;
//		public  void increment() { // without syncronization
//			count ++;
//		}
		
		public synchronized void increment() { // with syncronization data will come in sync ( line by line )
			count ++;
		}
		
		public int getCount() {  
			return count ++;
		}
	}

