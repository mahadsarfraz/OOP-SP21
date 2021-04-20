package Q2;

public class Computer {
    private double wordsize;
    private double memorysize;
    private double storagesize;
    private double speed;

    public Computer(){

    }
    public Computer(double wordsize, double memorysize, double storagesize, double speed){
        this.wordsize = wordsize;
        this.memorysize = memorysize;
        this.storagesize = storagesize;
        this.speed = speed;
    }
    public void display(){
        System.out.println("Word size: " + this.wordsize+"bits\nMemory size: " + this.memorysize+"Mb\nStorages: " + this.storagesize+"Mb\nSpeed: " + this.speed+"Mhz");
    }

}