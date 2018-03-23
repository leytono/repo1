package pond.goose;
import pond.shore.Bird;

public class Goose extends Bird {
	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInWater(); // goose obj can call method since it is inherited from superclass
		System.out.println(other.text);
		Bird bird= new Bird();
		//bird.floatInWater();  // DOES NOT COMPILE because bird is not a goose, only in subclass we can call it just with name or
		//using a subclass object but not with superclass object since bird is not a goose
		//even if we comment "extends Bird" and use a bird obj doesn't work because we are not in the same package
		floatInWater();
		bird.testPublicBird();// is visible trough public access not through the inheritance , 
							 //the code inherited is for Goose not for Bird
	}

	public void helpOtherGooseSwim() {
		Bird other = new Goose();
		//other.floatInWater(); // DOES NOT COMPILE
		//System.out.println(other.text); // DOES NOT COMPILE reason: bird is not a goose
} }

 class GooseWatcher extends Goose{
	public void watch() {
		GooseWatcher goose1 = new GooseWatcher();
		Goose goose2 = new Goose();
		goose1.floatInWater(); // work using instance of the subclass
		floatInWater(); //it inherited directly so it works
		//goose2.floatInWater(); // DOES NOT COMPILE  goose is not a goosewatcher, works only with subclass obj
		
	} 
}
 
 class GooseEater{
		public void watch() {
			//GooseWatcher goose1 = new GooseWatcher();
			Goose goose2 = new Goose();
			//goose2.floatInWater(); // DOES NOT COMPILE , not a subclass of Bird 
			//floatInWater(); // DOES NOT COMPILE , not same package
			Bird bird3 =new Bird();
			//bird3.floatInWatre();// DOES NOT COMPILE   because we are not in same package, to make it work we need to
			// extend Bird or a subclass since we are not in the same package
			bird3.testPublicBird();// works because the method is public and even if we are in other package is visible
			
	}
}