
public class Audio extends Publication{
	int time;
	public Audio(int price, String title,int time) {
	 super(price, title); 
	 this.time=time; 
	 }
	public Audio(int price, String title) {
	 super(price, title); 
	 }
	public int getTime() {
	 return time; 
	 }
	 public void display() {
		 System.out.println("Audio \nTitle = "+title+
		"\n price = " +price+ " \n time " + time); 
		 }
}