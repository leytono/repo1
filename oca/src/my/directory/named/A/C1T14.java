package my.directory.named.A;

import java.util.*;
import java.lang.*;

public class C1T14 {

	static String name;
	public static void main(String[] args){
		int a=3;
			a+=2;	
			char z='a';
			float e=2.1f;
			int x1=2,x2=5;
			System.out.println(x1^x2);
			int y=20;
			short xq = 10;
			short yq = 3;
			int zq = xq * yq;
			float f1=10.5f;
			double d1=10;
			double f2=f1+d1;
			//String animal = (String)((y < 91) ? 9 : "Horse");
		System.out.println("packages name test"+ (-a)+z+(z+0));
		long xx = 0;
		int yy=2;
		for( yy = 0, xx = 4; xx < 5 && yy < 10; xx++, yy++) { // DOES NOT COMPILE
			System.out.print(xx + " ");
		}
		int y2 = 1;
		int z2 = 1;
		final int x = y2>=10 ? y2++ : z2++;
		System.out.println(y2+","+z2); // Outputs 1,2
		if(y<10) System.out.println("Too Low");
		 else System.out.println("Just right");
		int a2=3;
		long al= a2+1;
		xx=5;
		int v1=6;
		Double v2=6d;
		if(v1==v2)
			System.out.println("Double and primitives works");
		
		if (5==xx)
		System.out.println(xx > 2 ? xx < 4 ? 10 : 8 : 7);
		
		int b=1;
		for( b=0;b<=9;){
			System.out.println(b);
			  b +=1;
			  //b++;
			  
			System.out.println(b);
			System.out.println("_");
			//break;
		}
		System.out.println("-"+b);
		//for(int i=0; i<10 ; ) {
			// i = i++;
			// System.out.println("Hello World");
			// }
		StringBuilder alpha = new StringBuilder();
		 for(char current = 'a'; current <= 'z'; current++)
		 alpha.append(current);
		 System.out.println(alpha);
		 StringBuffer sa= new StringBuffer("stringbuffer_");
		 
		 
		 System.out.println(sa.append("aappend_something"));
		 System.out.println(sa);
		 StringBuffer axa =new StringBuffer(4);
		 System.out.println(axa.append("append_something"));
		 System.out.println(axa.length());
		 int[] ar1 =new int[5];
		 ArrayList<Integer> arL =new ArrayList<Integer>();
		 
		 String [] bugs = { "cricket", "beetle", "ladybug" };
		 String[] alias ={"bugs"};
		 alias =bugs;
		 
		 System.out.println(bugs.equals(alias));
		 System.out.println(bugs==alias);
		 System.out.println(alias);
		 System.out.println(java.util.Arrays.toString(bugs));
		 
		 System.out.println(C1T14.name);
		 //for(String i:alias){
		 	//System.out.println(i);}
		 String[] strings = { "stringValue" };
		 Object[] objects = strings;
		 String[] againStrings = (String[]) objects;
		  againStrings[0] = new StringBuilder().append(java.util.Arrays.toString(strings)).deleteCharAt(0).reverse().deleteCharAt(0).reverse().toString();// DOES NOT COMPILE
		  System.out.println(againStrings[0]);
		  objects[0] = new StringBuilder("lala").toString();
		  System.out.println(objects[0]);
		  
		  String[] stringss = { "10", "9", "100" };
		  Arrays.sort(stringss);
		  ArrayList as= new ArrayList<String>();
		  as.add("llll");
		  ArrayList<Object> all= new ArrayList<>();
		  ArrayList<Integer> int1= new ArrayList<Integer>(as);
		  all.add("aaa");
		  all.add(1);
		  
		  ArrayList<String> safer = new ArrayList<>();
		  safer.add("sparrow");
		  //safer.add(Boolean.TRUE);
		  
		  System.out.print(int1);
		  for(String s: stringss ) {
			  int1.add(Integer.parseInt(s));
			  }
		 
		  System.out.println(int1+"arrayListInteger");
		  for (String string : stringss)
		  System.out.print(string + " ");
		  
		  int[] numbers = {2,12,10,4,6,8};
		   System.out.println(Arrays.binarySearch(numbers, 2)); // 0
		   System.out.println(Arrays.binarySearch(numbers, 4)); // 1
		   System.out.println(Arrays.binarySearch(numbers, 7)); // -4
		   System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		   System.out.println(Arrays.binarySearch(numbers, 9)); // -5
		   
		   List<Double> weights =new ArrayList<>();
		   weights.add(50.5);
		   weights.add(new Double(60.1));
		   List<Integer> numbers2 = new ArrayList<>();
		   numbers2.add(1);
		   numbers2.add(2);
		   numbers2.add(3);
		   int element_removed =numbers2.remove(1);
		   
		   Boolean trei= numbers2.remove(new Integer(3));
		   
		   System.out.println(numbers2+" "+element_removed+" "+trei);
		   List<String> list =new ArrayList<>();
		   list.add("hawk");
		   list.add("robin");
		   Object[] objectArray =list.toArray();
		   System.out.println(objectArray.length);
		   for(Object ob:objectArray){
			   System.out.println(ob);
		   }
		   String[] strar =list.toArray(new String[0]);
		   String[] stob =new String[0];
		   System.out.println(stob);
		   for(String ob:strar){
			   System.out.println(ob);
		   }
		   String[] st ={"abc", "def"};
		   List<String> ll=Arrays.asList(st);
		   List<String> ll1=Arrays.asList("one","two");
		   List<String> ll2 =new ArrayList<>();
		   ll2.add("aa");
		   List<Integer> intlist =new ArrayList();
		   intlist.add(15);
		   intlist.add(9);
		   intlist.sort(null);
		   System.out.println(intlist);
		   String imu1= "imu1";
		   String imu2=imu1;
		   System.out.println(imu1= imu1.replace('i','x'));
		   
		   System.out.println(imu1);
		   System.out.println(imu2);
		   
		   StringBuilder mut1= new StringBuilder("mutable");
		   int xc[]={5,6,7,8};
	         System.out.println(xc.getClass());
	         String s= Integer.toString(xc[0]);
	         System.out.println(s);
	         String a1[] ={"a","b","c"};
	         String a5[] ={"a","b","c"};
	         a5=a1;
	         System.out.println(a1.equals(a5));
	         int[] ina= new int[2];
	         
	}
}
