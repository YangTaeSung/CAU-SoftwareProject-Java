/*
----------------------------------------------------------------------
컴퓨터공학과 4학년 20166282 양태성

소프트웨어프로젝트 Report1.2

소득 금액별 세부담(소득세, 지방소득세)를 계산하는 프로그램

(2019.03.20)
----------------------------------------------------------------------
*/
package report1;
import java.util.Scanner;		//scanner사용을 위한 import문 선언
public class report1_2 {

	public static void main(String[] args) {
		
		
		double incomeTax= 0;		//소득세
		double localTax;			//지방소득세
		int deduction;				//누진공제
		
		
		System.out.println("소득금액을 천원단위로 입력하세요.");		
		Scanner scanner = new Scanner(System.in);		//소득금액 입력을 위한 scanner 생성
		
		
		int income = scanner.nextInt();		//소득금액 입력
		
		
		if(income <= 12000)		//소득 12000천원 
		{
			deduction = 0;
			incomeTax = income * 0.06;
		}
			
		else if(income > 12000 && income <= 46000)		//소득 12000천원~46000천원
		{
			deduction = 1080;
			incomeTax = income * 0.15 - deduction;
		}
		
		else if(income > 46000 && income <= 88000)		//소득 46000천원~88000천원
		{
			deduction = 5220;
			incomeTax = income * 0.24 - deduction;
		}
		
		else if(income > 88000 && income <= 150000)		//소득 88000천원~150000천원
		{
			deduction = 14900;
			incomeTax = income * 0.35 - deduction;
		}
		
		else if(income > 150000 && income <= 300000)	//소득 150000천원~300000천원
		{
			deduction = 19400;
			incomeTax = income * 0.38 - deduction;
		}
		
		else if(income > 300000 && income <= 500000)	//소득 300000천원~500000천원
		{
			deduction = 25400;
			incomeTax = income * 0.40 - deduction;
		}
		
		else		//소득 500000천원 초과
		{
			deduction = 35400;
			incomeTax = income * 0.42 - deduction;
		}
		
		
		
		localTax = incomeTax * 0.1;		//지방세 계산(소득세의 0.1%)
		
		System.out.println(income + "의 소득세는 " + incomeTax + "천원이고, 지방세는 " + localTax + "천원입니다.");	//출력
		
		scanner.close();	//scanner사용종료
		
	}
}

