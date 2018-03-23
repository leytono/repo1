package pond.duck;
import pond.goose.Goose;

public class GooseWatcher{ // extends Goose {
	public void watch() {
		GooseWatcher goosew = new GooseWatcher();
		//goosew.floatInWater(); // works if extends Goose
		//floatInWater(); // works if extends Goose
		Goose goose = new Goose();
		//goose.floatInWater(); // DOES NOT COMPILE not same package or extends Bird or a subclass of Bird
	} 
}
