package array.com;

import org.testng.annotations.Test;

public class EnhancedDynamic {
	@Test
	public void test() {
		
	
	int a[][] = {{100, 200}, {200, 300}, {300, 400}};

	for (int[] arr : a) {        // each row is an int array
	    for (int x : arr) {      // each value inside the row
	        System.out.println(x);
	    } 
	}


}
}