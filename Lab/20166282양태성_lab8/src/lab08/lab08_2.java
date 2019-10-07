package lab08;

import java.util.Iterator;
import java.util.Vector;

public class lab08_2 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i = 0; i < 10; i++)
			v.add((int) (Math.random()*100 + 1));
			
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext())
		{
			int n = it.next();
			System.out.println(n);
		}
	}

}
