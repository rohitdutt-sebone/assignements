package asssignment_day_1;

import java.util.Scanner;

public class PermutationsOfString {
	public void permutations(String s, String ans) {
		if(s.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String res = s.substring(0,i) + s.substring(i+1);
			permutations(res, ans+c);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationsOfString p1 = new PermutationsOfString();
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		s = sc.nextLine();
		p1.permutations(s, "");
	}
}
