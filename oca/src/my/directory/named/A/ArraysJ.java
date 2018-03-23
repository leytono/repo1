package my.directory.named.A;

import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.*;
import java.time.format.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;


public class ArraysJ {
	
	public static void main(String[] args){
		char[] ar1 ={'a','b','c','a'};
		//Arrays.sort(ar1);
		System.out.println(ar1);
		
		
		int numFish = 4;
		 String fishType = "tuna";
		 String anotherFish = numFish + 1+"";
		 System.out.println(anotherFish + " " + fishType);
		 System.out.println(numFish + " " + 1);
		 
		 String s = "Hello";
		// String t = new String(s);
		  String t = new String("Hello");
		 // String t ="Hello";
		  if ("Hello".equals(s)) System.out.println("one");
		  if (t == s) System.out.println("two");
		  if (t.equals(s)) System.out.println("three");
		  if ("Hello" == s) System.out.println("four");
		  if ("Hello" == t) System.out.println("five");
		  if ("Hello".equals(t)) System.out.println("six");
		  
		  StringBuilder sb = new StringBuilder();
		   sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		   System.out.println(sb);
		   
		   //String s11 = "java";
		   StringBuilder s1 = new StringBuilder("java");
		    StringBuilder s2 = new StringBuilder("java");
		    StringBuilder s3=s1;
		    s1.append("lala");
		    if (s1 == s2)
		      System.out.print("1");
		    if (s1.equals(s2))
		      System.out.print("2");
		    if (s1 == s3)
			      System.out.print("3");
			if (s1.equals(s3))
			    System.out.print("4");
			if (s2 == s3)
				System.out.print("5");
		    if (s2.equals(s3))
			  System.out.print("6");
		    
			String slenght ="ur";
			slenght +=" add";
			System.out.println(slenght);
			
			
			String a = "";
			 a += 2;
			 a += 'c';
			 a += false;
			 if ( a == "2cfalse") System.out.println("==");
			 if ( a.equals("2cfalse")) System.out.println("equals");
			 
			 int total = 0;
			  StringBuilder letters = new StringBuilder("abcdefg");
			  System.out.println(total);
			  System.out.println(letters);
			  total += letters.substring(1, 2).length();
			  System.out.println(total);
			  total += letters.substring(6, 6).length();
			// total += letters.substring(6, 5).length();
			  System.out.println(total);
			  int y=0;
			  y += 'b';
			  System.out.println(y);
			  
			  StringBuilder numbers = new StringBuilder("0123456789");
			  numbers.delete(2, 8);
			  
			  numbers.append("-").insert(2, "+");
			  System.out.println(numbers);
	
			  List<Integer> list = Arrays.asList(10, 4, -1, 5);
			   Collections.sort(list);
			   Integer array[] = list.toArray(new Integer[1]);
			   //Integer array[] = list.toArray(); Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
				//Type mismatch: cannot convert from Object[] to Integer[]

			   System.out.println(array[0]);
			   for(int x:array){
				   System.out.println(x);
				   }
				   
				   String [] names = {"Tom", "Dick", "Harry"};
				  // ArrayList<String> names2 =new ArrayList();
				   //names2.add("Tom");
				    List<String> list2 = Arrays.asList(names);
				    list2.set(0, "Sue");
				    System.out.println(names[0]);
				    
				    List<Integer> ages = new ArrayList<>();
				     ages.add(Integer.parseInt("5"));
				    
				     ages.add(Integer.valueOf("6"));
				     ages.add(7);
				     ages.add(null);
				    // for (int age : ages) System.out.print(age);
			   
				     
						String aa="2cfalse";
						aa=aa+"";
						if ( aa == "2cfalse") System.out.println("==");
						else if ( aa.equals("2cfalse"))
							System.out.println("equal");
						else System.out.println("not equal ==");
						int are[] ={11,22,33};
						//int are2[] = {1,2,3};
						int aree[] ={11,22,33};
						int[] are2=are;
						int[] are3= are.clone();
						are[1]=2;
						if (are==aree)
							System.out.println("array ==");
						if (are.equals(aree))
							System.out.println("array equals");	
						//java.lang.System.arraycopy(are, are.length-1, are2, are2.length-1, are2.length-1);
						//java.lang.System.arr
						if (are==are2)
							System.out.println("array are2 ==");
						if (are.equals(are2))
							System.out.println("array are2 equals");	
						for(int x:are2)
							System.out.println(x);
						for(int x:are3)
							System.out.println(x);
						System.out.println(are3[1]);
						
						LocalDateTime dd = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
						Period p = Period.ofDays(1).ofYears(2);
						dd = dd.minus(p);
						DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
						System.out.println(dd.format(f));
						
						LocalDateTime dx = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
						Period pe = Period.of(1, 2, 3);
						dx = dx.minus(pe);
						DateTimeFormatter fo = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
						System.out.println(dx.format(fo));
						
					/*	LocalDate ddx = LocalDate.of(2015,5,10);
						Period ppe = Period.of(1, 2, 3);
						ddx = ddx.minus(ppe);
						DateTimeFormatter ffo = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
						System.out.println(ddx.format(ffo));  */
						
						String qa=  "qa_test";
						//qa =new Integer(2);
						short xc = 10;
						short yc = 3;
						int zc =xc +yc;
						if (false)
							System.out.print(slenght);
						else 
							xc=3;
						
						final char a2 = 'A', d = 'D';
						char grade = 'B';
						
						 switch(grade) {
						 case a2:
						 case 'B': System.out.print("great");
						 case 'x': System.out.print("good"); //break;
						 case d:
						 case 8: System.out.print("not good");
						 }
						 int un =1;
						 switch(un){
						 case 0: System.out.print("gr8");
						 case 1: System.out.print("gr8 2"); break;
						 }
						 StringBuilder sb1 =new StringBuilder("aa");
						
						 int[] aaa=new int[2];
						 int[] bbb=new int[]{1,2};
						 int[] ccc={1,2};
						 
						
	}
}




