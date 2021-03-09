package java_practice.sort;

public class insertionSort {
	public static void insertionSort(int len, int[] arr) {
		int temp;
		for(int i=1;i<len;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		insertionSort(arr.length,arr);
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
