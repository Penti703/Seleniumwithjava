package oopsconcept;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		MethodOverloading addMloading=new MethodOverloading();
		addMloading.sum();//1
		
		addMloading.sum(20, 30);//2
		
		addMloading.sum(200.5, 300);//4
		addMloading.sum(30,30.5);//3
		
		addMloading.sum(100, 20, 30);//6
		
	 
	}

}
