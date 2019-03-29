package test;

public class Gtest {

	public static void main(String [] args) {
		
		String input = "xxbertyy";
		
		String output = bert1(input);
		
		System.out.println(output);
		
		//System.out.println(bert2(output));
	}	
	
		
		public static String bert1(String input){
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
}
//					return output;
//				}
//			}
//		return output;
//		}
		
//		public static String bert2(String input) {
//			String out = "";
//			for (int j=0;j<input.length()-4;j++) {
//				if(input.substring(j,j+4).equalsIgnoreCase("bert")) {
//					out = input.substring(0,j);
//					return out;
//				}
//			}
//		return out;
		
