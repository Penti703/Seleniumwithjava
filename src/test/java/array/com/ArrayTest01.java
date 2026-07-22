package array.com;

class arrayTest{
	int a[]= {1,2,3,4,6};
	
	void m1() {
		//Printing the Arrays
		System.out.println("Array List");
		for(int i=0 ;i<a.length; i++) {
			System.out.println(+a[i]+" ");
		}
	}
	
	void m2(){
		System.out.println("Revers of Array List");
		for(int i=a.length-1;i>=0 ;  i--) {
			System.out.println(a[i]+" ");
		}
	}
	
	void m3(){
		int sum=0;
		for(int i=0 ;i<a.length; i++)	{
		sum=sum+a[i];
	}System.out.println("Sum of array list is value is : "+sum);
	}
	
	void missingNumber() {
		for(int i=0 ;i<a.length; i++) {
			if(a[i]!=i+1) {
				System.out.println("Miss number is : "+(i+1));
			}
		}
	}
}

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayTest ar=new arrayTest();
		ar.m1();
		ar.m2();
		ar.m3();
		ar.missingNumber();
		
	}

}
