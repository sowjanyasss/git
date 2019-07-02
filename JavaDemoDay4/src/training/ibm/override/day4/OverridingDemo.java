package training.ibm.override.day4;

//super class
class person{
	protected String name; //1.accessible from all the subclasses 2.from any class within the same package
	private int age; //accessible only from the same class 
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo(){
		System.out.println(this.name + "\t" + this.age);
	}
	final public void show(){
		
	}
	
	}

//subclass
final class Employee extends person{
	String empid;
	String dept;
	double sal;
	
	
	public Employee(String name, int age, String empid, String dept, double sal) {
		super(name, age);
		this.empid = empid;
		this.dept = dept;
		this.sal = sal;
	}

	public void displayInfo(){
		super.displayInfo(); //calling super class method
		System.out.println(name + "\t" + empid + "\t" + dept + "\t" + sal);
	}
	/*public void show(){
		
	}*/
}

/*class Manager extends Employee{

	public Manager(String name, int age, String empid, String dept, double sal) {
		super(name, age, empid, dept, sal);
		// TODO Auto-generated constructor stub
	}*/
	
class Student extends person{
	int rollno;
	public Student(String name, int age, int rollno) {
		super(name, age);
		this.rollno = rollno;
		// TODO Auto-generated constructor stub
	}
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Mavis", 30 , "187", "Operations", 123245.44);
		
		
				
		employee.displayInfo();
		
		//superclass reference is pointing to subclass object
		person Person1 = new Employee("Mavis", 30 , "111", "Security", 123245.44);
		Person1.displayInfo();
		
		person Person2 = new Student("John", 20 , 111);
		Person2.displayInfo();
		
		//polymorphic behavior
	}
	

}
