/*****************************************
2019/04/12						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report2-2		  
										  
더하기, 빼기, 곱하기, 나누기를 수행하는 클래스 생성
2. pkg1에 Calc클래스, pkg2에 Add,Sub,Mul,Div클래스  구현
******************************************/


package pkg1;		//pkg1에서 구현된 Calc클래스

import java.util.Scanner;

import pkg2.Add2;	//다른 패키지에 있는 클래스를 사용하기 위해 import
import pkg2.Mul2;
import pkg2.Sub2;
import pkg2.Div2;

public class Calc {

	public static void main(String[] args) {
	
		int num1;		//피연산자1
		String op;		//연산자
		int num2;		//피연산자2
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
	
		num1 = scanner.nextInt();		//피연산자1 입력
		op = scanner.next();			//연산자 입력
		num2 = scanner.nextInt();		//피연산자2 입력

		switch(op)		//연산자의 종류에 따라 알맞는 객체를 생성하고 연산한다.
		{				
			case "+":
				Add2 add = new Add2();
				add.setValue(num1, num2);	//값을 전달
				System.out.println(add.calculate());	//계산결과 출력
				break;
				
			case "-":
				Sub2 sub = new Sub2();
				sub.setValue(num1, num2);
				System.out.println(sub.calculate());
				break;
				
			case "*":
				Mul2 mul = new Mul2();
				mul.setValue(num1, num2);
				System.out.println(mul.calculate());
				break;
			
			case "/":
				Div2 div = new Div2();
				div.setValue(num1, num2);
				System.out.println(div.calculate());
				break;
				
		}
		
		scanner.close();
	}
}