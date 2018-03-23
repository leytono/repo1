package C5;

 interface Interface1{
	 void Method1();
	
	
}
 

public class Class_Interface implements Interface1 {

	
	public void Method1(){
		System.out.println("This is method 1 of iinterface1 in class interface1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Class_Interface2 implements Interface1{
	
	public void Method1(){
		System.out.println("This is method 1 of iinterface1 in class Interface2");
	}
	
	
}


