/*****************************************
2019/05/14						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report3_1		  
										  
두 개의 Circle 객체의 중심이 같으면 
같은 원임을 출력하는 프로그램 
******************************************/

package report3_1;

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5); // 중심 (2,3)에 반지름 5인 원
		Circle b = new Circle(2,3,30); // 중심 (2,3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		
		if(a.equals(b)) 
			System.out.println("같은 원");
		else 
			System.out.println("서로 다른 원");
	}
}

class Circle {
	
	int x, y, radius;	//원의 중심과 반지름 
	
	
	public Circle(int x, int y, int radius)	//원의 중심과 반지름을 매개변수로 받는 생성자
	{
		this.x = x; 
		this.y = y;
		this.radius = radius;
	}
	
	
	public String toString() {		//객체의 정보를 스트링으로 리턴
		return "Circle(" + x + "," + y + ")" + " 반지름" + radius;
	}

	
	public boolean equals(Object obj) {		//두 객체가 동일한지 판별
		Circle circle = (Circle)obj;
		if(x == circle.x && y == circle.y) return true;
		else return false;
	}
}