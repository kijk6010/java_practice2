package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class BJ_practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr= new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=1;i<N;i++) {
			arr[i]+=arr[i-1];
		}
		int result =0;
		for(int j:arr) {
			result+=j;
		}
		System.out.print(result);
	}
}
