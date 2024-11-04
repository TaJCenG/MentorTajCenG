package multiThreading;




public class About1Basic {

	public static void main(String[] args) {
		 System.out.println("Hi ");
		 Thread t1 = new Thread();
		 System.out.println("t1 : " +t1);

		 String name = Thread.currentThread().getName();
		 System.out.println(name);
	}

}
