/*****************************************
2019/04/12						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report2-3			  
										  
PairMap을 상속받는 Dictionary 클래스를      
구현하고, 이를 활용하는 main() 메소드를 가진    
DictionaryApp도 작성				 
******************************************/

package Rep2_3;

public class DictionaryApp {		//main함수가 실행되는 부분, 문제에 제시된 코드

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);				//10개의 배열원소를 갖는 Dictionary객체를 생성
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");		 						// 이재문의 값을 C++로 수정		
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");									//황기태의 key값과 value값을 삭제
		System.out.println("황기태의 값은 " + dic.get("황기태"));		
	}


}
