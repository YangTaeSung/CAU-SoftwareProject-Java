/*****************************************
2019/04/12						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report2-3			  
										  
PairMap�� ��ӹ޴� Dictionary Ŭ������      
�����ϰ�, �̸� Ȱ���ϴ� main() �޼ҵ带 ����    
DictionaryApp�� �ۼ�				 
******************************************/

package Rep2_3;

public class DictionaryApp {		//main�Լ��� ����Ǵ� �κ�, ������ ���õ� �ڵ�

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);				//10���� �迭���Ҹ� ���� Dictionary��ü�� ����
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");		 						// ���繮�� ���� C++�� ����		
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");									//Ȳ������ key���� value���� ����
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));		
	}


}
