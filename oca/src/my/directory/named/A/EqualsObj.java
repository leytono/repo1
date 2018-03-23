/**
 * 
 */
package my.directory.named.A;

import java.util.*;

/**
 * @author dzmarand
 *
 *
 *Compare Strings 
 *== ref
*equals what contains
*
*str buffer
*== same thing, check ref
*equals  check ref beacuse there is no equals method implemented specially for this
 */
public class EqualsObj {
	 String name;
	 
	 EqualsObj (String name){
		 name=this.name;
	 }
	 
	 public static void main(String[] args) {
		 
	/**Comparing objects
	 * 
	 * == compares the reference
	 * equals compare if same object	 
	 */
	 
	 EqualsObj t1 = new EqualsObj("name");
	 EqualsObj t2 = new EqualsObj("name");
	 EqualsObj t3 = t1;
	 System.out.println("++++objects++++");
	 System.out.println(t1 == t1); // true
	 
	 System.out.println(t1 == t2); // false
	 System.out.println(t1.equals(t2)); // false

	 System.out.println(t1 == t3);  //true
	 System.out.println(t1.equals(t3));//true
	 EqualsObj t4 = new EqualsObj("name");
	 t3=t4;
	 System.out.println(t1.equals(t3));  //false			 so even if the content is the same it fails
	 System.out.println(t1==t3);	//false
	 System.out.println("++++objects++++");
	 
	 /**Comparing Strings
		 * 
		 * == compares the reference
		 * equals compare teh content	 
		 */
	 System.out.println("++++Strings++++");
	 String st1 = new String("name");
	 String st2 = new String("name");
	 String st3 = st1;
	 System.out.println(st1 == st1); // true
	 
	 System.out.println(st1 == st2); // false
	 System.out.println(st1.equals(st2)); // true

	 System.out.println(st1 == st3);  //true
	 System.out.println(st1.equals(st3));//true
	 String st4 = new String("name");
	 st3=st4;
	 System.out.println(st1.equals(st3));  //true			 so the content is the same and works
	 System.out.println(st1==st3);	//false
	 System.out.println("++++Strings++++");
	 
	 /**Comparing Strings Buffers
		 * 
		 * == compares the reference
		 * equals compare teh ref since there is no equals	 
		 */
	 System.out.println("++++StringBuffers Buffers++++");
	 StringBuffer stb1 = new StringBuffer("name");
	 StringBuffer stb2 = new StringBuffer("name");
	 StringBuffer stb3 = stb1;
	 System.out.println(stb1 == stb1); // true
	 
	 System.out.println(stb1 == stb2); // false
	 System.out.println(stb1.equals(stb2)); // false

	 System.out.println(stb1 == stb3);  //true
	 System.out.println(stb1.equals(stb3));  //true
	 StringBuffer stb4 = new StringBuffer("name");
	 stb3=stb4;
	 System.out.println(stb1.equals(stb3));  //false		 compares the ref since equals is not implemented from this
	 System.out.println(stb1==stb3);	//false
	 System.out.println("++++StringBuffers Buffers++++");
	 
	 /**Comparing arrays
		 * 
		 * == compares the reference
		 * equals compare teh ref since there is no equals	 
		 */
	 
	 Integer i1[] =new Integer[0];
	 
	 
	 System.out.println("++++Strings arrays++++");
	 String sar1[] = new String[] {"name"};
	 String sar2[] = new String[] {"name"};
	 String sar3[] = sar1;
	 System.out.println(sar1 == sar1); // true
	 
	 System.out.println(sar1 == sar2); // false
	 System.out.println(sar1.equals(sar2)); // false

	 System.out.println(sar1 == sar3);  //true
	 System.out.println(sar1.equals(sar3)); //true
	 String sar4[] = new String[] {"name"}; //true
	 sar3=sar4;
	 System.out.println(sar1.equals(sar3));  //false		 compares the ref since equals is not implemented from this
	 
	 System.out.println(sar1==sar3);	//false
	 System.out.println("++++Strings arrays++++");
	 
	 
	 /**Comparing ArraysList
		 * 
		 * == compares the reference
		 * equals compare the content because equals is implemented, not the reerence
		 */
	 System.out.println("++++ArraysList++++");
	 List<String> al1 = new ArrayList<String>();
	 al1.add("name");
	 
	 List<String> al2 = new ArrayList<String>();
	 al2.add("name");
	 
	 List<String> al3 = al1;
	 System.out.println(al1 == al1); // true
	 
	 System.out.println(al1 == al2); // false
	 System.out.println(al1.equals(al2)); // true

	 System.out.println(al1 == al3);  //true
	 System.out.println(al1.equals(al3));
	 List<String> al4 = new ArrayList<String>();
	 al4.add("name");
	 al3=al4;
	 System.out.println(al1.equals(al3));  //true so now equals check the content not the reference		 
	 System.out.println(al1==al3);	//false
	 System.out.println("++++ArraysList++++");
	 
	 String[] str5 ={"name1","name2","name3"};
	 System.out.println(Arrays.toString(str5));
	 System.out.println(Arrays.binarySearch(str5, "name2"));
	 
	 List<String> lst1 = Arrays.asList(str5);
	 String[] arlst =(String[])lst1.toArray();
	 
	 } }
