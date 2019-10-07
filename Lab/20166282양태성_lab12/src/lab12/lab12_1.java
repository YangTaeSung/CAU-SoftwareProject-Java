package lab12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class lab12_1 extends JFrame {

	private JCheckBox buttonInabled = new JCheckBox("버튼 비활성화");
	private JCheckBox visibleFalse = new JCheckBox("버튼 감추기");
	private JButton button = new JButton("test button"); 
	
	public lab12_1() {
		setTitle("CheckBoxPractice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(buttonInabled);
		c.add(visibleFalse);
		c.add(button);
		
		MyItemListener listener = new MyItemListener();
		MyItemListener2 listener2 = new MyItemListener2();
		buttonInabled.addItemListener(listener);
		visibleFalse.addItemListener(listener2);
		
		setSize(300,150);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getStateChange() == ItemEvent.SELECTED) {
				button.setEnabled(false);
			}
			else
				button.setEnabled(true);
		}
	}
	
	class MyItemListener2 implements ItemListener{
		
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getStateChange() == ItemEvent.SELECTED) {
				button.setVisible(false);
			}
			else
				button.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new lab12_1();

	}

}
