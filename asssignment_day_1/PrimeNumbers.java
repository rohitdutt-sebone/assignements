package asssignment_day_1;

import java.util.Scanner;

public class PrimeNumbers {
	public void printPrime(int n) {
		int i = 1;
		while(i <= n) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count <= 2) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbers p1 = new PrimeNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		p1.printPrime(num);
	}
}
