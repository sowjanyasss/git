package training.ibm.day4;

public class StringMethodsDemo {

	public static void main(String[] args) {
		/*String message1 = "Good";
		String message2 = message1 + " Day";
		System.out.println(message1 + "\n" + message2);
		message2 += " folks";
		System.out.println(message2);
		
		//Method chaining
		int length = message2.concat(" It's great day").concat(" We learning java!!").toUpperCase().length();
		System.out.println(length);
		*/
		int age = 25;
		String agestr = String.valueOf(age);
		String agestr2 = age + "";
		System.out.println(agestr + "\n" + agestr2);
		String str = "Prolearn";
		System.out.println(str.indexOf('o')); //2
		System.out.println(str.lastIndexOf('r')); //6
		System.out.println(str.charAt(4)); // e
		System.out.println(str.replace('r', 'o'));
		
//counting occurrence of 'r' in the string 'prolearn' / duplicate String / Repeated character in string/count of repitation
		int count =0;      
  
        // Create an array of given String size 
        char ch[] = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) {
        	if('r'==ch[i])
        		count++;
        } 
        System.out.println("Number of Occurrence of 'r' is: " +count);
			
        String str1 = "Learning Java";
        String[] words = str1.split("i");
        for(String word : words){
        	System.out.println(word);
        }
		}
		
		}
		
	


