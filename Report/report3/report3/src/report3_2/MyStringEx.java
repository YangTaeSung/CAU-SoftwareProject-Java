/*****************************************
2019/05/14						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report3_1		  
										  
String 클래스와 유사한 나만의 문자열 클래스로써 
MyString 클래스를 구현, MyStringEx 클래스를 이용하여 실행 
******************************************/

package report3_2;

public class MyStringEx {

	   public static void main(String[] args) {
		MyString s = new MyString(new char[] {'a', 'B', 'c', 'D'});
		MyString s1 = new MyString(new char[] {'a', 'B', 'c', 'D'});
		MyString s2 = new MyString(new char[] {'a', 'b', 'c', 'd'});

		System.out.print("s = ");
		MyString.println(s);  // aBcD
		System.out.print("s1 = ");
		MyString.println(s1);  // aBcD
		System.out.print("s2 = ");
		MyString.println(s2);  // abcd
			    
		System.out.println("s.length = " + s.length());  
		System.out.println("s.equals(s1) = " + s.equals(s1)); // true
		System.out.println("s.equals(s2) = " + s.equals(s2)); // false
		System.out.println("s.charAt(1) = " + s.charAt(1));  // B
			    		   
		MyString s3 = s.toUppercase();
		System.out.print("s.toUppercase() = ");
		MyString.println(s3);                // ABCD
				
		MyString s4 = s.substring(1, 2);
		System.out.print("s.substring(1, 2) = ");
		MyString.println(s4);   // Bc
				
		System.out.print("MyString.valueOf(345) = ");
		MyString.println(MyString.valueOf(345));  // 345
					
		System.out.print("MyString.valueOf(true) = ");
		MyString.println(MyString.valueOf(true));   // true	
	   }
}
