/*****************************************
2019/05/14						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report3_3  
										  
�浵�� ������ ���� LocationŬ����
******************************************/

package report3_3;

public class Location {

	int k;	//�浵
	int w;	//����
		
	public Location(int k, int w) {	//Location�Լ��� ������(�Ű����� (int, int)
		this.k = k;
		this.w = w;
	}
	
	
	public String kw() {	//(�浵, ����)�� ����
		String a = String.valueOf(k) + ", " + String.valueOf(w);
		return a;
	}
}


