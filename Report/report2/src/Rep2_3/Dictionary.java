/*****************************************
2019/04/12						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report2-3			  
										  
PairMap을 상속받는 Dictionary 클래스를      
구현하고, 이를 활용하는 main() 메소드를 가진    
DictionaryApp도 작성				 
******************************************/


package Rep2_3;

public class Dictionary extends PairMap {		//PairMap클래스를 상속하는 Dictionary 클래스	
	
	
	public Dictionary(int a)
	{
		keyArray = new String[a];		//입력받은 인자의 개수만큼 keyArray 생성
		valueArray = new String[a];		//입력받은 인자의 개수만큼 valueArray 생성
	}
	
	
	static int i = 0;		//배열의 현재 빈 공간의 첫번째를 표시하기 위한 static 변수
	
	
	String get(String key)	//key값의 string에 맞는 value를 출력해주는 함수
	{
		String val = "";
		
		for(int j = 0; j < keyArray.length; j++)  //key배열의 값에 일치하는 index 찾기 위한 반복문  
		{
			if(keyArray[j] == key)	
			{
				val = valueArray[j];	//key값에 일치하는 string을 찾으면 상응하는 value배열의 값을 val변수에 저장한다.
				return val;			//val 변수를 return한다.
			}
		}
		
		return null;	//반복문을 통해 일치하는 key값을 찾지 못했을 경우에는 null값을 return한다.
		
	}
	
	
	void put (String key, String value)	//입력받은 key값과 value를 각각의 array에 저장한다.
	{
		for(int j = 0; j < keyArray.length; j++)  //입력받은 key값이 이미 존재하는지 확인하는 반복문
		{
			if(keyArray[j] == key)	//입력받은 key값이 이미 배열에 존재한다면
			{	
				valueArray[j] = value;  //key값에 대응되는 value값을 입력받은 값으로 변경한다.
				return;	//수정을 완료하고 반복문을 벗어난다.
			}
		}
		
		keyArray[i] = key;	//위의 반복문에서 존재하는 key값이 없다면 새로 추가한다.
		valueArray[i] = value;  //위의 반복문에서 존재하는 value값이 없다면 새로 추가한다.
		i++;	//다음 배열의 추가를 위해 i를 증가시킨다.
	}
	
	
	String delete(String key)	//참조하는 key값과 그에 대응하는 value값을 삭제 
	{
		for(int j = 0; j < keyArray.length; j++)	//key값의 위치확인을 위한 반복문
		{
			if(keyArray[j] == key)
			{	
				keyArray[j] = null;		//key값의 위치를 찾으면 삭제한다.
				valueArray[j] = null;	//key값의 위치에 대응하는 value값도 삭제한다.
				break;
			}
		}	
		return "";	//void로 구현할 수 있는 함수였으나 주어진 양식에 맞추기 위해 return값을 넣음 
	}
	
	
	int length()
	{
		int num = 0;
		
		for(int j = 0; j < keyArray.length; j++)	//num변수를 선언하고 반복문을 통하여 key값의 개수를 num값에 대입한다.
				num += 1;
		
		return num;
	}
}
