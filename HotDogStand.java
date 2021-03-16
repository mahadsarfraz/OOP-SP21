import java.util.Scanner;

public class HotDogStand {
	public int Id;
	public int sold_HotDogs;
	
	Scanner myVar = new Scanner(System.in);
	HotDogStand(){

	 System.out.print("Enter ID: ");
	 Id = myVar.nextInt();
	 System.out.print("Enter hot dogs sold: ");
	 sold_HotDogs = myVar.nextInt();
	}
	
	
	
	void JustSold() {
		sold_HotDogs = sold_HotDogs + 1;
		System.out.println(Id + " has sold " + sold_HotDogs);
	}
}