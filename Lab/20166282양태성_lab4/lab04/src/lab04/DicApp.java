package lab04;
import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		
		String hope;
		String baby;
		String stop;
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Dictionary d = new Dictionary();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("�ѱ� �ܾ� >> ");
		hope = scanner.next();
		System.out.println(hope + "�� " + d.kor2Eng(hope));
	
		System.out.print("�ѱ� �ܾ� >> ");
		baby = scanner.next();
		System.out.println(baby + "�� " + d.kor2Eng(baby));
		
		System.out.print("�ѱ� �ܾ� >> ");
		stop = scanner.next();
		System.out.println(stop + "��  " + d.kor2Eng(stop));
	}

}
