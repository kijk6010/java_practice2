package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ1934 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int lcm=0;
		int a=0;
		int b=0;
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<N;i++) {
			String[] str = br.readLine().split(" ");
			a = Integer.parseInt(str[0]);
			b = Integer.parseInt(str[1]);
			lcm = a*b/gcd(a,b);
			sb.append(lcm).append("\n");
		}
		System.out.println(sb);
	}
	public static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
}
