package java_practice.sort;

public class mergeSort {
	public static void mergeSort(int start,int end, int[] arr) {
		int mid;
		if(start<end) {
			mid = (start+end)/2;
			mergeSort(start,mid,arr);
			mergeSort(mid+1,end,arr);
			merge(start,mid,end,arr);
		}
	}
	public static void merge(int start, int mid, int end, int[] arr) {
		int i = start;
		int k = start;
		int j = mid+1;
		int[] temp = new int[arr.length];
		while(i<=mid&&j<=end) {
			if(arr[i]<=arr[j]) {
				temp[k++]=arr[i++];
			}
			else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=end) {
			temp[k++]=arr[j++];
		}
		for(int l=start;l<end+1;l++) {
			arr[l]=temp[l];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1,4,10};
		mergeSort(0,arr.length-1,arr);
		for(int k:arr) {
			System.out.print(k+" ");
		}

	}

}
