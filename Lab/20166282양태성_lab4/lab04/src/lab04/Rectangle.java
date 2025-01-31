package lab04;

public class Rectangle {
	
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int a, int b, int c, int d) {
		x = a;
		y = b;
		width = c;
		height = d;
	}
	
	public int square() {
		return (width * height);
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")에서의 크기가 " + width + "*" + height + "인 사각형");
	}
	
	public boolean contains(Rectangle r) {
		if(r.x >= this.x && r.y >= this.y && r.x + r.width <= this.x + this.width 
				&& r.y + r.height <= this.y + this.height) //교수님이 선이 겹치는건 포함 안되는거로 정의하신 듯 나는 그냥 겹치는거까지 
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}

}
