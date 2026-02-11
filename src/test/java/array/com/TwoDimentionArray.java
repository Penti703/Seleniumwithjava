package array.com;

public class TwoDimentionArray {

	public static void main(String[] args) {
		/*
		 * // TODO two dymention array int a[][]=new int[3][2]; //decleration Three rows
		 * and two column a[0][0]=100; a[0][1]=400; a[1][0]=200; a[1][1]=600;
		 * a[2][0]=300; a[2][1]=700; //length of the two dymention array
		 * System.out.println(a.length);
		 */
		
		int a[][]= {{100,200},{200,300},{300,400}};
		/*
		 * for(int R=0; R<=2;R++) { for(int c=0; c<=1;c++) {
		 * System.out.print(a[R][c]+", "); }System.out.println(); }
		 */
		//
		for(int[]  arr:a) {
			for(int x: arr) {
				System.out.println(x);
				
			}
		}
	}

}
