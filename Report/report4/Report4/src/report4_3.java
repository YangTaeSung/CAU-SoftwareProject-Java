/*****************************************
2019/05/30						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report4_3		  
										  
"C"�� ����ϴ� JLabel�� Ŭ���ϸ� ������ġ�� Label �̵�
******************************************/


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class report4_3 extends JFrame {		//Frame ����
	
	JLabel labelC = new JLabel("C"); 		//"C"�� ����ϴ� Label

	public report4_3() {
		
		setTitle("Ŭ�� ���� �� ���� ���α׷�");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container c = getContentPane();		//Container ����
	    
	    setLayout(null);	//label�� ��ġ�� ���Ƿ� ����
	    setSize(300, 300);
	    setVisible(true);
	    setLocationRelativeTo(null);
	    
	    c.add(labelC);		//�����̳ʿ� �� �߰�
	    labelC.setSize(20, 20);	
	    labelC.setLocation(100, 100);	//ó�� ��ġ ����
	    labelC.addMouseListener(new MyMouseListener());	//���콺������ ȣ��
	 
	}
	
	
	class MyMouseListener implements MouseListener {	//���콺������ ȣ�� �� �۵�
	      
	    public void mousePressed(MouseEvent e) {	//���콺 Ŭ�� �� �۵�
	    	
	        int x = (int)(Math.random()*230);
	        int y = (int)(Math.random()*200) + 20;
	        labelC.setLocation(x, y);	//������ ������ ������ ��ġ�� label ��ġ
	        
	    }

	    public void mouseReleased(MouseEvent e) {}
	    public void mouseClicked(MouseEvent e) {}
	    public void mouseEntered(MouseEvent e) {}
	    public void mouseExited(MouseEvent e) {}
	
	}

	
	public static void main(String [] args) {
	
		new report4_3();
	
	}
	
}