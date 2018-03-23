public class Overloading {

	

	public void fly(int numMiles) { }
	public void fly(short numMiles) { }
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet) { }
	public void fly(short numFeet, int numMiles) throws Exception { }
	
	void fly(int Miles, short Feet, String la) { }// so the type and order of type matters and number of params
	void fly(short Feet, int Miles, String la) { }
	void fly(short Feet, String la, int Miles) { }
	
	//can have different Access modifiers, specifiers, return type, different nr of parameters, different type o parameters
	void fly2(int x){} //need to have same name, can have same nr of parameteres but different types 
	void fly2(char x){}
	int  fly2(short x){	return 2;	}
	
	/*  these 2  pairs don't work because there is the same number of parameters with same type
	void  fly3(){}
	 int fly3(){}
	 
	 int fly4(int X){return X;}
	 int fly4(int Y){ return Y;}
	 
	 
	 public void fly(int[] lengths) { }
	 public void fly(int... lengths) { } // DOES NOT COMPILE
	*/
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ob1 =new Overloading();
		ob1 =null;
		ob1.fly2((short)3);
	}

}
