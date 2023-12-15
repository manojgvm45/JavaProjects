package JavaPractice;

import java.util.TreeMap;
import java.util.TreeSet;

public class GreatestSubstring {

	public static void main(String[] args) {
			String[] str = {"hjdhdbjjads","erfdvcs","hcsbjhcbsjhcsjc"};
			TreeSet<Integer> treeSort = new TreeSet<Integer>();
			for(String strEach : str) {
				//int lengthofWord = strEach.length();
				//System.out.println(strEach+":"+lengthofWord);
				treeSort.add(strEach.length());
		
			}
			
			System.out.println(treeSort);
			int greatest = treeSort.pollLast();
			System.out.println("greatest substring: "+greatest);

			TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
					
			for(String strMap : str) {
				treeMap.put(strMap, strMap.length());
			}
				treeMap.pollLastEntry();
			System.out.println("greatest substring and value: "+ treeMap.pollLastEntry() );

			
	}

}
