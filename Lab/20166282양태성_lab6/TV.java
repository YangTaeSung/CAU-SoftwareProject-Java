package lab04;

class ColorTV extends TV {
	
	private int pixel;
	
	public ColorTV(int inch, int pixel)
	{
		super(inch);
		this.pixel = pixel;
	}	
	
	public void printProperty()
	{
		System.out.println("나의 color TV는 " + getSize() + "인치 " + pixel + "컬러");
	}
}

class IPTV extends TV {
	
	String ip;
	int pixel;
	
	public IPTV(String ip, int inch, int pixel)
	{
		super(inch);
		this.ip = ip;
		this.pixel = pixel;
	}
	
	public void printProperty()
	{
		System.out.println("나의 IP TV는 " + ip + " 주소의 " + getSize() + "인치 " + pixel + "컬러");
	}
	
	
	
}

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
	
	public static void main(String [] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

		IPTV myTV2 = new IPTV("192.1.1.2", 48, 2048);
		myTV2.printProperty();

	}
	
}








