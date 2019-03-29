package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String output ="";
		for (int i=0; i<input.length();i++) {
			output += (input.substring(i,i+1) + input.substring(i,i+1) + input.substring(i,i+1));
		}
		return output;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		String in = "    " + input + "   ";
		String output = "";
		String answer = "";
		String out = "";
		for(int i = 0; i<input.length()-8; i++) {
			if (in.substring(i,i+4).equalsIgnoreCase("bert")) {
				output = in.substring(i+4);
				for (int j=0;j<output.length()-4;j++) {
					if(output.substring(j,j+4).equalsIgnoreCase("bert")) {
						out = output.substring(0,j);
						for (int k = 0; (out.length()-k)>0;k++) {
						answer = answer + out.substring(out.length()-k-1,out.length()-k);
						}
					}
				}
			}
		}
		return answer;
	}
	
	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		double d = Math.pow((Math.pow(a, 2)),0.5);
		double e = Math.pow((Math.pow(b, 2)),0.5);
		double f = Math.pow((Math.pow(c, 2)),0.5);
		double g = f-e;
		double h = e-d;
		double i = d-f;
		double j = d-e;
		if (d>e && e>f) {
			if (g == h);{
			return true;
			}
		}
		else if (d<e && e<f) {
			if (g == h) {
			return true;
			}
		}
		else if (d<e && e>f) {
			if (h==i) {
				return true;
			}
		}
		else if (d>e && e<f) {
			if (-g==j) {
				return true;
			}
		}
		else {
			return false;
		}
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
			String x = input.substring(0, (input.length()-a)/2);
			String y = input.substring((input.length()-a)/2+a,input.length());
			String z = x + y;
		return z;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		if (input.length()>=3) {
			if (input.substring(input.length()-3).equalsIgnoreCase("dev")){
				return true;
			}
			else return false;
		}
		else return false;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int out = 0;
		for (int i=3; i<input.length()-2;i++) {
			if (input.substring(i,i+1).equals(input.substring(i+1,i+2))){
				out++;
				if ((input.substring(i+1,i+2).equals(input.substring(i+2,i+3)))==false){
					out++;
					return out;
				}
			}
		}
		return out;
	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String input) {
		
		String in = " " + input + " ";
		int count = 0;
		for (int i=1;i<input.length();i++) {
			if (in.substring(i,i+2).equalsIgnoreCase("am") && in.substring(i-1,i).equals(" ") && in.substring(i+2,i+3).equals(" ")) {
			count++;
			}
		}
		return count;
	
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int input) {
		if (input%3==0&&input%5==0) {
			return "fizzbuzz";
		}
		else if (input%3==0) {
			return "fizz";
		}
		else if (input%5==0){
			return "buzz";
		}
		else return null;
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String input) {
		
		
		
		return 0;
		
	}
	
	
}
