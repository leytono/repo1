package pond.shore;

public class Bird {
	protected String text = "floating"; // protected access
	
	protected void floatInWater() { // protected access
		this.text="Floating";
		System.out.println(text);
		
	} 
	
	void testSubclassBird(){
		Goose goose1 = new Goose();
		goose1.floatInWater();
	}
	
	public void testPublicBird(){
		System.out.println("this is testPublicBird method");
	}
	
	
}

class GooseEater{
	public void watch() {
		GooseEater goose1 = new GooseEater();
		Bird bird2 = new Bird();
		//goose2.floatInWater();// DOES NOT COMPILE if is not a subclass of Bird
		bird2.floatInWater(); //works because is in the same package
		bird2.testSubclassBird();
		//floatInWater();  // DOES NOT COMPILE if is not subclass of Bird
		Goose otherz = new Goose();
		otherz.floatInWater(); //works because we are in the same package / obj. of subclass in another simple class 
		// that doesn't inherit the superclass so in the same package we can call it using a Bird obj or another subclass obj.
		//floatInWater();  // DOES NOT COMPILE since is not a subclass of Bird
  }
}

 class Goose extends Bird {  //if comment extends Bird only using bird.method works
	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInWater();  // works because of inheritance using a goose obj instance
		System.out.println(other.text);
		Bird bird= new Bird();
		bird.floatInWater();  //in the same package so works also with bird.method even if bird is not a goose
		floatInWater(); // works because of inheritance, the function is available from superclass
	}
 }