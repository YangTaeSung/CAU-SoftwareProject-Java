package lab04;
import java.util.Scanner; 

class Converter {
	double convert(double src) { return src/1.6; }
	String srcString() { return "km"; }
	String destString() { return "mile"; }
	double ratio; // ����
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "�� " + destString() + "�� �ٲߴϴ�.");
		System.out.print(srcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + destString() + "�Դϴ�");
		scanner.close();
	}

}


