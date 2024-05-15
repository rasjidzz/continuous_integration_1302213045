import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();

		System.out.println("Muhammad Risjad Shidqi Febian 1302213045");
		
		System.out.println("Hasil Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Hasil Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Hasil Count:" + counter.getCount());
		
	}

}
