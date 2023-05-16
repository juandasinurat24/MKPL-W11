import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
     Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		System.Out.println("Current count:" + counter.getCount());
    
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		System.Out.println("Current count:" + counter.getCount());

		counter.decrement();

		System.Out.println("Current count:" + counter.getCount());
		System.out.println("Count:" + counter.getCount());
		
	}

}
