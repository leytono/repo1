package C5;

 class Cons {

	public Cons() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


 class Constr extends Cons{
	
	 Constr(int a){
		 super(); 
	 }
}
 class Parent{
	 public  void st1(){}
	 public static void sneeze() {}
	 Parent(int a){}
 }
 
 class Sun1 extends Parent{
	// Sun1(){	 }
	 Sun1(int a){
		 super(a);
	 }
	// static void st1(){}
	// public void sneeze() {}
	 
 }
 
 interface A {
	 void doNothing();
 }
 
 
 
 class Marsupial2 {
	 public boolean isBiped() {
		 System.out.println("is biped false");
	 return false;
	 }
	 public void getMarsupialDescription() {
	 System.out.println("Marsupial walks on two legs: "+isBiped());
	 }
	 }
 
 public class ConstructorsEx extends Marsupial2 {
	 public boolean isBiped() {
		 System.out.println("is biped true");
		 return true;
	 }
	 public void getKangarooDescription() {
		 System.out.println("Kangaroo(ConstructorsEx) hops on two legs: "+isBiped());
	 }
	 public static void main(String[] args) {
		 ConstructorsEx joey = new ConstructorsEx();
	 joey.getMarsupialDescription();
	 joey.getKangarooDescription();
	 
	 
	 Marsupial2 jo = new ConstructorsEx();
	 jo.getMarsupialDescription();
	 //jo.getKangarooDescription();
	 
	 
	 Marsupial2 jo2 = new Marsupial2();
	 jo2.getMarsupialDescription();
	 
	 }
	 }