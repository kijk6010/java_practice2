package baekjoon;

import java.util.Stack;
import java.util.Scanner;
public class BJ4949{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int ch =0;
		while(ch!=1) {
			String str = sc.nextLine();
			if(str.length()==1&&str.charAt(0)=='.') {
				ch=1;
			}else {
				if(check(str)) {
					sb.append("yes").append("\n");
				}else {
					sb.append("no").append("\n");
				}	
			}
		}
		System.out.print(sb);
	}
	private static boolean check(String str) {
		Stack<Character> st = new Stack<>();
		String strCheck = "()[]";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(strCheck.contains(Character.toString(c))){
				if(c=='('||c=='[') {
					st.push(c);
				}else {
					if(!st.empty()) {
						if((st.peek()=='('&&str.charAt(i)==')')||(st.peek()=='['&&str.charAt(i)==']')) {
							st.pop();
						}else return false;
					}else {
						return false;
					}
				}
			}
		}
		return st.empty();
	}
}
