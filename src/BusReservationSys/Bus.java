package BusReservationSys;

public class Bus {
	private int Busno;
	private boolean Ac;
	private int Capacity;// get and set method  to use access the values 
	public int getBusno() {
		return Busno;
	}
	public void setBusno(int busno) {
		Busno = busno;
	}
	public boolean isAc() {
		return Ac;
	}
	public void setAc(boolean ac) {
		Ac = ac;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	Bus(int no, boolean ac,int cap){
		this.Busno=no;
		this.Ac=ac;
		this.Capacity=cap;
	}
	public void displayBusInfo() {
		System.out.println(" Bus No: "+Busno+" A/C: "+Ac+" Total Capacity: "+Capacity);
	}
	

}
