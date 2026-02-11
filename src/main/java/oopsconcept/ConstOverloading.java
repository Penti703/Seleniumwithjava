package oopsconcept;

public class ConstOverloading {
	
	double width,hight,lenght;
	
	ConstOverloading(){  //Constructor 1 CT1
		/*
		 * width=0; hight=0; lenght=0;
		 */
		width=hight=lenght=0;
	
	}
	
	ConstOverloading(double w, double h,double l){  //Constructor 1 CT2
	
		width=w;
		hight=h;
		lenght=l;
	
	}
	
	ConstOverloading(double len){  //Constructor 1 CT3
		width=hight=lenght=len;
	
	}
	
	double volume() {
		return (width*hight*lenght);
	}

	
}
