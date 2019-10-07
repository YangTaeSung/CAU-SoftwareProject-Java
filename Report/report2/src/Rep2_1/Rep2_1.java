/*****************************************
2019/04/12						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report2-1		  
										  
사각형을 나타내는 Rectangle 클래스를 작성하라.				 
******************************************/


package Rep2_1;

public class Rep2_1 {

	public static void main(String[] args) {
		Rectangle []r = new Rectangle[3];	// Rectangle 객체 배열(크기 3)을 선언
		
		r[0] = new Rectangle();				// 무인자 생성자 호출하여 객체생성
		r[1] = new Rectangle(3,4);			// 인자2 생성자 호출하여 객체생성
		r[2] = new Rectangle(5);			// 인자1 생성자 호출하여 객체생성
		
		for(int i = 0; i < r.length; i++ )
		{
			System.out.println("r[" + i + "]의 면적과 둘레");
			r[i].getArea();
			r[i].getPerimeter();
			System.out.println("\t");
		}
	}
}


class Rectangle
{
	double width;			//사각형의 가로와 세로를 위한 double 자료형 변수 width,height
	double height;
	String color = "white"; // 사각형의 색깔을 위한 문자열 데이터 필드 
	
	
	public Rectangle() 	// 디폴트 값의 사각형을 위한 무인자 생성자
	{
		this.width = 1;				// 생성자 함수에서 this()사용
		this.height = 1;
	}
	public Rectangle(double width, double height)	// 주어진 가로와 세로의 사각형을 위한 생성자
	{
		this.width = width;
		this.height = height;
	}
	public Rectangle(double line)	//주어진 하나의 길이를 가로와 세로로 사용
	{
		this.width = line;
		this.height = line;
	}
	

	public void getArea()		//사각형의 면적 출력
	{
		System.out.println(width*height); 	
	}
	public void getPerimeter()
	{
		System.out.println((2*width + 2*height));	//사각형의 둘레 출력
	}
}
