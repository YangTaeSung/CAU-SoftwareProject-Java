/*****************************************
2019/04/12						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report2-2		  
										  
���ϱ�, ����, ���ϱ�, �����⸦ �����ϴ� Ŭ���� ����
2. pkg1�� CalcŬ����, pkg2�� Add,Sub,Mul,DivŬ����  ����
******************************************/


package pkg1;		//pkg1���� ������ CalcŬ����

import java.util.Scanner;

import pkg2.Add2;	//�ٸ� ��Ű���� �ִ� Ŭ������ ����ϱ� ���� import
import pkg2.Mul2;
import pkg2.Sub2;
import pkg2.Div2;

public class Calc {

	public static void main(String[] args) {
	
		int num1;		//�ǿ�����1
		String op;		//������
		int num2;		//�ǿ�����2
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
	
		num1 = scanner.nextInt();		//�ǿ�����1 �Է�
		op = scanner.next();			//������ �Է�
		num2 = scanner.nextInt();		//�ǿ�����2 �Է�

		switch(op)		//�������� ������ ���� �˸´� ��ü�� �����ϰ� �����Ѵ�.
		{				
			case "+":
				Add2 add = new Add2();
				add.setValue(num1, num2);	//���� ����
				System.out.println(add.calculate());	//����� ���
				break;
				
			case "-":
				Sub2 sub = new Sub2();
				sub.setValue(num1, num2);
				System.out.println(sub.calculate());
				break;
				
			case "*":
				Mul2 mul = new Mul2();
				mul.setValue(num1, num2);
				System.out.println(mul.calculate());
				break;
			
			case "/":
				Div2 div = new Div2();
				div.setValue(num1, num2);
				System.out.println(div.calculate());
				break;
				
		}
		
		scanner.close();
	}
}