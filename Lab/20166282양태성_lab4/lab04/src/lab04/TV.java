package lab04;

public class TV {
	
	String name = "";
	int years = 0;
	int inches = 0;
	
	public TV(String name, int years, int inches) {
		this.name = name;
		this.years = years;
		this.inches = inches;
	}
	
	public TV(int years, int inches) {
		this.years = years;
		this.inches = inches;
	}
	
	public TV(int inches) {
		this.inches = inches;
	}
	
	public void show() {
		
		if(name == "" && years == 0)
			System.out.println(inches + "��ġ TV");
		
		else if (name == "")
			System.out.println(years + "�� " + inches + "��ġ TV");
		
		else
		System.out.println(name + "���� ���� " + years + "�� " + inches + "��ġ TV");
	}
	
	public static void main(String [] args) {
		TV myTV = new TV("LG", 2017, 45); // LG���� ���� 2017�� 45��ġ TV
		myTV.show();
		TV myTV1 = new TV(2018, 52); // 2018�� 52��ġ TV
		myTV1.show();
		TV myTV2 = new TV(65); // 65��ġ TV
		myTV2.show();
	}	

}
