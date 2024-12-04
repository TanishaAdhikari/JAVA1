package PROJECT1;

public class student {
	private String name;
    private int age;
    private String grade;
    
	public student(String name, int age, String grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
        this.age = age;
        this.grade = grade;
	}
	public void showDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student student1 = new student("Tanisha Adhikari", 20, "A");
		student1.showDetails();
	}

}
