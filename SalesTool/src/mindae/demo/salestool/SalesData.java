package mindae.demo.salestool;

import java.util.Iterator;

public class SalesData {
	private int[] data = {0, 4, 42};
	
	public void display() {
		System.out.println("Data: ");
		for(int i=0;i<data.length;i++) {
			System.out.println("Next Value: "+data[i]);
		}
	}

}
