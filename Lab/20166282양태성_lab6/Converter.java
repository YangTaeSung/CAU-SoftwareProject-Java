package lab04;
import java.util.Scanner; 

class Converter {
	double convert(double src) { return src/1.6; }
	String srcString() { return "km"; }
	String destString() { return "mile"; }
	double ratio; // 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "를 " + destString() + "로 바꿉니다.");
		System.out.print(srcString() + "를 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + destString() + "입니다");
		scanner.close();
	}

}


