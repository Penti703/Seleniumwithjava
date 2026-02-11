package oopcpackage;

public class BasicClassinOops {

	public static void main(String[] args) {
		// declering the object referenec 
		BasicClassinOops emp1=new BasicClassinOops();
		emp1.emId=1234567;
		emp1.emAge=28;
		emp1.emDec="Senior Quality analyst";
		emp1.emName="Venkatesh Penti";
		emp1.Empsalary=50000.21f;
		emp1.Display();
		
		BasicClassinOops emp2=new BasicClassinOops();
		emp2.emId=1234568;
		emp2.emAge=28;
		emp2.emDec="Development Engineer";
		emp2.emName=" Krishna ";
		emp2.Empsalary=120000.21f;
		emp2.Display();

	}

	//Declering the variables 
	int emId;
	String emName;
	int emAge;
	float Empsalary;
	String emDec;
	
	void Display(){  //void is return type
		
		System.out.println(emId);
		System.out.println(emName);
		System.out.println(emAge);
		System.out.println(Empsalary);
		System.out.println(emDec);
		
	}
	
	
}
