package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class BJ9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			if(check(str)) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		System.out.println(sb);
	}
	private static boolean check(String str) {
		Stack st = new Stack();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				st.push(str.charAt(i));
			}else {
				if(!st.empty()) {
					st.pop();
				}else {
					return false;
				}
			}
		}
		return st.empty();
	}
}
