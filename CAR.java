package PROJECT1;

public class CAR {
	private String make;
    private String model;
    private int year;

  
    public CAR(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
	public static void main(String[] args) {
        CAR myCar = new CAR("Toyota", "Corolla", 2020);
        
        myCar.displayDetails();
	}

}
