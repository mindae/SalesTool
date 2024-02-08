package mindae.demo.salestool;

<<<<<<< HEAD
=======
import java.util.Iterator;
/*represents the sales data*/
>>>>>>> branch 'master' of https://github.com/mindae/SalesTool.git
public class SalesData {
	private int[] data = {-1, 0, 4, 42, 84};
	
	public void display() {
		System.out.println("Data: ");
		
		int sum=0;
		for(int i: data) {
			System.out.println("Next Value: "+ i);
			sum+=i;
		}
		System.out.println("Sum is: "+sum);
	}

}
