package java_practice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countingSort {
	// น้มุ 10989น๘
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf_reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf_reader.readLine());
		int[] arr = new int[N];
		int[] cntArr = new int[10001];
		for(int i=0;i<N;i++) {
			cntArr[Integer.parseInt(bf_reader.readLine())]++;
		}
		bf_reader.close();
		StringBuilder sb= new StringBuilder();
		for(int i=1;i<10001;i++) {
			while(cntArr[i]>0) {
				sb.append(i).append('\n');
				cntArr[i]--;
			}
		}
		System.out.print(sb);
	}

}
