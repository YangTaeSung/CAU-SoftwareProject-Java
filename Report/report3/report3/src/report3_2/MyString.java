/*****************************************
2019/05/14						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report3_2	  
										  
MyStringExŬ������ ����� ���� MyStringŬ����
******************************************/

package report3_2;

public class MyString {	
	
	char charArray[];		//��ü ���� �� �Ű������� �޴� char�迭�� ���� ����
	
	
	public MyString(char[] charArray){		//��ü ���� �� char�迭�� �Ű������� �޴� ������
	
		this.charArray = new char[charArray.length];		
		//�Ű������� �޴� char�迭�� ������ŭ MyString�� �迭ũ�⸦ �����Ͽ� ����
		
		for(int i = 0; i < charArray.length; i++)	
		//�Ű������� ���� ���ڵ��� MyString�� �迭�� ����
			this.charArray[i]=charArray[i];
	}
	
	
	public static void println(MyString s) {	//charArray�� ���ڵ��� ����ϴ� �޼ҵ�
	
		System.out.println(s.charArray);	
	}
	
	
	public int length() {		//������ ������ �����ϴ� �޼ҵ�

		return charArray.length;
	}
	
	
	public boolean equals(MyString s){	//��ü�� ���ڵ��� ������ �Ǻ��ϴ� �޼ҵ�
		
		boolean a = true;
		
		if(this.charArray.length != s.charArray.length)	//������ ���̰� �ٸ��� false
			a = false;
		else {
			for(int i = 0; i < charArray.length;i++) {	//���ڵ��� �ٸ��� �ϳ��ϳ� ���Ͽ� �ٸ��� false
				if(this.charArray[i] != s.charArray[i]) {
					a = false;
				}
			}
		}
		
		return a;
	}
	
	
	public char charAt(int n) {	//������ ������ �ڸ��� ��ġ�� ���� ����
		
		return charArray[n];
	}

	
	public MyString toUppercase() {	//���ڵ��� �빮�ڷ� ����

		char[] tempArray= new char[charArray.length];	
		//��ü�� ����� �迭�� ���ڼ���ŭ�� ũ�⸦ ���� ���ο� �迭 ����
		
		for(int i = 0; i < charArray.length; i++) {	
			tempArray[i] = charArray[i];			
			if((int)tempArray[i] > 96)	//�ҹ������� �Ǻ� 
				tempArray[i] -= 32;		//�ҹ��ڸ� �빮�ڷ� ����
		}
		
		MyString temp = new MyString(tempArray); //�빮�ڷ� ������ �迭�� MyString ��ü�� ����
		return temp;
	}
	
	
	public MyString substring(int n1, int n2) {	//n1~n2�� ���� ����
		
		char tempArray[] = new char[n2 - n1 + 1]; //n1~n2�� ũ�⸸ŭ�� �迭 ����

		for(int i = n1; i <= n2; i++)
			tempArray[i - n1] = charArray[i];	//tempArray[0]���� ���� ����
		
		MyString temp = new MyString(tempArray); //������ ���ڵ��� �迭�� MyString ��ü�� ����
  	
		return temp;
	}
	
	
	public static MyString valueOf(int num) {	//���ڸ� �޾��� �� string���� ����
		
		char[] tempArray;
		int temp = num;
		int cnt = 1;
		
		while((temp / 10) != 0) {	//�� ���ڷ� �̷������ Ȯ�� �� ���� �� cnt�� ����
			cnt += 1;
			temp = temp/10;			
		}
		
		tempArray = new char[cnt];	//���ڼ� ��ŭ�� �迭 ����

		for(int i = tempArray.length - 1; i >= 0; i--) { //�迭�� ���κк��� 1�� �ڸ� �� ���� 
			tempArray[i] = (char)((num % 10) + 48);	//48�� ���Ͽ� ASCII�ڵ忡 �˸´� ���ڸ� ���ڷ� ����
			num = num / 10;	//1�� �ڸ��� ������ �Ŀ� 1�� �ڸ� �����ϰ� 10�� �ڸ�,100�� �ڸ� ������ ����
		}
		
		MyString numToStr = new MyString(tempArray); //�Էµ� �迭�� MyString ��ü�� ����
		
		return numToStr;
	}
	
	
	public static MyString valueOf(boolean a) {	//boolean���� �޾��� �� string���� ����
		
		char tempArray[] = new char[5]; //true or false�̱� ������ maximum 5����
		
		if(a == true) {		//�Ҹ��� ���� true�̸� �� ���ھ� �迭�� ����
			tempArray[0] = 't';
			tempArray[1] = 'r'; 
			tempArray[2] = 'u';
			tempArray[3] = 'e';
		}
		
		else if(a == false){	//�Ҹ��� ���� false�̸� �� ���ھ� �迭�� ����
			tempArray[0] = 'f';
			tempArray[1] = 'a'; 
			tempArray[2] = 'l';
			tempArray[3] = 's';
			tempArray[4] = 'e';
		}
		
		MyString temp = new MyString(tempArray); //����� �迭�� MyString ��ü�� ����
		
		return temp;
	}	
}

