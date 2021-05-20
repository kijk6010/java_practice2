package AccessModifier2;

import AccessModifier.test1;
public class test3 {
	test1 test; //public 다른 패키지에서 접근 가능
	
	public test3() {
		test1 check = new test1();	
		
		check.b =1; //public 다른 패키지에서 접근 가능
		/* check.c =1; */ //상속하지 않은 protected 접근불가
		/* check.d =1; */ //default는 다른 패키지 접근불가
	}
	
	protected String a;
	
	
}
