/*
----------------------------------------------------------------------
��ǻ�Ͱ��а� 4�г� 20166282 ���¼�

����Ʈ����������Ʈ Report1.1

"WWW" ��� ���α׷�

(2019.03.20)
----------------------------------------------------------------------
*/
package report1;

public class report1_1 {

	public static void main(String[] args) {
		
		char w = 'w';  	//����� ����� ǥ���� ����
		int i;	//������ ���� ����
		int j;	//������ ���� ����2
		
		
		for(i = 0; i<5; i++ ) {		//���� �����ϱ� ���� ����
			System.out.print(w);	//1��1���� ù��° ����
			
			
			if(i == 0) {		//ù��° ���� ǥ��
				System.out.print("             " + w);
				System.out.print(" " + w + "             " + w);
				System.out.println(" " + w + "             " + w);
			}
			
			else if(i == 1)			//�ι�° ���� ǥ��
			{
				System.out.print("     " + w + "     " + w);
				System.out.print("   " + w + "     " + w + "     " + w);
				System.out.println("   " + w + "     " + w + "     " + w);
			}
			
			else if(i == 2) 		//������ ���� ǥ��
			{
				System.out.print("   " + w + " " + w + "   " + w);
				System.out.print("     " + w + "   " + w + " " + w + "   " + w);
				System.out.println("     " + w + "   " + w + " " + w + "   " + w);
			}
			
			else if(i == 3) 		//�׹�° ���� ǥ��
			{
				System.out.print(" " + w + "  " + " " + w + " " + w);
				System.out.print("       " + w + " " + w + "  " + " " + w + " " + w);
				System.out.println("       " + w + " " + w + "  " + " " + w + " " + w);
			}
			
			else 		//�ټ���° ���� ǥ��
			{
				System.out.print("     " + w);
				System.out.print("         " + w + "     " + w);
				System.out.println("         " + w + "     " + w);
				
			}
			
			
			
			for(j = 0; j < i+1; j++) {			//�� ���� ���� ǥ��
				System.out.print(" ");
					
			}
		}
	}
}
