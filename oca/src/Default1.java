
public class Default1 {
	byte b;
	short s;
	int i;
	long l;
	double d;
	float f;
	boolean bo;
	char c;
	
	Character cc;
	Boolean boo;
	Float ff;
	Double dd;
	Long ll;
	Integer ii;
	Short ss;
	Byte bb;
	
	
	
	//static blocks
	 private static int one;
	 private static final int two;
	 private static final int three = 3;
	 private static final int four; // DOES NOT COMPILE final and static needs to be initialized, only static is ok
	 private static final int five; /// final tot timpul initializata mai ales daca nu e in static block after.
	 static {
	 one = 1;
	 one = 1;
	 //two = 2;
	 //three = 3; // DOES NOT COMPILE
	 two = 4; // DOES NOT COMPILE
	 four =4;
	 five=5;
	 }
	 
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default1 def =new Default1();

		System.out.println("byte "+def.b);
		System.out.println("short "+def.s);
		System.out.println("int "+def.i);
		System.out.println("long "+def.l);
		System.out.println("double "+def.d);
		System.out.println("float "+def.f);
		System.out.println("boolean "+def.bo);
		System.out.println("char "+def.c);
		System.out.println("--------------------------------");
		System.out.println("Byte "+def.bb);
		System.out.println("Short "+def.ss);
		System.out.println("Integer "+def.ii);
		System.out.println("Long "+def.ll);
		System.out.println("Double "+def.dd);
		System.out.println("Float "+def.ff);
		System.out.println("Boolean "+def.boo);
		System.out.println("Char "+def.cc);
		
	}

}
