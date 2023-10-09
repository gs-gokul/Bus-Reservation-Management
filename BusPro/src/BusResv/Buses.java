package BusResv;

public class Buses {
	private int busno;
	private Boolean ac;
	private int capacity;
	
	Buses(int no,boolean ac,int cap){
		this.busno=no;
		this.ac = ac;
		this.capacity = cap;
	}
	public int getCapacity() {
		return  capacity;
	}
	public void setCapacity(int cap) {
		capacity = cap;
	}
	public int getbusno() {
		return busno;
	}
	
	
	public void Display() {
		System.out.println("Busno:"+busno+" ,AC:"+ac+" ,Capacity:"+capacity);
	}
	
}
