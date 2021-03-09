package java_practice;

import java.util.Scanner;

public class factorial {
	public static int factorial(int n) {
		if(n==1) return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.print(factorial(N));
	}
}
