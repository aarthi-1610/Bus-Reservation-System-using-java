package BusReservationSys;
import java.util.Date;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int Busno;
	Date date;
	Booking(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name of Passenger: ");
		passengerName=scan.next();
		System.out.println("Enter Bus Number: ");
		Busno=scan.nextInt();
		System.out.println("Enter date dd-MM-yyyy: ");
		String dateInput=scan.next();
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
		try {
			date= dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusno()== Busno) {
				capacity=bus.getCapacity();
			}
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.Busno==Busno && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}

}
