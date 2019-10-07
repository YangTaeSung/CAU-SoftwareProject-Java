package lab08;

import java.util.Scanner;
import java.util.ArrayList;

public class lab08_3 {

	public static void main(String[] args) {
		
		double sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("6개의 학점을 빈칸으로 분리입력(A/B/C/D/F) >> ");
		
		for(int i = 0; i < 6; i++)
			al.add(scanner.next());
		
		for(int i = 0; i < 6; i++) {
			if(al.get(i).equals("A"))
				sum = sum + 4.0;
			else if(al.get(i).equals("B"))
				sum = sum + 3.0;
			else if(al.get(i).equals("C"))
				sum = sum + 2.0;
			else if(al.get(i).equals("D"))
				sum = sum + 1.0;
			else 
				sum = sum + 0.0;
		}
		
		System.out.println("학점 평균 = " + sum/6);
	}

}
