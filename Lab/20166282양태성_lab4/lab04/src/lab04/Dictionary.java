package lab04;

public class Dictionary {
	
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love","baby","money","future","hope"};
	
	public static String kor2Eng(String word) { 
		if(word.equals(kor[0]))
			return eng[0];
		else if(word.equals(kor[1]))
			return eng[1];
		else if(word.equals(kor[2]))
			return eng[2];
		else if(word.equals(kor[3]))
			return eng[4];
		else if(word.equals(kor[4]))
			return eng[4];
		else
			return "������ ���� �ܾ��Դϴ�.";
	}

}
