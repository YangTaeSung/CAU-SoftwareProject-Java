package lab08;

import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

public class lab08_4 {

	public static void main(String[] args) {
		
		int n = 0;
	
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		Iterator<Integer> it = v.iterator();
		
		
		while(true) {
			System.out.println("������ �Է� (0 �Է½� ����) >> ");
			v.add(scanner.nextInt());
			
			int sum = 0;
			
			for(int i=0; i<v.size(); i++) {
				n = v.get(i);
				if(n == 0)
					break;
				System.out.print(n + " ");
				sum = sum + n;
			}		
			if(n == 0)
				break;
			
			System.out.println("������� = " + sum/v.size());
		}
	}

}
