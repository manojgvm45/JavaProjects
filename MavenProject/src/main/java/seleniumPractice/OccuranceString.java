package seleniumPractice;

public class OccuranceString {
	String given ="GeeksforGeeks";
    String input = given.toLowerCase();
    static int occur;
	
	public int occuranceString() {      
		String given ="GeeksforGeeks";
		             String input = given.toLowerCase();
		             System.out.println(input);
		             char toFind = 'e';
		             int Occurance = 0;
		             
		             for (int i=0; i<input.length(); i++) {
		            	 if(input.charAt(i)==toFind) {
		            		 Occurance = Occurance+1;
		            	 }
		             }
		             System.out.println(Occurance);
					return Occurance;
		            
		}
	public void eachOccuarance() {
		
		char[] chArray = input.toCharArray();
		int occur1=0;
		//System.out.println(chArray);
		for (int i=0; i<input.length();i++) {
						char ch = chArray[i];
							
						}
		
	}
	public static void main(String[] args) {
		
		OccuranceString methodName = new OccuranceString();
	 	occur=methodName.occuranceString();
	 	System.out.println(occur);
	 	methodName.eachOccuarance();
		
	}

}
