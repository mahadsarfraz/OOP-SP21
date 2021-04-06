import java.lang.Math;
 
public class Calculator {
	private double x;
	private double y;
	
//	Calculator(){
//		this.x = 2;
//		this.y = 3;
//	}
	
	Calculator(double x ,double y){
		this.x = x;
		this.y = y;
		
		}
	public void setX(double x) {
		this.x = x;
	   }
	
	public double getX() {
		return this.x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void sum() {
		double sum;
		sum = x + y;
		System.out.println("Sum is : " +sum);
	}
	
	public void multiply() {
		double product;
		product = x * y;
		System.out.println("Product = " +product);
	}

	public void divide() {
		double divide;
		divide = x / y;
		System.out.println("Division = "+divide);
	}
	
	public void modulus() {
		double modulus;
		modulus = x % y;
		System.out.println("Modulus is : "+modulus);
	}
	
	public void sin() {
		double sine;
        double radians = Math.toRadians(x);
        sine=Math.sin(radians);
        System.out.println("SIN = "+sine);
	}
	
	public void cos() {
		double cos;
		double radians = Math.toRadians(y);
		cos = Math.cos(radians);
		System.out.println("Cos = "+cos);
	}
	
	public void tan() {
		double tan;
		double radians = Math.toRadians(y);
		tan = Math.tan(radians);
		System.out.println("Tangent = "+tan);
	}


}

