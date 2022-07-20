package BasicJavaLibraries;

public class WrapperCL {
	
	public static void main (String[]args) {
		Integer myInt = 5;
		Double myDouble = 5.99;
		
		System.out.print(myInt);
		System.out.print(myDouble);
		
		String myString = myInt.toString();
		System.out.print(myString.length());
		
	}

}
