package swing_GUI;
// 마우스 버튼이 눌러진 순간 패널위에 이동하는 순간 드래그 순간은 파란색, 바깥으로 나가면 노란색으로 변경
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event"); 
	
	public MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyMouseListener listener = 
				new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener); 

		c.add(la);

		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener, 		
													MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed ("+e.getX()+", "+e.getY ()+")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased("+e.getX()+", "+e.getY()+")"); 		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}

		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}
	}

	public static void main(String [] args) {
		new MouseListenerAllEx();
	}
}