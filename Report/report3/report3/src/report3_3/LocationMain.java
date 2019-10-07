/*****************************************
2019/05/14						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report3_3  
										  
사용자로부터 입력 받아 4개의 도시를 
HashMap<도시,경도,위도>로 작성하고 출력하는 프로그램
******************************************/

package report3_3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class LocationMain {

	public static void main(String[] args) {
		
		HashMap <String, Location> loc = new HashMap <String, Location>();	//해쉬맵 생성
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		
		for(int i = 0; i < 4; i++) {	//4번 반복
			String city = scanner.next();
			int k = scanner.nextInt();
			int w = scanner.nextInt();
		
			Location location = new Location(k,w);
			//입력받은 위도와 경도를 매개변수로 하여 Location 객체 생성
		
			loc.put(city, location);	//HashMap에 저장
		}
		
		System.out.println("해시맵에 있는 모든 도시를 출력합니다.");
		
		Set<String> keys = loc.keySet();	//HashMap의 모든 key값을 담는 Set<String>
		Iterator<String> it = keys.iterator(); //반복을 위한 Iterator 생성
			
		while(it.hasNext()) {	//키값이 존재하는 동안 반복하여 도시, 경도, 위도를 모두 출력
			String cityName = it.next();
			Location kw = loc.get(cityName);
			System.out.println(cityName + ", " + kw.kw());
		}	
		
		while(true) {	//도시이름을 입력받아 그에 맞는 경도와 위도를 Location객체에서 탐색 
			System.out.println("도시를 검색합니다.");
			System.out.print("도시 이름 >> ");
			String cityName = scanner.next();
			Location kw = loc.get(cityName);
			
			if(cityName.equals("종료")) {		//'종료' 입력시 종료
				System.out.println("검색을 종료합니다");
				System.exit(0);
			}
			
			if(loc.containsKey(cityName))	//사용자가 입력한 도시의 이름이 존재한다면 출력
				System.out.println(cityName + " " + kw.kw());
			else							//존재하지 않는다면 없다는 메세지 출력
				System.out.println(cityName + " 없습니다.");	
			
		}
		
	}

}
