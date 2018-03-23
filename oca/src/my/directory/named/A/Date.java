package my.directory.named.A;
import java.util.*;
import java.time.*;
import java.time.format.*;

class Date{	
	
	//LocalDate data_in_viitor;// =LocalDate.now();
	
	//System.out.println("\nToday:"+LocalDate.now()+"\n");
	//System.out.println(data_in_viitor);
	private void getDate(String ld,int cat, Character tip){// tipul trebuie sa fie d-day, m-month, y-year, w-weeks
		
		//System.out.println(ld+" ld");
		LocalDate data_in_viitor;
		if (ld.equals("now")){
			data_in_viitor =LocalDate.now();		 
		}else{
			DateTimeFormatter ff = DateTimeFormatter.ofPattern("MM dd yyyy");
			data_in_viitor =LocalDate.parse(ld,ff);
			//System.out.println("Today_else+"+cat+tip+" "+ data_in_viitor);
		}
		System.out.println(data_in_viitor);
		switch(tip){
		case 'd':
			data_in_viitor =data_in_viitor.plusDays(cat);
			break;
		case 'm':
			data_in_viitor =data_in_viitor.plusMonths(cat);
			break;
		case 'y':
			data_in_viitor =data_in_viitor.plusYears(cat);
			break;
		case 'w':
			data_in_viitor =data_in_viitor.plusWeeks(cat);
			break;
		default :
			System.out.println("Tipul trebuie sa fie d-day, m-month, y-year, w-weeks. Try again!");
			break;
		}
		System.out.println("Today+"+cat+tip+" "+ data_in_viitor);
	}
	public static void main(String[] args){
		
		Date d= new Date();
		Character[] tip2 ={'d','m','y','w','z'};
		for(Character c: tip2){
			//d.getDate("now",1,c);
		}
		d.getDate("08 10 2017",60,'d');
		d.getDate("09 26 2017",40,'d');
		d.getDate("08 24 2017",31,'d');
		d.getDate("09 11 2017",35,'d');
		LocalDate locd =LocalDate.parse("2017-09-11");
		//System.out.println(locd);
		String str2 =new String("teststring");
		System.out.println(str2.substring(4, str2.length()));
		System.out.println(str2.substring(4, 5));
		String str3 =new String("teststring");
		if(str2.equals(str3))
			System.out.println("equals");
		
	}
	
	
	
	
	
	
}
