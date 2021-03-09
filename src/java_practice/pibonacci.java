package java_practice;

import java.util.Scanner;

public class pibonacci {
	public static int pibonacci(int n) {
		if(n==0||n==1) {
			return n;
		}
		return pibonacci(n-1)+pibonacci(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.print(pibonacci(N));
	}
}
