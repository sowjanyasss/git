package training.ibm.day4;

public class AutoDemo {

	public static void main(String[] args) {
		int i = 100;
		Integer i1 = new Integer(i); //Wrapper class object - converting primitive to object
		
		Integer i2 = 100; // Automatic conversion of primitive to object called as Auto Boxing
		
		int j = i2; // Automatic conversion of wrapper object to equivalent primitive type called as unboxing
		
		Integer sum = 100 + 200;
		System.out.println(sum);
		
		//Parse methods - converting string into primitive
		
		String s2 = "123.45";
		double d1 = Double.parseDouble(s2);
		
		char ch = 'a';
		System.out.println(Character.isUpperCase(ch));
		
		System.out.println(Character.isDigit(ch));
		
		System.out.println(Character.toUpperCase(ch));
	}

}
