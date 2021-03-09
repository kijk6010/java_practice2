package java_practice.sort;
import java.util.Scanner;

public class selectionSort {
	public static void selectionSort(int len, int[] arr) {
		int max, temp;
		for(int i=len-1;i>0;i--) {
			max=i;
			for(int j=i-1;j>-1;j--) {
				if(arr[max]<arr[j]) {
					max=j;					
				}
			}
			temp = arr[i];
			arr[i] = arr[max];
			arr[max]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		selectionSort(arr.length,arr);
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
