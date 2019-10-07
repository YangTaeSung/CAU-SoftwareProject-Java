/*****************************************
2019/05/30						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report4_1		  
										  
사용자로부터 파일명을 입력받고, 입력 파일에 들어 있는 텍스트의
문자 수, 단어 수, 문장 수를 count하여 출력파일에 저장
******************************************/


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class report4_1 {

	static int n = 0; //문자 수
	static int wor = 0; //단어 수
	static int sen = 0; //문장 수
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	      
		FileReader fr = null;	//파일리더 선언
		FileWriter fw = null;	//파일라이터 선언
		
	    try {
	    	
	    	System.out.println("입력파일명 : ");
		    String inputFileName = scanner.next();
		    System.out.println("출력파일명 : ");
		    String outputFileName = scanner.next();
	    	
	    	fr = new FileReader(inputFileName);	//파일과 입력 문자스트림 객체 연결 
		    fw  = new FileWriter(outputFileName); //파일과 출력 문자스트림 객체 연결
		      
			int c;
		    
	    	while((c = fr.read()) != -1) {	//파일 끝까지 한 바이트씩 c에 읽어 들이기
	    		
	    		if((char)(c) == ' ')
	    		{
	    			wor++;		//파일 내의 단어가 ' '일 경우 단어 수 증가
	    		}
	    		else
	    			n++;		//파일 내의 ' '을 제외한 문자는 모두 문자 수로 카운트
	    		
	    		if((char)(c) == '.' || (char)(c) == '?' || (char)(c) == '!')
	    		{
	    			sen++;		//파일 내의 단어가 '.', '?', '!'일 경우 문장 수 증가
	    		}
	    
	    	}
	    	
	    	System.out.println("\n");
	    	System.out.println("input.txt의 문자, 단어, 문장 수가 count되어 output.txt에 출력됩니다.");
	    	
	    	//파일에 write하기 위해 int형으로 count되었던 변수들을 String형으로 변경
	    	String sn = String.valueOf(n);
	    	String swor = String.valueOf(wor + 1); //마지막 단어 출력을 위해 +1
	    	String ssen = String.valueOf(sen);
	    	
	    	fw.write("*************input.txt의 문자, 단어, 문장 수*************");
	    	//String단위로 출력파일에 write
	    	fw.write("\r\n");
	    	fw.write("문자 수  = ");
	    	fw.write(sn);		//문자 수 count 저장
	    	fw.write("\r\n");
	    	fw.write("단어 수  = ");
	    	fw.write(swor);		//단어 수 count 저장
	    	fw.write("\r\n");
	    	fw.write("문장 수  = ");
	    	fw.write(ssen);		//문장 수 count 저장
	    	
	    	fr.close();
	    	fw.close();
	    }
	    
	    catch (IOException e) {
	    	System.out.println("오류");
	    }
	}    
}