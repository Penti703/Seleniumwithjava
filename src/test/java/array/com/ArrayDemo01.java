package array.com;



public class ArrayDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array Single dymentional array 
		/*
		 * int a[]=new int[5];//Decleration array a[0]=100; a[1]=200; a[2]=300;
		 * a[3]=400; a[4]=500; System.out.println(a[1]);//Printing the one index vaule
		 * assigning the value
		 */	  //  System.out.println("Length of the array="+a.length);
		
		//Prinring the values using for loop
		/*
		 * int a[]= {100,200,300,400,600}; for(int i=0;i<=a.length-1 ; i++) {
		 * System.out.println(a[i]); }
		 */
	    
		//Printing the values using the enhanced for loop 
		int a[]= {100,200,300,400};
		for(int x:a) {
			System.out.println(x);
			
		}System.out.println("length of array value"+a.length);
		System.out.println("Venkatesh");
		
	}

}
