/*
----------------------------------------------------------------------
��ǻ�Ͱ��а� 4�г� 20166282 ���¼�

����Ʈ����������Ʈ Report1.2

�ҵ� �ݾ׺� ���δ�(�ҵ漼, ����ҵ漼)�� ����ϴ� ���α׷�

(2019.03.20)
----------------------------------------------------------------------
*/
package report1;
import java.util.Scanner;		//scanner����� ���� import�� ����
public class report1_2 {

	public static void main(String[] args) {
		
		
		double incomeTax= 0;		//�ҵ漼
		double localTax;			//����ҵ漼
		int deduction;				//��������
		
		
		System.out.println("�ҵ�ݾ��� õ�������� �Է��ϼ���.");		
		Scanner scanner = new Scanner(System.in);		//�ҵ�ݾ� �Է��� ���� scanner ����
		
		
		int income = scanner.nextInt();		//�ҵ�ݾ� �Է�
		
		
		if(income <= 12000)		//�ҵ� 12000õ�� 
		{
			deduction = 0;
			incomeTax = income * 0.06;
		}
			
		else if(income > 12000 && income <= 46000)		//�ҵ� 12000õ��~46000õ��
		{
			deduction = 1080;
			incomeTax = income * 0.15 - deduction;
		}
		
		else if(income > 46000 && income <= 88000)		//�ҵ� 46000õ��~88000õ��
		{
			deduction = 5220;
			incomeTax = income * 0.24 - deduction;
		}
		
		else if(income > 88000 && income <= 150000)		//�ҵ� 88000õ��~150000õ��
		{
			deduction = 14900;
			incomeTax = income * 0.35 - deduction;
		}
		
		else if(income > 150000 && income <= 300000)	//�ҵ� 150000õ��~300000õ��
		{
			deduction = 19400;
			incomeTax = income * 0.38 - deduction;
		}
		
		else if(income > 300000 && income <= 500000)	//�ҵ� 300000õ��~500000õ��
		{
			deduction = 25400;
			incomeTax = income * 0.40 - deduction;
		}
		
		else		//�ҵ� 500000õ�� �ʰ�
		{
			deduction = 35400;
			incomeTax = income * 0.42 - deduction;
		}
		
		
		
		localTax = incomeTax * 0.1;		//���漼 ���(�ҵ漼�� 0.1%)
		
		System.out.println(income + "�� �ҵ漼�� " + incomeTax + "õ���̰�, ���漼�� " + localTax + "õ���Դϴ�.");	//���
		
		scanner.close();	//scanner�������
		
	}
}

