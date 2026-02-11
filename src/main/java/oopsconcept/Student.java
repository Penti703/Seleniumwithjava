package oopsconcept;

public class Student {
	
	int  sID;
	String sName;
	char grad;
	
	void printStudentdata() {
		 System.out.println(sID+" "+sName+" "+grad);
	}
	//to store the value in data 
	void setStudentdata(int id,String Name,char gar) {
		sID=id;
		sName=Name;
		grad=gar;
	}
	
	//Coonstuctor
	
	Student(int id,String Name, char gar)
	{
		sID=id;
		sName=Name;
		grad=gar;
		
	}
	

}
