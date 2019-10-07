import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DrawPolygonWithMouse extends JFrame {
	public DrawPolygonWithMouse(){
		super("���콺�� ��ٰ��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private Vector<Integer> xv = new Vector<Integer>();
		private Vector<Integer> yv = new Vector<Integer>();

		public MyPanel() {
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					xv.add(e.getX());
					yv.add(e.getY());
					repaint();
				}
			});
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			
			// drawPolygon()�� ȣ���ϱ� ���� �ٰ��� ������ �迭 �����
			// �迭 ���� Ȯ��
			int xs [] = new int [xv.size()];
			int ys [] = new int [yv.size()];
			
			// �迭�� �� ä���
			for(int i=0; i<xv.size(); i++) {
				xs[i] = xv.get(i);
				ys[i] = yv.get(i);
			}
			
			// �ٰ��� �׸���
			g.drawPolygon(xs,  ys,  xs.length);
		}
	}
	
	static public void main(String[] args) {
		new DrawPolygonWithMouse();
	}
}
