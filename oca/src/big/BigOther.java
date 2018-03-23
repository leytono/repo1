package big;

public class BigOther {

	public void testAccess(BigClass a){
		System.out.println(a.isVarInstancePrivate());//works because is same package as BigClass
		System.out.println(a.text);//same
		a.isPublicMethod();//same
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigClass bc = new BigClass();	
		// System.out.println(bc.varInstance1); // being private, varInstance1 cannot be directly accessed
		
 }
}

 class BigAnother extends BigClass{ // extends a super class
	
	 public void testAccess(){
			System.out.println(isVarInstancePrivate());// works directly becoz is inherited from BigClass
			System.out.println(text);					// because class extends BigClass
			isPublicMethod();
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BigClass bc = new BigClass();	
			// System.out.println(bc.varInstance1); // being private, varInstance1 cannot be directly accessed
	   bc.isVarInstancePrivate();//this works only if we create an obj because we cannot refre to an instance method in a static method
			
			BigAnother bigan =new BigAnother();
			System.out.println(bigan.isVarInstancePrivate()); //cannot be applied outside a method without instance access
			//System.out.println(text);//this works only if we create an obj because we cannot refre to an instance method in a static method
			//isPublicMethod();//this works only if we create an obj because we cannot refre to an instance method in a static method
			bigan.isVarInstancePrivate();//this works only if we create an obj because we cannot refre to an instance method in a static method
			
	 }
}