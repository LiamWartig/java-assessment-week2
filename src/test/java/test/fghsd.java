package test;

public class fghsd {

	String input = "thef";
	
public String multChar(String input) {
		
		String output ="";
		
		for (int i=0; i<input.length();i++) {
			
			output = input.substring(i) + input.substring(i) + input.substring(i);
			
		}
		
		return output;
		
		System.out.println(output);
	}
	
	
}
