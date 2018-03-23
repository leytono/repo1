package c4;

 interface Walk {
public default int getSpeed() {
return 5;
}

int met1();



}
 interface Run {//extends Walk {
public default int getSpeed() {
return 10;
}

int met1();

}
public class Cat implements Walk, Run { // DOES NOT COMPILE
	public int getSpeed() {//if method is override in the concrete class there is no error, if is not we get compilation error
		return 1;
		}
public static void main(String[] args) {
System.out.println(new Cat().getSpeed());


}
}