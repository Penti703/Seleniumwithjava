package oopsconcept;

public class ConstructorDemo {
	
	int x,y;
	ConstructorDemo(){//Default contractor 
		x=100;
		y=200;
		
	}

	ConstructorDemo(int a,int b){//Paramitarized Constructor  
		x=a;
		y=b;
		
	}
	
	void sum(){
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo CD1=new ConstructorDemo(10,20);
		CD1.sum();
		
	}

}
