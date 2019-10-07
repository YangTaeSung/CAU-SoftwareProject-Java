
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.print(">> ");
			String query = scanner.nextLine();
			
			if (query.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(query, " ");
			System.out.println("단어 개수는 " + st.countTokens());
			while (st.hasMoreTokens()) 
				System.out.println(st.nextToken());
		
		}
		
	}
}