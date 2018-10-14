package shapes;

public class Rectangle extends Shapes {
	
	private int length;
	   private int width;
	   
	   // Constructor
	   public Rectangle(int length, int width) {
	      this.length = length;
	      this.width = width;
	   }
	   
	   @Override
	   public double getArea() {
	      return length*width;
	   }

}
