package training.ibm.day4;

public class ArithmaticDemo {
	int sum(int i, int j){
		return i + j;
	}
	
	int sum(Integer i, Integer j){
		return i + j + 1;
	}
	
	public static void main(String[] args) {
		
		Integer i1 = new Integer("123");
		Integer i2 = 144;
		
		ArithmaticDemo arobj = new ArithmaticDemo();
		System.out.println(arobj.sum(i1, i2));
		
	}

}
