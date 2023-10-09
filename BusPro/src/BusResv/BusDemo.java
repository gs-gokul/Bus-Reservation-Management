package BusResv;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
	public static void main(String[] args) {
		
		ArrayList<Buses> bus = new ArrayList<Buses>();
		ArrayList<Passenger> pas = new ArrayList<Passenger>();
		
		bus.add(new Buses(1,true,2));
		bus.add(new Buses(2,true,40));
		
		for(Buses b:bus) {
			b.Display();
		}
		int userOption = 1;
		Scanner sc = new Scanner(System.in);
		while(userOption == 1) {
			System.out.println("1. Enter to book \n2. cancel the book");
			userOption = sc.nextInt();
			if(userOption==1) {
				Passenger booking = new Passenger();
				if(booking.isAvailable(pas,bus)) {
					pas.add(booking);
					System.out.println("Booked Successfully");
				}
				else if(booking.isAvailable1(pas,bus)) {
					System.out.println("The Busno is  not available");
				}	
				else
					System.out.println("Sorry it was full, try another date or buses");
			}
			
			
		}
	}

}
