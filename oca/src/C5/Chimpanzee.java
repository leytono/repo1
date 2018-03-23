package C5;

class Ape extends Primate {
	public int age;
public Ape() {
	this(20);
	
	
System.out.println("Ape");
}
public Ape(int age){
	this.age=age;
	}
}
public class Chimpanzee extends Ape {
public static void main(String[] args) {
new Chimpanzee();
}
}