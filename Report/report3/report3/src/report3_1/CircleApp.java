/*****************************************
2019/05/14						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report3_1		  
										  
�� ���� Circle ��ü�� �߽��� ������ 
���� ������ ����ϴ� ���α׷� 
******************************************/

package report3_1;

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5); // �߽� (2,3)�� ������ 5�� ��
		Circle b = new Circle(2,3,30); // �߽� (2,3)�� ������ 30�� ��
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		
		if(a.equals(b)) 
			System.out.println("���� ��");
		else 
			System.out.println("���� �ٸ� ��");
	}
}

class Circle {
	
	int x, y, radius;	//���� �߽ɰ� ������ 
	
	
	public Circle(int x, int y, int radius)	//���� �߽ɰ� �������� �Ű������� �޴� ������
	{
		this.x = x; 
		this.y = y;
		this.radius = radius;
	}
	
	
	public String toString() {		//��ü�� ������ ��Ʈ������ ����
		return "Circle(" + x + "," + y + ")" + " ������" + radius;
	}

	
	public boolean equals(Object obj) {		//�� ��ü�� �������� �Ǻ�
		Circle circle = (Circle)obj;
		if(x == circle.x && y == circle.y) return true;
		else return false;
	}
}