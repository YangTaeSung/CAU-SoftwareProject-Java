package lab05;

public class lab05_1 {

	public static void main(String[] args) {
		
		int ave1;
		
		int []a = {1,2,3,4,5,6};
		double []b = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5}; 
		ave1 = average(a);
		System.out.println(ave1);
		
		dAverage aver = new dAverage();
		aver.average(b);
		
	}

	
	public static int average(int [] array) {
		int sum = 0;
		int ave = 0;
		for(int i = 0; i<5; i++)
		sum += array[i];
		ave = sum/5;
		return ave;
	}
	
}

	class dAverage {
		public double average(double [] array) {
			double sum = 0;
			double ave2 = 0;
			for(int i = 0; i<5; i++)
			sum += array[i];
			ave2 = sum/5;
			System.out.println(ave2);
			return ave2;
		}
	}


