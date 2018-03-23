package c4;
import java.util.*;
public class PassByValue {
	Integer number=1;
	static int x=3;
	static Integer a11=33;
	static Integer a22=44;
	static Integer az=4;
	
	static void setNumber( PassByValue obj1,Integer num){
		//the parameter refer the same obj that is passed to the method,
		//only the atribute is changed
		obj1.number=num;
	}
	
	static void  changeX(int xx){
		//when we asign a new value to the parameter it will not refer to the original x=3 object, will refer to 4
		System.out.println("inside method before new value xx="+xx+" x="+x);
		xx=4;
		x=xx;
		System.out.println("inside method after xx asignament xx="+xx+" x="+x);
	}
	
	void changeAt(PassByValue pv){
		// the pv parameter refer to the original obj so the atribute of pv3(the calling object) will change
		pv.number =100;
	}
	
	void newObj(PassByValue pv2){
		// new obj is created the parameter is assigned to it so no changes for the old obj referred by pv4(calling object) 
		PassByValue newob =new PassByValue();
		System.out.println("obj number before change: "+pv2.number);
		pv2=newob;
		pv2.number=200;
		System.out.println("obj number after change: "+pv2.number);
		//pv1.number=11;
	}
	
	static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	static void swap2(Integer a, Integer b){
		System.out.println(a +" before "+b);
		Integer temp = a;
		a = b;
		b = temp;
		System.out.println(a +" after swap "+b);
		
		a11=a;
		a22=b;
		System.out.println(a11 +" after a11a22 "+a22);
	}
	
	static void changeList(ArrayList<Integer> l){
		l.add(12);
		l.add(13);
		System.out.println("After modification array looks like: "+l.toString());
	}
	static void changeInt(Integer a){
	    Integer b=az;
	    b=a;
		System.out.println(az+" az+++++++++++++ b "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassByValue pbv1 =new PassByValue();
		System.out.println(pbv1.number);
		setNumber(pbv1,3);
		System.out.println(pbv1.number);
		
		System.out.println("before calling changeX x="+x);
		changeX(x);
		System.out.println("after calling changeX x="+x+"\n");
		
		
		PassByValue pv3 =new PassByValue();
		PassByValue pv4 =new PassByValue();
		
		System.out.println("before calling changeAt x="+pv3.number);
		pv3.changeAt(pv3);
		System.out.println("after calling changeAt x="+pv3.number);
		
		System.out.println("before calling newObj x="+pv4.number);
		pv4.newObj(pv4);
		System.out.println("after calling newObj x="+pv4.number);
		
		
		int a1=3;
		int a2=4;
		System.out.println("a1a2= "+a1+" "+a2);
		swap(a1,a2);
		System.out.println("a1a2= "+a1+" "+a2);
		

		
		System.out.println(a11+""+a22);
		swap2(a11,a22);
		System.out.println(a11+""+a22);
	
		ArrayList<Integer> ll =new ArrayList<Integer>();
		ll.add(1);
		System.out.println("Original array: "+ll.toString());
		changeList(ll);
		System.out.println("After array: "+ll.toString());
		
		
		Integer bb=20;
		changeInt(bb);
		System.out.println("az "+az);
	}

	
	
}
