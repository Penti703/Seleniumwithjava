package javaProgramms;

class myClass{
	int num=29;
	String name="Venkatesh Penti";
	 public void m1(){
		 System.out.println("My Name is "+name+" Age is "+num);
	}
	 
	 public void m2(int numb,String nameQA ){
		
		 System.out.println("My phone number is "+numb+" My Designation is "+nameQA);
	} 
}

class myClass1{
	int age=28;
	String name="Venkatesh";	

public void m1(){
	 System.out.println("My Name is "+name+" Age is "+age);
}	
public void m2(String  name , int age){//Methd OverLoading 
	 System.out.println("My Name is "+name+" Age is "+age);
}
public void m2(int age,String name){
	 System.out.println("My age is "+age+" name is "+name);
}
}
public class CreateObjects {

	public static void main(String[] args) {
		//Creating the objects and getting the data from the objects 
		myClass my=new myClass();  //Creating the object and getting the methods under the class
		my.m1();
		my.m2(967832730, "QA Engineer");//Re-using the methdor data in objects 
		my.m2(657890023, " Developer");
		my.m2(65789004, " Developer");
		myClass1 my1=new myClass1(); 
		my1.m1();
		my1.m2("Venkatesh Penti", 27);
		my1.m2(26, "Ambati Venkatesh");
		//Creating the two different class and with same methods and 

	}

}
