package iit.du.ac.bd;


import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DateCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Date: ");
		String date1 = scanner.next();
		
		System.out.println("Enter Second Date:");
		String date2 = scanner.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date3 = null;
		Date date4 = null;
		
		long diff = 0;
		
		try {
		    //Parsing the String
		    date3 = dateFormat.parse(date1);
		    date4 = dateFormat.parse(date2);
		    diff = date4.getTime() - date3.getTime();
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		//System.out.println(date3);
		//System.out.println(date4);
		System.out.println("The Duration is "+(diff/(1000*60*60*24))+ " days");
	   }
	
		
}
