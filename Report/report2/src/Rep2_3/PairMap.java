/*****************************************
2019/04/12						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report2-3			  
										  
PairMap을 상속받는 Dictionary 클래스를      
구현하고, 이를 활용하는 main() 메소드를 가진    
DictionaryApp도 작성				 
******************************************/


package Rep2_3;

abstract class PairMap {							//추상클래스 정의
	protected String keyArray []; // key들을 저장하는 배열
	protected String valueArray []; // value 들을 저장하는배열
	abstract String get(String key); // key 값으로 value를 검색
	abstract void put(String key, String value); // key와 value를 쌍으로 저장
	abstract String delete(String key); // key 값을 가진 아이템(value와 함께)을 삭제. 삭제된 value 값 리턴
	abstract int length(); // 현재 저장된 아이템의 개수 리턴
}
