

public class Clock {
	protected int hour;
	protected int minute;
	protected int second;
	
	public Clock(){
		 this.hour = 0;
		 this.minute = 0;
		 this.second = 0;
	}
	
	public Clock(int hour , int minute , int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setminute(int minute) {
		this.minute = minute;
	}
	
	public int getminute() {
		return minute;
	}
	
	public void setsecond(int second) {
		this.second = second;
	}
	
	public int getsecond() {
		return second;
	}
	
	public void display() {
		System.out.println("Hour : " + hour + "\n minute : " +minute +"\n secondonds : " +second);
	}
	

}
