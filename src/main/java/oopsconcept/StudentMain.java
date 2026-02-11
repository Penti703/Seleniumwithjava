package oopsconcept;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student stu	=new Student();
		//Store data using obeject reference data  
		/*
		 * stu.sID=123; stu.sName="Venkatesh"; stu.grad='A'; stu.printStudentdata();
		 */
		
		//using method to store in data in variable 
		/*
		 * stu.setStudentdata(12345, "Krishna ", 'A'); stu.printStudentdata() ;
		 */
		
		//constructor
		Student stu	=new Student(100,"RAMU",'B');
		stu.printStudentdata();
		
	}

}
