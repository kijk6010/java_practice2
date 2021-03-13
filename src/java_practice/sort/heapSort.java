package java_practice.sort;
//출처(코드 참고) : https://hmkim829.tistory.com/9
public class heapSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,1,8,4,2,1,10,5,6,11,3,7,10};
		//최대heap 만들기
		for(int k=arr.length/2-1;k>-1;k--) {
			heapify(k,arr.length,arr);
		} 
		for(int k=arr.length-1;k>-1;k--) {
			//최대 값을 가진 루트노드와 끝값을 변경하며 오름차순 정렬
			swap(0,k,arr);
			heapify(0,k,arr);
		}
		//출력
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void heapify(int parent,int size,int[] arr) {
		int pNode = parent;
		int lNode=2*pNode+1;
		int rNode=2*pNode+2;
		//size> --> 인덱스 범위 내인지 확인
		if(size>lNode&&arr[lNode]>arr[parent]) {
			parent=lNode;
		}
		if(size>rNode&&arr[rNode]>arr[parent]) {
			parent=rNode;
		}
		//parent에 저장된 값은 자식노드 중 큰 값이 있다면 큰 값의 인덱스 값이 남아있을 것
		//초기 설정한 부모노드의 인덱스와 다르면 교환
		if(parent!=pNode) {
			swap(parent, pNode, arr);
			//노드와 자리를 바꾸면 최대힙 기준에 맞지 않을 수 있어 바뀌 자식노드 아래 최대힙으로 맞춰줌
			heapify(parent,size,arr);
		}
	}
	//배열 값 변경
	public static void swap(int a,int b, int[] arr) {
		int tmp;
		tmp=arr[a];
		arr[a]=arr[b];
		arr[b]=tmp;
	}

}
