public class Publication {
	public int price;
	String title;
	public Publication(int price, String title) {
		this.price = price; 
		this.title = title;
		}
	
	public int getPrice() {
		return price;
		}
	
	public void setPrice(int price) {
		this.price = price;
		}
	public String getTitle() {
		return title; 
		}
	public void setTitle(String title) {
		this.title = title; 
		}
}