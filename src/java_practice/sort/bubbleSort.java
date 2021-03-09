package java_practice.sort;
import java.util.Scanner;

public class bubbleSort {
	public static void bubbleSort(int len, int[] arr) {
		int temp;
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr.length,arr);
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
