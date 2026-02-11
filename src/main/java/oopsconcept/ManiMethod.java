package oopsconcept;

public class ManiMethod {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Methods	mT=new Methods();
	mT.method();//No param no return value 
	
	String St=mT.method2();//2)No Param  --Return value 
	System.out.println(St);
	
	mT.method3("venkatesh");//3)Takes Param   --return value 
	
	String St1=mT.method4("Krishan");
	System.out.println(St1);
	
	}
	
	

}
