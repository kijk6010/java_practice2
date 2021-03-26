package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class BJ_practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[][] arr = new int[N][2];
		for(int i=0;i<N;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		Arrays.sort(arr,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[1];
				}else {
					return o1[1]-o2[1];	
				}
			}
		});
		int end=0;
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(arr[i][0]>=end) {
				cnt++;
				end=arr[i][1];
			}
		}
		System.out.print(cnt);
	}
}
