package asssignment_day_1;
import java.util.*;

public class anagram {
	
	public boolean findAnagram(String s1, String s2){
		if(s1.length() == 0 && s2.length() == 0) {
			return false;	
		}
		if(s1.length() != s2.length()) {
			return false;
		}
		char tempArray1[] = s1.toCharArray();
		char tempArray2[] = s2.toCharArray();
		Arrays.sort(tempArray1);
		Arrays.sort(tempArray2);
		s1 = new String(tempArray1);
		s2 = new String(tempArray2);
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		anagram a1 = new anagram();
		String s1 = new String();
		String s2 = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		s1 = sc.nextLine();
		System.out.println("Enter second string");
		s2 = sc.nextLine();
		System.out.println(a1.findAnagram(s1,s2));
	}

}
