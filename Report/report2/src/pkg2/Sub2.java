/*****************************************
2019/04/12						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report2-2		  
										  
더하기, 빼기, 곱하기, 나누기를 수행하는 클래스 생성
2. pkg1에 Calc클래스, pkg2에 Add,Sub,Mul,Div클래스  구현
******************************************/


package pkg2;

public class Sub2		//pkg2에 빼기 클래스 생성
{
	int a, b;
	
	public void setValue(int a, int b) {
		this.a = a; 
		this.b = b;
	}
	
	public int calculate()
	{
		return a - b;
	}
}
