//�ʵ�� �޼ҵ� ���� ��ȣ�ϴ� ���Ȱ� ���õ� ���� ������ ����
package AccessModifier;
//���������� public>protected>default(friendly)>private
//public: ��� ���� ���, protected : ��Ӱ��谡 ���� �ٸ� ��Ű�� Ŭ���� ����
//default: �ٸ� ��Ű�� Ŭ������ ���� ����, private: ��� �ܺο� �ִ� Ŭ������ ���� ����
import AccessModifier2.test3;
public class test1 extends test3{ //protected: �ܺ���Ű������ ����� Ŭ������
				   // �ڽ� Ŭ������ ����ϸ� ȣ�Ⱑ��, �ݴ��� ��� ���� �߻�.
	
	public int b; //public �ʵ� ����
	protected int c; //protected �ʵ� ����
	int d; //default �ʵ� ����
	
	/*
	 * public test1(String a) {
	 * 
	 * } test1 a = new test1("protected test");
	 */ //protected�� ����ִ� Ŭ������ �θ��϶��� ����

}

//Ŭ���� ���� : public, protected, default, private
//������Ű�� ���ٰ��� : public, protected, default
//�ٸ� ��Ű�� ���ٺҰ� : protected(��� ������ ����), default, private
