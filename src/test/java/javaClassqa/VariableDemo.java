package javaClassqa;

public class VariableDemo 
{

public static void main(String[] args) {
	//Create variable and how to store the data in a variable 
	
	int a; //Declarations --In every statement end; semiclono
	a=200;  //Assignment
	
	int b=100;//Declarations+ assignment 
	
	System.out.println("Initial Values is:"+a);
	a=200;
	System.out.println("Values is ia always vary:" +a);
	
	//Approach1--if the variable are belongis to same data type
	int c=100,d=200,e=300;
	//Approach2--if the variable are belongis to same data type 
	int f,g,h;
	f=1000;
	g=2000;
	h=600;
	//Approach3- if all the variables are different data types 
	int x=300;
	int t=300;
	
	//By using the concatenation 
	System.out.println("Print the values concatenation "+t);
	//printing the values in a single line yes
	System.out.println(c+" "+d+" "+e+" ");
	//
	float telPrice=56.3f;
	System.out.println("float value"+telPrice);
	
	double dt=455.3643274;
	System.out.println("double  value"+dt);
	
	boolean bt=true;
	System.out.println("Boolean values is "+bt);

	}

}
