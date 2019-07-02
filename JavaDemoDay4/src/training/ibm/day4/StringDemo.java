package training.ibm.day4;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "Manipal";
		String str2 = "Manipal";
		
		System.out.println(str1==str2);
		
		//immutable feature when we try to change the string it will take new value
		str1 = "IBM";
		str1 = str2;
		System.out.println(str1==str2);
		System.out.println(str1 + "\t" + str2);
		//references
		if(str1==str2)
			System.out.println("Same references");
		else
			System.out.println("Different references");
		
		//values
		
		if(str1.equals(str2))
			System.out.println("Equal values");
		else
			System.out.println("unequal values");
		
		String str3 = new String("Manipal");
		
		
		//comparing references
		if(str1 == str3)
			System.out.println("Same references...");
		else
			System.out.println("Different references...");
		
		
		//comparing values
		if(str1.equals(str3))
			System.out.println("Equal values");
		else
			System.out.println("unequal values");
		
		
	}

}
