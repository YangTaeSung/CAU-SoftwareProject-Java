/*****************************************
2019/05/30						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report4_1		  
										  
����ڷκ��� ���ϸ��� �Է¹ް�, �Է� ���Ͽ� ��� �ִ� �ؽ�Ʈ��
���� ��, �ܾ� ��, ���� ���� count�Ͽ� ������Ͽ� ����
******************************************/


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class report4_1 {

	static int n = 0; //���� ��
	static int wor = 0; //�ܾ� ��
	static int sen = 0; //���� ��
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	      
		FileReader fr = null;	//���ϸ��� ����
		FileWriter fw = null;	//���϶����� ����
		
	    try {
	    	
	    	System.out.println("�Է����ϸ� : ");
		    String inputFileName = scanner.next();
		    System.out.println("������ϸ� : ");
		    String outputFileName = scanner.next();
	    	
	    	fr = new FileReader(inputFileName);	//���ϰ� �Է� ���ڽ�Ʈ�� ��ü ���� 
		    fw  = new FileWriter(outputFileName); //���ϰ� ��� ���ڽ�Ʈ�� ��ü ����
		      
			int c;
		    
	    	while((c = fr.read()) != -1) {	//���� ������ �� ����Ʈ�� c�� �о� ���̱�
	    		
	    		if((char)(c) == ' ')
	    		{
	    			wor++;		//���� ���� �ܾ ' '�� ��� �ܾ� �� ����
	    		}
	    		else
	    			n++;		//���� ���� ' '�� ������ ���ڴ� ��� ���� ���� ī��Ʈ
	    		
	    		if((char)(c) == '.' || (char)(c) == '?' || (char)(c) == '!')
	    		{
	    			sen++;		//���� ���� �ܾ '.', '?', '!'�� ��� ���� �� ����
	    		}
	    
	    	}
	    	
	    	System.out.println("\n");
	    	System.out.println("input.txt�� ����, �ܾ�, ���� ���� count�Ǿ� output.txt�� ��µ˴ϴ�.");
	    	
	    	//���Ͽ� write�ϱ� ���� int������ count�Ǿ��� �������� String������ ����
	    	String sn = String.valueOf(n);
	    	String swor = String.valueOf(wor + 1); //������ �ܾ� ����� ���� +1
	    	String ssen = String.valueOf(sen);
	    	
	    	fw.write("*************input.txt�� ����, �ܾ�, ���� ��*************");
	    	//String������ ������Ͽ� write
	    	fw.write("\r\n");
	    	fw.write("���� ��  = ");
	    	fw.write(sn);		//���� �� count ����
	    	fw.write("\r\n");
	    	fw.write("�ܾ� ��  = ");
	    	fw.write(swor);		//�ܾ� �� count ����
	    	fw.write("\r\n");
	    	fw.write("���� ��  = ");
	    	fw.write(ssen);		//���� �� count ����
	    	
	    	fr.close();
	    	fw.close();
	    }
	    
	    catch (IOException e) {
	    	System.out.println("����");
	    }
	}    
}