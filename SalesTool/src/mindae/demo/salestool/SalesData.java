package mindae.demo.salestool;

/*represents the sales data*/
public class SalesData {
	private int[] data = {-1, 0, 4, 42, 84};
	
	public void display() {
		System.out.println("Data: ");
		
		int sum=0;
		for(int i: data) {
			System.out.println("Next Value: "+ i);
			sum+=i;
		}
		System.out.println("Sum is:: "+sum);
		System.out.println("WRONG - Sum is:: "+sum);
	}

}
