package datatype;
//해당 데이터가 메모리에 어떻게 저장되고, 프로그램에서 어떻게 처리되어야 하는지 명시적으로 알려주는 것
//Primitive type(기본형)과 Reference type(참조형)이 있음.
public class datatype {
	//기본형 타입
	//1.논리형
	boolean boo = true; //1byte, 기본값:false
	//2.정수형
	byte by; //1byte, 기본값:0, 범위:-128~127
	short sh; //2byte, 기본값:0, 범위:	-32,768 ~ 32,767
	int i; //(기본)4byte, 기본값:0, 범위:-2,147,483,648 ~ 2,147,483,647
	long l; //8byte, 기본값:0L, 범위:-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
	//3.실수형
	float fl; //4byte, 기본값:0.0F, 범위: (3.4 X 10^-38) ~ (3.4 X 10^38) 의 근사값
	double dou; //(기본)8byte, 기본값:0.0, 범위:(1.7 X 10-308) ~ (1.7 X 10308) 의 근사값
	//4.문자형
	char c; //1byte, 기본값:\u0000, 범위:0~65,535
	
	//참조형 타입 - 기본값 : NULL, 4byte
	//1.배열(Array)
	int[] arr = new int[3];
	//2.열거(Enumeration)
	//기본타입을 class 형식으로 기본형 자료형을 감싼 형태.
	//3.클래스(Class)
	String str = "test";
	//classEx test = new classEx();
	
	//4.인터페이스(Interface)
	interface test<T>{
		void test(T value);
	}
	
}

//개념 정리
/*
 * 기본형 타입(Primitive type)
 * 1. 기본값이 있기 때문에 Null이 존재하지 않는다. 만약 기본형 타입에 Null을 넣고 싶다면 Wrapper클래스 사용
 * 2. 실제 값을 저장하는 공간으로 스택(Stack) 메모리에 저장된다
 * 3. 만약 컴파일 시점에 담을 수 있는 크기를 벗어나면 에러를 발생시키는 컴파일에러가 발생, 주로 문법상의 에러가 많다.
 * 
 * 참조형 타입(Reference type)
 * 1. 기본형 타입을 제외한 타입들이 모두 참조형 타입
 * 2. 빈 객체를 의미하는 Null이 존재
 * 3. 값이 저장되어 있는 곳의 주소값을 저장하는 공간으로 힙(Heap)메모리에 저장된다
 * 4. 문법상으로는 에러가 없지만 실행시켰을 때 에러가 나는 런타임 에러가 발생, 객체나 배열을 Null 값으로 받으면 NullPointException이 발생하므로 변수값을 넣어야함
 */
