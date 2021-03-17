package baekjoon;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
public class BJ1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int[] arr = Stream.of(N.split("")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		for(int i=arr.length-1;i>-1;i--) {
			System.out.print(arr[i]);
		}
	}

}
