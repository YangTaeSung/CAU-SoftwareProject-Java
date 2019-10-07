/*
----------------------------------------------------------------------
컴퓨터공학과 4학년 20166282 양태성

소프트웨어프로젝트 Report1.1

"WWW" 출력 프로그램

(2019.03.20)
----------------------------------------------------------------------
*/
package report1;

public class report1_1 {

	public static void main(String[] args) {
		
		char w = 'w';  	//출력할 모양을 표현할 문자
		int i;	//루프를 위한 문자
		int j;	//루프를 위한 문자2
		
		
		for(i = 0; i<5; i++ ) {		//행을 구분하기 위한 루프
			System.out.print(w);	//1행1열의 첫번째 문자
			
			
			if(i == 0) {		//첫번째 줄의 표현
				System.out.print("             " + w);
				System.out.print(" " + w + "             " + w);
				System.out.println(" " + w + "             " + w);
			}
			
			else if(i == 1)			//두번째 줄의 표현
			{
				System.out.print("     " + w + "     " + w);
				System.out.print("   " + w + "     " + w + "     " + w);
				System.out.println("   " + w + "     " + w + "     " + w);
			}
			
			else if(i == 2) 		//세번재 줄의 표현
			{
				System.out.print("   " + w + " " + w + "   " + w);
				System.out.print("     " + w + "   " + w + " " + w + "   " + w);
				System.out.println("     " + w + "   " + w + " " + w + "   " + w);
			}
			
			else if(i == 3) 		//네번째 줄의 표현
			{
				System.out.print(" " + w + "  " + " " + w + " " + w);
				System.out.print("       " + w + " " + w + "  " + " " + w + " " + w);
				System.out.println("       " + w + " " + w + "  " + " " + w + " " + w);
			}
			
			else 		//다섯번째 줄의 표현
			{
				System.out.print("     " + w);
				System.out.print("         " + w + "     " + w);
				System.out.println("         " + w + "     " + w);
				
			}
			
			
			
			for(j = 0; j < i+1; j++) {			//각 행의 공백 표현
				System.out.print(" ");
					
			}
		}
	}
}
