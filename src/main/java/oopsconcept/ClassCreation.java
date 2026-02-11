package oopsconcept;

public class ClassCreation {
	
	
	String color= "Red";  //type and variable and values decleration 
	int speed=0;

	void driver(){  //method Creation 
	speed=60;
	System.out.println("car is moving"+speed);

	}
	

	public static void  main(String[] args){
		ClassCreation myCar=new ClassCreation();//Obeject Creation 
	 myCar.driver();


	}
	 
}
