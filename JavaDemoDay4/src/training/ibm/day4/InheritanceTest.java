package training.ibm.day4;

//super class
class person{
	protected String name; //1.accessible from all the subclasses 2.from any class within the same package
	private int age; //accessible only from the same class 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

//subclass
class Employee extends person{
	String empid;
	String dept;
	double sal;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void displayEmployeeInfo(){
		System.out.println(name + "\t" + empid + "\t" + dept + "\t" + "\t" + sal);
	}
}

class Manager extends Employee{
	
	}
public class InheritanceTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Ram");
		employee.setAge(45);
		employee.setEmpid("09699h");
		employee.setDept("Security");
		employee.setSal(18954687.22);
		employee.displayEmployeeInfo();
		System.out.println(employee.getName() + "\n" + employee.getAge());
				
		employee.setDept("Risk management");
		employee.setSal(1234588.987);
		employee.setName("Simon");
		
		
		System.out.println(employee.getSal() + "\n" + employee.getDept() + "\n" + employee.getName());
		
	}

}
