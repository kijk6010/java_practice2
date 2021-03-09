package java_practice;
import java.util.Scanner;
public class hanoi {
	public static void hanoi(int n,int start,int stop,int end) {
		if(n==1) System.out.println(start+" "+end);
		else{
			hanoi(n-1,start,end,stop);
			System.out.println(start+" "+end);
			hanoi(n-1,stop,start,end);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		System.out.println((int)Math.pow(2,K)-1);
		hanoi(K,1,2,3);
	}

}
