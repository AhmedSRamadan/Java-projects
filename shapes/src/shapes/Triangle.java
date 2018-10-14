package shapes;

public class Triangle extends Shapes {

	 private int base;
	   private int height;
	   
	   // Constructor
	   public Triangle (int base, int height) {
	      this.base = base;
	      this.height = height;
	   }
	   	 
	   // Override the inherited getArea() to provide the proper implementation
	   @Override
	   public double getArea() {
	      return 0.5*base*height;
	   }
	
	
}
