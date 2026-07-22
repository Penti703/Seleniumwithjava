package array.com;

public class ArrayTest_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,29,30,30};
		
		int sum=0;
		System.out.println("Array length is  :"+a.length);
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
			
		}System.out.println("Sum of array list is :  "+sum);
		a[3]=60;
		System.out.println("After changing the arry number :  "+a[3]);
	}

}
