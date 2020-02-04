package labs;

import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class lab3 {

	static String removeDuplicate(char str[],int n) 
	    { 
	        // Used as index in the modified string 
	        int index = 0; 
	  
	        // Traverse through all characters 
	        for (int i = 0; i < n; i++) 
	        { 
	  
	            // Check if str[i] is present before it  
	            int j; 
	            for (j = 0; j < i; j++)  
	            { 
	                if (str[i] == str[j]) 
	                { 
	                    break; 
	                } 
	            } 
	  
	            // If not present, then add it to 
	            // result. 
	            if (j == i)  
	            { 
	                str[index++] = str[i]; 
	            } 
	        } 
	        return String.valueOf(Arrays.copyOf(str, index)); 
	    } 
	public static void main(String[] args) {
		

	    
		// TODO Auto-generated method stub
		/* char c[] = {'J', 'a', 'v', 'a'};
	      String s1 = new String(c);
	      StringBuilder sb=new StringBuilder(s1);
	      sb.append(s1);
	    System.out.println(sb);*/
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("enter query choice");
		System.out.println("1.query 1\n2.query 2\n3.query 3\n4.query 4\n5.query 5\n6.query 6");
		ch=sc.nextInt();
		switch(ch)
		{
		
		case 1:
		System.out.println("enter string");
		String obj= new String(sc.next());
		int choice;
		do
		{
			System.out.println("enter choice");
			System.out.println(" 1. Add the String to itself \n 2.replace odd positions with #\n "
					+ "3.Remove duplicate characters in the String \n 4.Change odd characters to upper case");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				 obj=obj.concat(obj);
				 System.out.println(obj);
				 break;
				 
			case 2:
				 for(int i=0;i<obj.length();i++)
				 {
					 if((i+1)%2!=0)
					 {
						 obj=obj.substring(0,i)+"#"+obj.substring(i+1,obj.length());
					 }
				 }
				 System.out.println(obj);
				 break;
			case 3:
				 char str[] = obj.toCharArray();
				  int n =obj.length(); 
			        System.out.println(removeDuplicate(str, n)); 
				break;
			
			case 4:
				for(int i=0;i<obj.length();i++)
				 {
					 if((i+1)%2!=0)
					 {
						 obj=obj.substring(0,i)+Character.toUpperCase(obj.charAt(i))+obj.substring(i+1,obj.length());
					 }
				 }
			
			System.out.println(obj);
			break;
			
			default :
				break;
			}
			
			
		}while(choice!=0);//case 1
		break;
		case 2:
			System.out.println("Enter date in yyyy mm dd format");
			int year=sc.nextInt();
			int month=sc.nextInt();

			int dayOfMonth=sc.nextInt();
			LocalDate date=LocalDate.of(year, month, dayOfMonth);
			LocalDate currentdate= LocalDate.now();
			Period period=date.until(currentdate);
			System.out.println("Days:-"+period.getDays());
			System.out.println("Month:-"+period.getMonths());
			System.out.println("Year:-"+period.getYears());
			break;
		case 3:
			System.out.println("Enter date1 in yyyy mm dd format");
			int year1=sc.nextInt();
			int month1=sc.nextInt();

			int dayOfMonth1=sc.nextInt();
			LocalDate date1=LocalDate.of(year1, month1, dayOfMonth1);
			
			System.out.println("Enter date2 in yyyy mm dd format");
			int year2=sc.nextInt();
			int month2=sc.nextInt();

			int dayOfMonth2=sc.nextInt();
			LocalDate date2=LocalDate.of(year2, month2, dayOfMonth2);
			Period period1=date1.until(date2);
			System.out.println("Days:-"+period1.getDays());
			System.out.println("Month:-"+period1.getMonths());
			System.out.println("Year:-"+period1.getYears());
			break;
		case 4:
			System.out.println("Enter purchase date in yyyy mm dd format");
			int pyear=sc.nextInt();
			int pmonth=sc.nextInt();

			int pdayOfMonthp=sc.nextInt();
			LocalDate purchase_date=LocalDate.of(pyear, pmonth, pdayOfMonthp);
			System.out.println("enter years of warrenty period");
			int warrenty_year=sc.nextInt();
			System.out.println("enter months of warrenty period");
			int warrenty_month=sc.nextInt();

			LocalDate warrenty_expire=purchase_date.plusMonths(warrenty_month);
			warrenty_expire=warrenty_expire.plusYears(warrenty_year);
			System.out.println(warrenty_expire.toString());
			break;
		case 5:
			System.out.println("Enter zone id");
			String zone_id=sc.next();
			ZoneId zoneid=ZoneId.of(zone_id);
			ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(),zoneid);
			System.out.println(zonedDateTime.toString());
			break;
		case 6:
			System.out.println("enter first name and last name");
			String fname1=sc.next();
			String lname=sc.next();
			System.out.println("Name:" +fname1 + " " +lname);
			System.out.println("Enter birth date in yyyy mm dd format");
			int year3=sc.nextInt();
			int month3=sc.nextInt();
			int dayOfMonth3=sc.nextInt();
			LocalDate date3=LocalDate.of(year3, month3, dayOfMonth3);
			
			Period period3=date3.until(LocalDate.now());
			System.out.println("Age: "+period3.getYears()); 
			break;
			
			default:
				 break;
		}//outer switch
	}while(ch!=0);//outer do
		
	}
}
