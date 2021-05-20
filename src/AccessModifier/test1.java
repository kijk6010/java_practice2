//필드와 메소드 등을 보호하는 보안과 관련된 접근 제한자 정리
package AccessModifier;
//접근제한자 public>protected>default(friendly)>private
//public: 모든 접근 허용, protected : 상속관계가 없는 다른 패키지 클래스 차단
//default: 다른 패키지 클래스를 전부 차단, private: 모든 외부에 있는 클래스의 접근 차단
import AccessModifier2.test3;
public class test1 extends test3{ //protected: 외부패키지에서 사용할 클래스를
				   // 자식 클래스로 상속하면 호출가능, 반대의 경우 오류 발생.
	
	public int b; //public 필드 생성
	protected int c; //protected 필드 생성
	int d; //default 필드 생성
	
	/*
	 * public test1(String a) {
	 * 
	 * } test1 a = new test1("protected test");
	 */ //protected가 들어있는 클래스가 부모일때만 가능

}

//클래스 내부 : public, protected, default, private
//동일패키지 접근가능 : public, protected, default
//다른 패키지 접근불가 : protected(상속 받으면 가능), default, private
