package lab03;
import java.util.Scanner;
public class lab03_2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int i = 0;
		
		System.out.println("금액을 입력하세요. ");
		int income = scanner.nextInt();
		
		i = income / 50000;
		if(i != 0) {
		income = income % 50000;
		System.out.println("50000원권 " + i + "개");
		}
		
		i = income / 10000;
		if(i != 0) {
		income = income % 10000;
		System.out.println("10000원권 " + i + "개");
		}
		
		i = income / 1000;
		if(i != 0) {
		income = income % 1000;
		System.out.println("1000원권 " + i + "개");
		}
		
		i = income / 500;
		if(i != 0) {
		income = income % 500;
		System.out.println("500원 동전 " + i + "개");
		}
		
		i = income / 100;
		if(i != 0) {
		income = income % 100;
		System.out.println("100원 동전 " + i + "개");
		}
		
		i = income / 50;
		if(i != 0) {
		income = income % 50;
		System.out.println("50원 동전 " + i + "개");
		}
		
		i = income / 10;
		if(i != 0) {
		income = income % 10;
		System.out.println("10원 동전 " + i + "개");
		}
		
		System.out.println("1원 동전 " + income + "개");
	}

}
