/*****************************************
2019/04/12						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report2-1		  
										  
�簢���� ��Ÿ���� Rectangle Ŭ������ �ۼ��϶�.				 
******************************************/


package Rep2_1;

public class Rep2_1 {

	public static void main(String[] args) {
		Rectangle []r = new Rectangle[3];	// Rectangle ��ü �迭(ũ�� 3)�� ����
		
		r[0] = new Rectangle();				// ������ ������ ȣ���Ͽ� ��ü����
		r[1] = new Rectangle(3,4);			// ����2 ������ ȣ���Ͽ� ��ü����
		r[2] = new Rectangle(5);			// ����1 ������ ȣ���Ͽ� ��ü����
		
		for(int i = 0; i < r.length; i++ )
		{
			System.out.println("r[" + i + "]�� ������ �ѷ�");
			r[i].getArea();
			r[i].getPerimeter();
			System.out.println("\t");
		}
	}
}


class Rectangle
{
	double width;			//�簢���� ���ο� ���θ� ���� double �ڷ��� ���� width,height
	double height;
	String color = "white"; // �簢���� ������ ���� ���ڿ� ������ �ʵ� 
	
	
	public Rectangle() 	// ����Ʈ ���� �簢���� ���� ������ ������
	{
		this.width = 1;				// ������ �Լ����� this()���
		this.height = 1;
	}
	public Rectangle(double width, double height)	// �־��� ���ο� ������ �簢���� ���� ������
	{
		this.width = width;
		this.height = height;
	}
	public Rectangle(double line)	//�־��� �ϳ��� ���̸� ���ο� ���η� ���
	{
		this.width = line;
		this.height = line;
	}
	

	public void getArea()		//�簢���� ���� ���
	{
		System.out.println(width*height); 	
	}
	public void getPerimeter()
	{
		System.out.println((2*width + 2*height));	//�簢���� �ѷ� ���
	}
}
