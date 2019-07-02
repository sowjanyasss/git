package training.ibm.day4;

public class NonDuplicatecharacter {

	public static void main(String[] args) {
		String str = "Sital Patro";
		char ch[] = str.toCharArray();
		
		for(char value:ch){
			if(str.indexOf(value)==str.lastIndexOf(value));
			
			System.out.println(value);
		}

	}

}
