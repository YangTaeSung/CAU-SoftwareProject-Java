package lab04;
import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		
		String hope;
		String baby;
		String stop;
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		Dictionary d = new Dictionary();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("한글 단어 >> ");
		hope = scanner.next();
		System.out.println(hope + "은 " + d.kor2Eng(hope));
	
		System.out.print("한글 단어 >> ");
		baby = scanner.next();
		System.out.println(baby + "는 " + d.kor2Eng(baby));
		
		System.out.print("한글 단어 >> ");
		stop = scanner.next();
		System.out.println(stop + "은  " + d.kor2Eng(stop));
	}

}
