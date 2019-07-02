package training.ibm.day4;

class Parent{
	String message;
	Parent(){
		System.out.println("Parent constructor..");
	}
	
	Parent(String message){
		System.out.println(message);	
	}
}

class Child extends Parent{
	Child(){
		//super("Super parameterized constructor...."); //keyword to represent the super class
		System.out.println("Child Constructor..");
	}
	
}
public class ConstructorChainingDemo {

	public static void main(String[] args) {
		Child child = new Child();
		
	}

}
