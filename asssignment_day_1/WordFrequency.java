package asssignment_day_1;

import java.util.*;


public class WordFrequency {
	
	public void frequency(String s1) {
		HashMap<String, Integer> hm1 = new HashMap<>();
			String[] arrOfStr = s1.split(" ");
		for(int i = 0; i < arrOfStr.length; i++) {
		    if (!hm1.containsKey(arrOfStr[i])) {
	        	hm1.put(arrOfStr[i], 1);
	        }else {
	        	hm1.put(arrOfStr[i], hm1.get(arrOfStr[i]) + 1);
	        }
		}
		for (Map.Entry<String, Integer> e : hm1.entrySet()) {
			System.out.println("Key: " + e.getKey()
				+ " Value: " + e.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordFrequency f1 = new WordFrequency();
		String s1 = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		s1 = sc.nextLine();
		f1.frequency(s1);
	}

}
