package lab04;

public class lab04_1 {
	
	public static int sum(int a,int b) {
		return (a + b);
	}

	public static double sum(double a,double b) {
		return (a + b);
	}

	public static double sum(double a,int b) {
		return (a + b);
	}
	
	public static void main(String[] args) {
		
		int a = sum(10 , 20);
		double b = sum(10.0 , 20.0);
		double c = sum(10.0 , 20);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

	
	