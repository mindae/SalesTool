package mindae.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();

	}
	
	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People");
		System.out.println("This App Shows Sales Data");
		System.out.println("test 1");
		System.out.println("test 2");
		System.out.println("test3");
	}
}
