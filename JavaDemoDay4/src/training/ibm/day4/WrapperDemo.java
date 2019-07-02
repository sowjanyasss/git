package training.ibm.day4;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 100;
		Integer i1 = new Integer(i); //Wrapper class object - converting primitive to object
		
		
		Integer i2 = new Integer(240); //converting string to integer object
		
		//convert string to integer using 'parseint' method
		String str = "444";
		int strval = Integer.parseInt(str);
		System.out.println(strval);
		
		//Convert wrapper into string
		Integer i3 = new Integer("111");
		String str1 = i3.toString();
		
		//Convert primitive to string
		int num1 = 25;
		String str2 = Integer.toString(num1);
	}

}
