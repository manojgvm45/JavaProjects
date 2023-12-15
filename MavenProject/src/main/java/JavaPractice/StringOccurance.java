package JavaPractice;

public class StringOccurance {

	public static void main(String[] args) {
		String input ="NANDAN";
		char[] chArray = input.toCharArray();
		int count;
		
		for (int i=0; i<chArray.length ; i++) {
			count=1;
			for (int j=i+1; j<chArray.length ; j++) {
				if(chArray[i]==chArray[j]) {
				count++;
				chArray[j]='0';
				}
			}
			if(chArray[i]!='0' && count>=0) {
				System.out.println(chArray[i] +" letter appeared at " + count +" times");
			}

		}
				

	}

}
