package JavaPractice;

public class CountofWords {

	public static void main(String[] args) {
		String str = "I love India";
		int count=0;
		str=str.toLowerCase();
		String[] str1=str.split(" ");
		int lengthCount = str1.length;
		System.out.println(lengthCount);
		for (String string : str1) {
			count++;
			
		}
		System.out.println("count of words :" + count);

	}

}
