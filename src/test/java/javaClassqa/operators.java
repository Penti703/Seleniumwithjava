package javaClassqa;

public class operators {

	public static void main(String[] args) {
		//1.arithmentic operators +,-,*,/,%
		int a=10,b=20,c=30;
		int result=a+b;//storing in a variable 
		
		System.out.println("Summing of the two values :"+(a+b));//Summing 
		System.out.println("subtraction  of the two values :"+(b-c));//subtraction
		System.out.println("multiplication  of the two values :"+(a*b));
		System.out.println("division  of the two values :"+(c/b));
		System.out.println("subtraction  of the two values :"+(c%b));//remainder values
		
		//2.Relationn and comparision operators( >,>=,<,<=,!=,==)
		//always returns the boolean values all are true or false
		System.out.println(a<b);//true
		System.out.println(c>b);//true
		System.out.println(a>b);//false 
		System.out.println(c>=b);//true
		System.out.println(c<=b);//false
		b=30;
		System.out.println(c==b);//true
		System.out.println(c!=b);//false
		
		boolean res= a>b;
		System.out.println(res);//false 
		
		//logical operators AND, OR, NOT, logical operator always returns the boolean values 
		//&& || !
		boolean x=true,y=false;
		
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		boolean b1=10>20;
		System.out.println(b1);//false
		

		boolean b2= 20>10;
		System.out.println(b2);//true
		
		System.out.println((10<20)&&(20>10));//True 
		
		//incremental and decremental  operators ++ and --
		
		
		
		
												
	}

}
