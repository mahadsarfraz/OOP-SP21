
public class Pizza {
	private String pizzaSize;
    private int cheeseTop;
    private int pepperoniTop;
    private int hamTop;
    
    
    Pizza(){
    	this.pizzaSize = "";
    	this.cheeseTop = 0;
    	this.pepperoniTop = 0;
    	this.hamTop = 0;
    }
    
    Pizza(String pizzaSize , int cheeseTop , int pepperoniTop , int hamTop){
    	this.pizzaSize = pizzaSize;
    	this.cheeseTop = cheeseTop;
    	this.pepperoniTop = pepperoniTop;
    	this.hamTop = hamTop;
    }
    
    public Pizza(Pizza pizza1) {
		
	}

	public void setPizzaSize(String pizzaSize) {
    	this.pizzaSize = pizzaSize;
    }
    
    public String getPizzaSize() {
    	return pizzaSize;
    }
    
    public void setCheeseTop(int cheeseTop) {
    	this.cheeseTop = cheeseTop;
    }
    
    public int getCheeseTop() {
    	return cheeseTop;
    }
    
    public void setPepperoniTop(int pepperoniTop) {
    	this.pepperoniTop = pepperoniTop;
    }
    
    public int getPepperoniTop() {
    	return pepperoniTop;
    }
    
    public void setHamTop(int hamTop) {
    	this.hamTop = hamTop;
    }
    
    public int getHamTop() {
    	return hamTop;
    }
    
    public double calCost() {
    	if (pizzaSize == "small") {
    		return 10 + (cheeseTop + pepperoniTop + hamTop) * 2;
    	}
    	else if (pizzaSize == "medium") {
    		return 12 + (cheeseTop + pepperoniTop + hamTop) * 2;
    	}
    	else if(pizzaSize == "large") {
    		return 14 + (cheeseTop + pepperoniTop + hamTop) * 2;
    	}
    	else
    		return 0;
    	
    }
    
    public void getDescription() {
        
        System.out.println ("Pizza size: " + pizzaSize + "\n Cheese toppings " 
   				+ cheeseTop + " \nPepperoni toppings: "
   				+ pepperoniTop + "\n Ham toppings: " + hamTop
   				+ "\n Pizza cost: " + calCost());
        }
}
