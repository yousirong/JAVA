package swing_GUI;
// <F1> Ű�� �Է¹����� ����Ʈ���� ����� �ʷϻ�����, %Ű�� �Է¹����� ��������� ����
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	//public Frame contentPane;

	public KeyCodeEx() {
		setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.addKeyListener(new MyKeyListener());
		c.add(la);

		setSize(300,150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			la.setText(e.getKeyText(e.getKeyCode()));

			if(e.getKeyChar() == '%') 
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1) 
				contentPane.setBackground(Color.GREEN);
		}
	}
	public static void main(String [] args) {
		new KeyCodeEx();
	}
}