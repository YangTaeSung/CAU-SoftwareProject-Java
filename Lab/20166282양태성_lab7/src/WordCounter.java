
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.print(">> ");
			String query = scanner.nextLine();
			
			if (query.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(query, " ");
			System.out.println("�ܾ� ������ " + st.countTokens());
			while (st.hasMoreTokens()) 
				System.out.println(st.nextToken());
		
		}
		
	}
}