/*****************************************
2019/05/30						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report4_3		  
										  
"C"를 출력하는 JLabel을 클릭하면 랜덤위치에 Label 이동
******************************************/


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class report4_3 extends JFrame {		//Frame 생성
	
	JLabel labelC = new JLabel("C"); 		//"C"를 출력하는 Label

	public report4_3() {
		
		setTitle("클릭 연습 용 응용 프로그램");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container c = getContentPane();		//Container 생성
	    
	    setLayout(null);	//label의 위치를 임의로 지정
	    setSize(300, 300);
	    setVisible(true);
	    setLocationRelativeTo(null);
	    
	    c.add(labelC);		//컨테이너에 라벨 추가
	    labelC.setSize(20, 20);	
	    labelC.setLocation(100, 100);	//처음 위치 지정
	    labelC.addMouseListener(new MyMouseListener());	//마우스리스너 호출
	 
	}
	
	
	class MyMouseListener implements MouseListener {	//마우스리스너 호출 시 작동
	      
	    public void mousePressed(MouseEvent e) {	//마우스 클릭 시 작동
	    	
	        int x = (int)(Math.random()*230);
	        int y = (int)(Math.random()*200) + 20;
	        labelC.setLocation(x, y);	//프레임 내에서 랜덤한 위치에 label 위치
	        
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