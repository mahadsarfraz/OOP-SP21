
public class Book extends Publication {
	int pageNo;
	public Book(int price, String title,int pageNo) {
		super(price, title); 
		this.pageNo=pageNo;
	}
	public void display() {
		System.out.println("Book detail \nTitle = "+title+ 
				"\n price = " +price+  "\n page no" +pageNo); 
						 }
	public int getPageNo() {
		return pageNo; 
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo; 
 
	}
}