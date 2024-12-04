package PROJECT1;

public class Rectangle {
	private double length;
    private double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double calculateArea() {
        return length * width;
    }

    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle myRectangle = new Rectangle(5.0, 3.0);
	        
	        double area = myRectangle.calculateArea();
	        System.out.println("Area of the rectangle: " + area);

	      
	        double perimeter = myRectangle.calculatePerimeter();
	        System.out.println("Perimeter of the rectangle: " + perimeter);
	    }
	}


