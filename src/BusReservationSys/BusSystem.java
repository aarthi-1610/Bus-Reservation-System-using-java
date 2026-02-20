package BusReservationSys;
import java.util.Scanner;
import java.util.ArrayList;
class BusSystem {
	public static void main(String[] args) {
		ArrayList<Bus>buses=new ArrayList<Bus>();
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));

		
		Scanner scan=new Scanner(System.in);
		int useroption=1;
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		while(useroption==1) {
			System.out.println("Enter 1 to book and  to Exit ");
			useroption=scan.nextInt();
			if(useroption==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking is Conformed!");
				}else {
					System.out.println("Sorry! Bus is Full. Try abother Bus or Date");
					//break;
				}
			}

		}
	}

}
