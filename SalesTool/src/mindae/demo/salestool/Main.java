package mindae.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();

	}
	
	private static void displayGreeting() {
		System.out.println("HELLO happy sales people");
		System.out.println("THIS app shows sales data");
		System.out.println("test 1");
	}

}
