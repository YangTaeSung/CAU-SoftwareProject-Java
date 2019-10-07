/*
----------------------------------------------------------------------
컴퓨터공학과 4학년 20166282 양태성

소프트웨어프로젝트 Report1.3

육십갑자로 무슨 해인지 출력하는 프로그램

(2019.03.20)
----------------------------------------------------------------------
*/
package report1;
import java.util.Scanner;	  //scanner사용을 위한 import문 선언
public class report1_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//연도 입력을 위한 scanner 생성
		
		// 10간과 12지를 각각의 배열에 저장
		String gan1[] = {"경", "신", "임", "계", "갑", "을", "병", "정", "무", "기", };
		String gan2[] = {"신", "유", "술", "해", "자", "축", "인", "묘", "진", "사", "오", "미", };
		
		System.out.print("년도를 입력하세요. >> ");		//연도 입력
		int years = scanner.nextInt();				//입력받은 연도를 years변수에 저장
		
		//결과 출력
		System.out.print(years + "년은 " + gan1[years % 10] + gan2[years % 12] + "년 입니다.");
		
	}
}
