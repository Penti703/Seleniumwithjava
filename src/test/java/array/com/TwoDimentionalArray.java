package array.com;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[0][2]=50;
		a[1][2]=60;
		
		for(int arr[]:a) {
			for(int x: arr) {
				System.out.print(+x+" ");
			}System.out.println(" ");
		}
	}

}
