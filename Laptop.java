package Q2;

public class Laptop {
    private double length;
    private double width;
    private double height;
    private double weight;
    
    public Laptop(){

    }
    public Laptop(double length, double width, double height, double weight){
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public void display(){
        System.out.println("Length: " + length+"cm\nWidth: " + width+"cm\nHeight: " + height+"cm\nWeight: " + weight+"kg");
    }

}