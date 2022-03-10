package asssignment_day_1;

import java.util.*;

public class Palindrome {

	public boolean findPalindrome(int num) {
		String s  = Integer.toString(num);
		int i = 0;
		int j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Palindrome p1 = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println(p1.findPalindrome(num));
	}

}
