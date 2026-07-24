package javaProgramms;

class team{
	private int age=27;
	private String name="Venkatesh Penti";
	
	public int  getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age=a;
	}
	public void setName(String n) {
		name=n;
	}
	
}

public class PrivateVariables {

	public static void main(String[] args) {
		//Assigne the value with the help of methods and getting the using methods 
		team tm=new team();
		/*tm.age=27;
		tm.name="Venkatesh Penti";*/
		tm.setAge(28);
		tm.setName("Ambati Venkatesh");;
		System.out.println(tm.getAge()+" : "+tm.getName());
		

	}

}
