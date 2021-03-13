package java_practice.sort;
//��ó(�ڵ� ����) : https://hmkim829.tistory.com/9
public class heapSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,1,8,4,2,1,10,5,6,11,3,7,10};
		//�ִ�heap �����
		for(int k=arr.length/2-1;k>-1;k--) {
			heapify(k,arr.length,arr);
		} 
		for(int k=arr.length-1;k>-1;k--) {
			//�ִ� ���� ���� ��Ʈ���� ������ �����ϸ� �������� ����
			swap(0,k,arr);
			heapify(0,k,arr);
		}
		//���
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void heapify(int parent,int size,int[] arr) {
		int pNode = parent;
		int lNode=2*pNode+1;
		int rNode=2*pNode+2;
		//size> --> �ε��� ���� ������ Ȯ��
		if(size>lNode&&arr[lNode]>arr[parent]) {
			parent=lNode;
		}
		if(size>rNode&&arr[rNode]>arr[parent]) {
			parent=rNode;
		}
		//parent�� ����� ���� �ڽĳ�� �� ū ���� �ִٸ� ū ���� �ε��� ���� �������� ��
		//�ʱ� ������ �θ����� �ε����� �ٸ��� ��ȯ
		if(parent!=pNode) {
			swap(parent, pNode, arr);
			//���� �ڸ��� �ٲٸ� �ִ��� ���ؿ� ���� ���� �� �־� �ٲ� �ڽĳ�� �Ʒ� �ִ������� ������
			heapify(parent,size,arr);
		}
	}
	//�迭 �� ����
	public static void swap(int a,int b, int[] arr) {
		int tmp;
		tmp=arr[a];
		arr[a]=arr[b];
		arr[b]=tmp;
	}

}
