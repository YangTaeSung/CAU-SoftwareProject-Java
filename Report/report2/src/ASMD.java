/*****************************************
2019/04/12						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report2-2		  
										  
���ϱ�, ����, ���ϱ�, �����⸦ �����ϴ� Ŭ���� ����
1. default ��Ű���� ����
******************************************/


class Add
{
	int a, b;	// int Ÿ���� a, b �ʵ�
	
	void setValue(int a, int b) {	// �ǿ����� ���� ��ü ���� ����
		this.a = a; 
		this.b = b;
	}
	
	int calculate()	
	{
		return a + b;	// �� ���� ���ϱ� ����
	}
}


class Sub 
{
	int a, b;	// int Ÿ���� a, b �ʵ�
	
	void setValue(int a, int b) {	// �ǿ����� ���� ��ü ���� ����
		this.a = a; 
		this.b = b;
	}
	
	int calculate()
	{
		return a - b;	// �� ���� ���� ����
	}
}


class Mul 
{
	int a, b;	// int Ÿ���� a, b �ʵ�
	
	void setValue(int a, int b) {	// �ǿ����� ���� ��ü ���� ����
		this.a = a; 
		this.b = b;
	}
	
	int calculate()
	{
		return a * b;	// �� ���� ���ϱ� ����
	}
}


class Div
{
	int a, b;	// int Ÿ���� a, b �ʵ�
	
	void setValue(int a, int b) {	// �ǿ����� ���� ��ü ���� ����
		this.a = a; 
		this.b = b;
	}
	
	int calculate()
	{
		return a / b;	// �� ���� ������ ����
	}
}