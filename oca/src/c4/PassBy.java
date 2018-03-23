package c4;

public class PassBy {
	int number=1;
	static void method1(int a){
		System.out.println(a);
		a=10;
		System.out.println(a);
	}
	
	static void method2(Integer a){
		System.out.println(a);
		a=10;
		System.out.println(a);
	}
	
	static void method3(String a){
		System.out.println(a);
		a="a";
		System.out.println(a);
	}
	
	void method4(){
		System.out.println(this.number);
		this.number=2;
		System.out.println(this.number);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		method1(num);
		System.out.println(num);
		
		Integer num2=1;
		method2(num2);
		System.out.println(num2);
		
		String st1="st";
		method3(st1);
		System.out.println(st1);
		
		PassBy pass= new PassBy();
		System.out.println("\n"+pass.number);
		pass.method4();
		System.out.println(pass.number);
	}

}
