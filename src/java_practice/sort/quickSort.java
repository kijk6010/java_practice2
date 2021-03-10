package java_practice.sort;

public class quickSort {
	public static void quickSort(int start, int end, int[] arr) {
		int pivot;
		if(start<end) {
			pivot = partition(start, end, arr);
			quickSort(start,pivot-1,arr);
			quickSort(pivot+1,end,arr);
		}
	}
	public static int partition(int start, int end, int[] arr) {
		int j=start-1;
		int k=start;
		int[] tmp = new int[arr.length];
		int tmp2=0;
		for(int i=start;i<end;i++) {
			if(arr[end]>arr[i]) {
				tmp2 = arr[++j];
				arr[j]=arr[i];
				arr[i]=tmp2;
				k++;
			}
			else {
				tmp2=arr[k];
				arr[k]=arr[i];
				arr[i]=tmp2;
				k++;
			}
		}
		tmp2=arr[j+1];
		arr[j+1]=arr[end];
		arr[end]=tmp2;
		
		return j+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1,4,10};
		quickSort(0,arr.length-1,arr);
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
