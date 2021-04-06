import java.util.Scanner;


public class RunnerLab6 extends Calculator{
	
	RunnerLab6(double x, double y) {
		super(x ,y);
		
	}

	public static void main(String[] args) {
		RunnerLab6 runner = new RunnerLab6(15,3);
		Scanner myVar = new Scanner(System.in);
	
		System.out.println("Enter 1 for sum ");
		System.out.println("Enter 2 for product ");
		System.out.println("Enter 3 for division ");
		System.out.println("Enter 4 for modulus ");
		System.out.println("Enter 5 for sin ");
		System.out.println("Enter 6 for cos ");
		System.out.println("Enter 7 for tangent ");
	
	    double num = myVar.nextDouble();
	
	    if(num==1) {
        
	    	System.out.println("You have asked for sum");
            runner.sum();
        }
        else if(num==2) {
        	System.out.println("You have asked for multiplction");
            runner.multiply();
        }
        else if(num==3) {
        	System.out.println("You have asked for division");
            runner.divide();
        }
        else if(num==4){
        	System.out.println("You have asked for modulus");
            runner.modulus();
        }
        else if(num==5){
        	System.out.println("You have asked for sin");
            runner.sin();
        }
        else if(num==6){
        	System.out.println("You have asked for cosine");
            runner.cos();
        }
        else if (num == 7){
        	System.out.println("You have asked for tangent");
            runner.tan();
        }
        else
        	System.out.println("Invalid number entered ");
	
  }
}
