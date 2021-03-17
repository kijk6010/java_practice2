package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class BJ2108 {
	public static int freqValue(int n,int[] arr) {
		int[] index = new int[8001];
		int[] index2 = new int[8001];
		int[] result = new int[n];
		for(int i=0;i<n;i++) {
			index[arr[i]+4000]++;
		}
		index2=index.clone();
		Arrays.sort(index2);
		int j=0;
		for(int i=0;i<index.length;i++) {
			if(index[i]==index2[index2.length-1]) {
				result[j++]=i-4000;
			}
		}
		if(j==1) {
			return result[0];
		}else {
			return result[1];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int sum=0;
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		System.out.println(Math.round((double)sum/N));
		System.out.println(arr[N/2]);
		System.out.println(freqValue(N,arr));
		System.out.println(arr[N-1]-arr[0]);
	}

}
