package baekjoon;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class BJ_practice {
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N= Integer.parseInt(br.readLine());
		long[] len = new long[N-1];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N-1;i++) {
			len[i]=Long.parseLong(st.nextToken());
		}
		long[] price =new long[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			price[i]=Long.parseLong(st.nextToken());
		}
		long result=0;
		int c=0;
		while(c!=N-1) {
			result+=price[c]*len[c];
			if(price[c]<price[c+1]) {
				price[c+1]=price[c];
			}
			c++;
		}
		System.out.println(result);
		
	}
}
