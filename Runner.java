import java.util.Scanner;


public class Runner {
	public static void main(String[] args) {
		
		int Id = -1;
		Scanner myVar = new Scanner(System.in);
		System.out.print("first stand: ");
		HotDogStand H1 = new HotDogStand();
		System.out.print("second stand: ");
		HotDogStand H2 = new HotDogStand();
		System.out.print("third stand: ");
		HotDogStand H3 = new HotDogStand();
		
		
		while(Id != 0 ) {
			System.out.print("Enter Id of HotDogStand : ");
		Id = myVar.nextInt();
			
			if (Id == H1.Id) {
				H1.JustSold();
			}
			else if(Id == H2.Id) {
				H2.JustSold();
			}
			else if(Id == H3.Id) {
				H3.JustSold();
			}
			else if(Id == 0) {
				System.out.print("Your program has been terminated");
			}
			else {
				System.out.println("Enter correct Id or 0 to terminate");
			}
			
		}
	}
}
