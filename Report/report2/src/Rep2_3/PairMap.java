/*****************************************
2019/04/12						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report2-3			  
										  
PairMap�� ��ӹ޴� Dictionary Ŭ������      
�����ϰ�, �̸� Ȱ���ϴ� main() �޼ҵ带 ����    
DictionaryApp�� �ۼ�				 
******************************************/


package Rep2_3;

abstract class PairMap {							//�߻�Ŭ���� ����
	protected String keyArray []; // key���� �����ϴ� �迭
	protected String valueArray []; // value ���� �����ϴ¹迭
	abstract String get(String key); // key ������ value�� �˻�
	abstract void put(String key, String value); // key�� value�� ������ ����
	abstract String delete(String key); // key ���� ���� ������(value�� �Բ�)�� ����. ������ value �� ����
	abstract int length(); // ���� ����� �������� ���� ����
}
