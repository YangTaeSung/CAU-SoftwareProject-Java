/*****************************************
2019/05/14						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report3_2	  
										  
MyStringEx클래스의 출력을 위한 MyString클래스
******************************************/

package report3_2;

public class MyString {	
	
	char charArray[];		//객체 생성 시 매개변수로 받는 char배열을 위한 선언
	
	
	public MyString(char[] charArray){		//객체 생성 시 char배열을 매개변수로 받는 생성자
	
		this.charArray = new char[charArray.length];		
		//매개변수로 받는 char배열의 개수만큼 MyString의 배열크기를 지정하여 생성
		
		for(int i = 0; i < charArray.length; i++)	
		//매개변수로 받은 문자들을 MyString의 배열에 저장
			this.charArray[i]=charArray[i];
	}
	
	
	public static void println(MyString s) {	//charArray의 문자들을 출력하는 메소드
	
		System.out.println(s.charArray);	
	}
	
	
	public int length() {		//문자의 개수를 리턴하는 메소드

		return charArray.length;
	}
	
	
	public boolean equals(MyString s){	//객체의 문자들이 같은지 판별하는 메소드
		
		boolean a = true;
		
		if(this.charArray.length != s.charArray.length)	//문자의 길이가 다르면 false
			a = false;
		else {
			for(int i = 0; i < charArray.length;i++) {	//문자들이 다른지 하나하나 비교하여 다르면 false
				if(this.charArray[i] != s.charArray[i]) {
					a = false;
				}
			}
		}
		
		return a;
	}
	
	
	public char charAt(int n) {	//지정한 숫자의 자리에 위치한 글자 리턴
		
		return charArray[n];
	}

	
	public MyString toUppercase() {	//문자들을 대문자로 변경

		char[] tempArray= new char[charArray.length];	
		//객체에 저장된 배열의 글자수만큼의 크기를 가진 새로운 배열 생성
		
		for(int i = 0; i < charArray.length; i++) {	
			tempArray[i] = charArray[i];			
			if((int)tempArray[i] > 96)	//소문자인지 판별 
				tempArray[i] -= 32;		//소문자면 대문자로 변경
		}
		
		MyString temp = new MyString(tempArray); //대문자로 변경한 배열을 MyString 객체로 생성
		return temp;
	}
	
	
	public MyString substring(int n1, int n2) {	//n1~n2의 글자 리턴
		
		char tempArray[] = new char[n2 - n1 + 1]; //n1~n2의 크기만큼의 배열 생성

		for(int i = n1; i <= n2; i++)
			tempArray[i - n1] = charArray[i];	//tempArray[0]부터 글자 저장
		
		MyString temp = new MyString(tempArray); //지정된 글자들의 배열을 MyString 객체로 생성
  	
		return temp;
	}
	
	
	public static MyString valueOf(int num) {	//숫자를 받았을 때 string으로 리턴
		
		char[] tempArray;
		int temp = num;
		int cnt = 1;
		
		while((temp / 10) != 0) {	//몇 글자로 이루어진지 확인 후 글자 수 cnt에 저장
			cnt += 1;
			temp = temp/10;			
		}
		
		tempArray = new char[cnt];	//글자수 만큼의 배열 생성

		for(int i = tempArray.length - 1; i >= 0; i--) { //배열의 끝부분부터 1의 자리 수 저장 
			tempArray[i] = (char)((num % 10) + 48);	//48을 더하여 ASCII코드에 알맞는 숫자를 문자로 저장
			num = num / 10;	//1의 자리를 저장한 후에 1의 자리 제거하고 10의 자리,100의 자리 저장해 나감
		}
		
		MyString numToStr = new MyString(tempArray); //입력된 배열을 MyString 객체로 생성
		
		return numToStr;
	}
	
	
	public static MyString valueOf(boolean a) {	//boolean값을 받았을 때 string으로 리턴
		
		char tempArray[] = new char[5]; //true or false이기 때문에 maximum 5글자
		
		if(a == true) {		//불리언 값이 true이면 한 문자씩 배열에 저장
			tempArray[0] = 't';
			tempArray[1] = 'r'; 
			tempArray[2] = 'u';
			tempArray[3] = 'e';
		}
		
		else if(a == false){	//불리언 값이 false이면 한 문자씩 배열에 저장
			tempArray[0] = 'f';
			tempArray[1] = 'a'; 
			tempArray[2] = 'l';
			tempArray[3] = 's';
			tempArray[4] = 'e';
		}
		
		MyString temp = new MyString(tempArray); //저장된 배열을 MyString 객체로 생성
		
		return temp;
	}	
}

