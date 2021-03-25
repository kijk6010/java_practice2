package baekjoon;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Comparator;
public class BJ10814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];
		String[] s = new String[2];
		for(int i=0;i<N;i++) {
			s=br.readLine().split(" ");
			arr[i][0]=s[0];
			arr[i][1]=s[1];
		}
		Arrays.sort(arr,new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
			}
		});
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<N;i++) {
			sb.append(arr[i][0]+" "+arr[i][1]).append('\n');
		}
		System.out.print(sb);
	}

}
