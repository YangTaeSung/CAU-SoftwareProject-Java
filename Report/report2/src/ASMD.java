/*****************************************
2019/04/12						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report2-2		  
										  
더하기, 빼기, 곱하기, 나누기를 수행하는 클래스 생성
1. default 패키지에 구현
******************************************/


class Add
{
	int a, b;	// int 타입의 a, b 필드
	
	void setValue(int a, int b) {	// 피연산자 값을 객체 내에 저장
		this.a = a; 
		this.b = b;
	}
	
	int calculate()	
	{
		return a + b;	// 두 수의 더하기 리턴
	}
}


class Sub 
{
	int a, b;	// int 타입의 a, b 필드
	
	void setValue(int a, int b) {	// 피연산자 값을 객체 내에 저장
		this.a = a; 
		this.b = b;
	}
	
	int calculate()
	{
		return a - b;	// 두 수의 빼기 리턴
	}
}


class Mul 
{
	int a, b;	// int 타입의 a, b 필드
	
	void setValue(int a, int b) {	// 피연산자 값을 객체 내에 저장
		this.a = a; 
		this.b = b;
	}
	
	int calculate()
	{
		return a * b;	// 두 수의 곱하기 리턴
	}
}


class Div
{
	int a, b;	// int 타입의 a, b 필드
	
	void setValue(int a, int b) {	// 피연산자 값을 객체 내에 저장
		this.a = a; 
		this.b = b;
	}
	
	int calculate()
	{
		return a / b;	// 두 수의 나누기 리턴
	}
}