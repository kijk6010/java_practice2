package AccessModifier2;

import AccessModifier.test1;
public class test3 {
	test1 test; //public �ٸ� ��Ű������ ���� ����
	
	public test3() {
		test1 check = new test1();	
		
		check.b =1; //public �ٸ� ��Ű������ ���� ����
		/* check.c =1; */ //������� ���� protected ���ٺҰ�
		/* check.d =1; */ //default�� �ٸ� ��Ű�� ���ٺҰ�
	}
	
	protected String a;
	
	
}
