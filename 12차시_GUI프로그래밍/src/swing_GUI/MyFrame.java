package swing_GUI;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 ���� ������ �����");
		setSize(300,300); // ������ ũ�� 300x300
		setVisible(true);   // ������ ���
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
// Ÿ��Ʋ �ޱ�
// public MyFrame(){ // ������
//	super("Ÿ��Ʋ���ڿ�"); // Jframe�� ������ ȣ���Ͽ� Ÿ��Ʋ �ޱ�
//  setTitle("Ÿ��Ʋ���ڿ�"); // �޼ҵ带 ȣ���Ͽ� Ÿ��Ʋ �ޱ�
// }


