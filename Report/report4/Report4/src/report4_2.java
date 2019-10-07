/*****************************************
2019/05/30						  
20166282 ��ǻ�Ͱ��а� 4�г� ���¼�		  
����Ʈ����������Ʈ Report4_2		  
										  
���õ� ���� ������ �ۼ�
'*' ���� 10���� ������ ��ġ�� ���
******************************************/


import javax.swing.*;
import java.awt.*;


class NorthPanel extends JPanel {	//����� ��ư 3���� ������ ���� Ŭ����

	 public NorthPanel() {
		
		setLayout(new FlowLayout());	//FlowLayout���� ��ư��ġ�� �ڵ����� ��ġ
		//��ư 3�� �߰�
		add(new JButton("����"));			
		add(new JButton("�ݱ�"));			
		add(new JButton("������"));
	
	}
	
}


class CenterPanel extends JPanel {	//�߾��� �г� ������ ���� Ŭ����
	
	public CenterPanel() {
		
		setBackground(Color.WHITE);
		setLayout(null);		//����ؾ� �� '*'���ڵ��� ��ġ�� ���Ƿ� �����ϱ� ���� ���̾ƿ�����
		
		for(int i = 0; i < 10; i++) {	//'*'���ڵ��� ��ġ�� random�Լ��� ����Ͽ� ��������
			JLabel label = new JLabel("*");
			int x = (int) (Math.random() * 270) + 10;
			int y = (int) (Math.random() * 170);
			
			label.setLocation(x,y);		//���Ƿ� ������ ���� label�� ��ġ�� ����
			label.setSize(10,10);		//label�� ������ ����
			add(label);					//�гο� �� �߰�
		
		}
		
	}
	
}


class SouthPanel extends JPanel {	//�ϴ��� �г� ����
	
	public SouthPanel() {
		
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout());	//FlowLayout���� ������� ��ġ
		add(new JButton("Word Input"));	//��ư �߰�
		add(new JTextField(13));		//13������ �ؽ�Ʈ�ʵ� �߰� 
		
	}
	
}

class MyFrame extends JFrame {		//������ ������ ���� Ŭ����
	
	public MyFrame() {
		
		setTitle("���� ���� �г��� ���� ������");	//������ ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//�������� ������ ���α׷� ����
		
		Container contentPane = getContentPane();	//�����̳� ����
		JPanel n = new NorthPanel();		//n�гο� NorthPanel ����
		contentPane.add(n, BorderLayout.NORTH);	//BorderLayout���� ���ʿ� n �г��߰�
		JPanel c = new CenterPanel();		//c�гο� NorthPanel ����
		contentPane.add(c, BorderLayout.CENTER); //BorderLayout���� �߾ӿ� c �г��߰�
		JPanel s = new SouthPanel();		//s�гο� NorthPanel ����
		contentPane.add(s, BorderLayout.SOUTH);	 //BorderLayout���� ���ʿ� s �г��߰�
	
		setSize(300,300);
		setVisible(true);
		setLocationRelativeTo(null);	//�������� ȭ�� �߾ӿ� ��ġ
		
	}
	
}

public class report4_2 {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}
