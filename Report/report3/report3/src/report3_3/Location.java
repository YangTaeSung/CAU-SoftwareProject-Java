/*****************************************
2019/05/14						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report3_3  
										  
경도와 위도를 위한 Location클래스
******************************************/

package report3_3;

public class Location {

	int k;	//경도
	int w;	//위도
		
	public Location(int k, int w) {	//Location함수의 생성자(매개변수 (int, int)
		this.k = k;
		this.w = w;
	}
	
	
	public String kw() {	//(경도, 위도)를 리턴
		String a = String.valueOf(k) + ", " + String.valueOf(w);
		return a;
	}
}


