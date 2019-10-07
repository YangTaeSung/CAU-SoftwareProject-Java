/*****************************************
2019/05/30						  
20166282 컴퓨터공학과 4학년 양태성		  
소프트웨어프로젝트 Report4_2		  
										  
제시된 스윙 프레임 작성
'*' 문자 10개가 랜덤한 위치에 출력
******************************************/


import javax.swing.*;
import java.awt.*;


class NorthPanel extends JPanel {	//상단의 버튼 3개의 구현을 위한 클래스

	 public NorthPanel() {
		
		setLayout(new FlowLayout());	//FlowLayout으로 버튼위치를 자동으로 배치
		//버튼 3개 추가
		add(new JButton("열기"));			
		add(new JButton("닫기"));			
		add(new JButton("나가기"));
	
	}
	
}


class CenterPanel extends JPanel {	//중앙의 패널 구현을 위한 클래스
	
	public CenterPanel() {
		
		setBackground(Color.WHITE);
		setLayout(null);		//출력해야 할 '*'문자들의 위치를 임의로 지정하기 위한 레이아웃설정
		
		for(int i = 0; i < 10; i++) {	//'*'문자들의 위치를 random함수를 사용하여 임의지정
			JLabel label = new JLabel("*");
			int x = (int) (Math.random() * 270) + 10;
			int y = (int) (Math.random() * 170);
			
			label.setLocation(x,y);		//임의로 지정한 값에 label의 위치를 설정
			label.setSize(10,10);		//label의 사이즈 설정
			add(label);					//패널에 라벨 추가
		
		}
		
	}
	
}


class SouthPanel extends JPanel {	//하단의 패널 구현
	
	public SouthPanel() {
		
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout());	//FlowLayout으로 순서대로 배치
		add(new JButton("Word Input"));	//버튼 추가
		add(new JTextField(13));		//13길이의 텍스트필드 추가 
		
	}
	
}

class MyFrame extends JFrame {		//프레임 생성을 위한 클래스
	
	public MyFrame() {
		
		setTitle("여러 개의 패널을 가진 프레임");	//프레임 제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//프레임을 닫으면 프로그램 종료
		
		Container contentPane = getContentPane();	//컨테이너 생성
		JPanel n = new NorthPanel();		//n패널에 NorthPanel 생성
		contentPane.add(n, BorderLayout.NORTH);	//BorderLayout으로 북쪽에 n 패널추가
		JPanel c = new CenterPanel();		//c패널에 NorthPanel 생성
		contentPane.add(c, BorderLayout.CENTER); //BorderLayout으로 중앙에 c 패널추가
		JPanel s = new SouthPanel();		//s패널에 NorthPanel 생성
		contentPane.add(s, BorderLayout.SOUTH);	 //BorderLayout으로 남쪽에 s 패널추가
	
		setSize(300,300);
		setVisible(true);
		setLocationRelativeTo(null);	//프레임이 화면 중앙에 위치
		
	}
	
}

public class report4_2 {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}
