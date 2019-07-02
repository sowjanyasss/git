package training.ibm.day4;

public class Countingletters{

	public static void main(String[] args) {
		String sentence = "I am in Bangalore";
		int count = 0;
		for(int i = 0; i<sentence.length(); i++){
			if((sentence.charAt(i) == ' ') && (sentence.charAt(i+1)!= ' '));
			
			count ++;	
			}
			System.out.println("Number of letters in a sentence are:" + count);
		}
		
	}


