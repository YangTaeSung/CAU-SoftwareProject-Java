package lab08;

import java.util.Vector;

public class lab08_1 {

	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<Integer>(); 
		
		
		for(int i = 0; i < 10; i++) {
			v.add((int) (Math.random()*100+1));
	
		}
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
			
		}
	}

}
