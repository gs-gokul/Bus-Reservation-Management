package BusResv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Passenger {
	
	String Passengername;
	int busno;
	Date date;
	
	Passenger(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the passenger name:");
		Passengername = sc.next();
		System.out.println("Enter the Busno:");
		busno = sc.nextInt();
		System.out.println("Enter the Date(dd-MM-yyyy):");
		String dateval = sc.next();
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormate.parse(dateval);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Passenger> pas,ArrayList<Buses> Bus) {
		int capacity = 0;
		for(Buses b:Bus) {
			if(b.getbusno()==busno) {
				capacity = b.getCapacity();
			}
		}
		int count = 0;
		for(Passenger b:pas) {
			if(b.busno==busno && b.date.equals(date)) {
				count++;
			}
		}
		
		return count<capacity?true:false;
	}
	
	public boolean isAvailable1(ArrayList<Passenger> pas,ArrayList<Buses> Bus) {
		for(Buses b:Bus) {
			if(b.getbusno()==busno) {
				return false;
			}	
		}
		return true;
	}
	
}
