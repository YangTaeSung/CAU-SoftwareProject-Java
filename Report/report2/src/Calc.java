/*****************************************
2019/04/12						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report2-2		  
										  
���ϱ�, ����, ���ϱ�, �����⸦ �����ϴ� Ŭ���� ����
1. default ��Ű���� ����
******************************************/


import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
	
		int num1;		//�ǿ�����1
		String op;		//������
		int num2;		//�ǿ�����2
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
	
		num1 = scanner.nextInt();	//�ǿ�����1 �Է�
		op = scanner.next();		//������ �Է�
		num2 = scanner.nextInt();	//�ǿ�����2 �Է�

		switch(op)	//�������� ������ ���� �˸´� ��ü�� �����ϰ� �����Ѵ�.
		{
			case "+":
				Add add = new Add();
				add.setValue(num1, num2);	//���� ����
				System.out.println(add.calculate());	//����� ���
				break;
				
			case "-":
				Sub sub = new Sub();
				sub.setValue(num1, num2);
				System.out.println(sub.calculate());
				break;
				
			case "*":
				Mul mul = new Mul();
				mul.setValue(num1, num2);
				System.out.println(mul.calculate());
				break;
			
			case "/":
				Div div = new Div();
				div.setValue(num1, num2);
				System.out.println(div.calculate());
				break;
				
		}
		
		scanner.close();	//��ĳ�� ��� ����
	}
}