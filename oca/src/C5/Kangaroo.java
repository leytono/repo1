package C5;

class Marsupial {
public boolean isBiped() {
return false;
}
public void getMarsupialDescription() {
System.out.println("Marsupial walks on two legs: "+isBiped());
}
}
public class Kangaroo extends Marsupial {
public boolean isBiped() {
return true;
}
public void getKangarooDescription() {
System.out.println("Kangaroo hops on two legs: "+isBiped());
}
public static void main(String[] args) {
Kangaroo joey = new Kangaroo();
joey.getMarsupialDescription();
joey.getKangarooDescription();
}
}