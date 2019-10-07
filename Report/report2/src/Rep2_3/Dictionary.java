/*****************************************
2019/04/12						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report2-3			  
										  
PairMap�� ��ӹ޴� Dictionary Ŭ������      
�����ϰ�, �̸� Ȱ���ϴ� main() �޼ҵ带 ����    
DictionaryApp�� �ۼ�				 
******************************************/


package Rep2_3;

public class Dictionary extends PairMap {		//PairMapŬ������ ����ϴ� Dictionary Ŭ����	
	
	
	public Dictionary(int a)
	{
		keyArray = new String[a];		//�Է¹��� ������ ������ŭ keyArray ����
		valueArray = new String[a];		//�Է¹��� ������ ������ŭ valueArray ����
	}
	
	
	static int i = 0;		//�迭�� ���� �� ������ ù��°�� ǥ���ϱ� ���� static ����
	
	
	String get(String key)	//key���� string�� �´� value�� ������ִ� �Լ�
	{
		String val = "";
		
		for(int j = 0; j < keyArray.length; j++)  //key�迭�� ���� ��ġ�ϴ� index ã�� ���� �ݺ���  
		{
			if(keyArray[j] == key)	
			{
				val = valueArray[j];	//key���� ��ġ�ϴ� string�� ã���� �����ϴ� value�迭�� ���� val������ �����Ѵ�.
				return val;			//val ������ return�Ѵ�.
			}
		}
		
		return null;	//�ݺ����� ���� ��ġ�ϴ� key���� ã�� ������ ��쿡�� null���� return�Ѵ�.
		
	}
	
	
	void put (String key, String value)	//�Է¹��� key���� value�� ������ array�� �����Ѵ�.
	{
		for(int j = 0; j < keyArray.length; j++)  //�Է¹��� key���� �̹� �����ϴ��� Ȯ���ϴ� �ݺ���
		{
			if(keyArray[j] == key)	//�Է¹��� key���� �̹� �迭�� �����Ѵٸ�
			{	
				valueArray[j] = value;  //key���� �����Ǵ� value���� �Է¹��� ������ �����Ѵ�.
				return;	//������ �Ϸ��ϰ� �ݺ����� �����.
			}
		}
		
		keyArray[i] = key;	//���� �ݺ������� �����ϴ� key���� ���ٸ� ���� �߰��Ѵ�.
		valueArray[i] = value;  //���� �ݺ������� �����ϴ� value���� ���ٸ� ���� �߰��Ѵ�.
		i++;	//���� �迭�� �߰��� ���� i�� ������Ų��.
	}
	
	
	String delete(String key)	//�����ϴ� key���� �׿� �����ϴ� value���� ���� 
	{
		for(int j = 0; j < keyArray.length; j++)	//key���� ��ġȮ���� ���� �ݺ���
		{
			if(keyArray[j] == key)
			{	
				keyArray[j] = null;		//key���� ��ġ�� ã���� �����Ѵ�.
				valueArray[j] = null;	//key���� ��ġ�� �����ϴ� value���� �����Ѵ�.
				break;
			}
		}	
		return "";	//void�� ������ �� �ִ� �Լ������� �־��� ��Ŀ� ���߱� ���� return���� ���� 
	}
	
	
	int length()
	{
		int num = 0;
		
		for(int j = 0; j < keyArray.length; j++)	//num������ �����ϰ� �ݺ����� ���Ͽ� key���� ������ num���� �����Ѵ�.
				num += 1;
		
		return num;
	}
}
