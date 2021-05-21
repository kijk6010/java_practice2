package baekjoon;

import java.util.Stack;
import java.util.Scanner;
public class BJ1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Stack<Integer> st = new Stack<>();
		StringBuffer sb = new StringBuffer();
		
		int i=0;
		while(N-->0) {
			int input =sc.nextInt();
			if(i<input) {
				for(int k=i+1;k<=input;k++) {
					st.push(k);
					sb.append('+').append('\n');
				}
				i=input;
			}else if(st.peek()!=input) {
				System.out.print("NO");
				return;
			}
			st.pop();
			sb.append('-').append('\n');
		}
		System.out.print(sb);
	}

}
