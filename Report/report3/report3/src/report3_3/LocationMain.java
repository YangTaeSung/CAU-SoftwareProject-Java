/*****************************************
2019/05/14						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report3_3  
										  
����ڷκ��� �Է� �޾� 4���� ���ø� 
HashMap<����,�浵,����>�� �ۼ��ϰ� ����ϴ� ���α׷�
******************************************/

package report3_3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class LocationMain {

	public static void main(String[] args) {
		
		HashMap <String, Location> loc = new HashMap <String, Location>();	//�ؽ��� ����
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		
		for(int i = 0; i < 4; i++) {	//4�� �ݺ�
			String city = scanner.next();
			int k = scanner.nextInt();
			int w = scanner.nextInt();
		
			Location location = new Location(k,w);
			//�Է¹��� ������ �浵�� �Ű������� �Ͽ� Location ��ü ����
		
			loc.put(city, location);	//HashMap�� ����
		}
		
		System.out.println("�ؽøʿ� �ִ� ��� ���ø� ����մϴ�.");
		
		Set<String> keys = loc.keySet();	//HashMap�� ��� key���� ��� Set<String>
		Iterator<String> it = keys.iterator(); //�ݺ��� ���� Iterator ����
			
		while(it.hasNext()) {	//Ű���� �����ϴ� ���� �ݺ��Ͽ� ����, �浵, ������ ��� ���
			String cityName = it.next();
			Location kw = loc.get(cityName);
			System.out.println(cityName + ", " + kw.kw());
		}	
		
		while(true) {	//�����̸��� �Է¹޾� �׿� �´� �浵�� ������ Location��ü���� Ž�� 
			System.out.println("���ø� �˻��մϴ�.");
			System.out.print("���� �̸� >> ");
			String cityName = scanner.next();
			Location kw = loc.get(cityName);
			
			if(cityName.equals("����")) {		//'����' �Է½� ����
				System.out.println("�˻��� �����մϴ�");
				System.exit(0);
			}
			
			if(loc.containsKey(cityName))	//����ڰ� �Է��� ������ �̸��� �����Ѵٸ� ���
				System.out.println(cityName + " " + kw.kw());
			else							//�������� �ʴ´ٸ� ���ٴ� �޼��� ���
				System.out.println(cityName + " �����ϴ�.");	
			
		}
		
	}

}
