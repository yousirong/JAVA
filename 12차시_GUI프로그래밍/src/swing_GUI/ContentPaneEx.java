package swing_GUI;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane(); //ÄÁÅÙÆ®ÆÒ ¾Ë¾Æ³»±â
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JButton("OK"));  // ÄÁÅÙÆ®ÆÒ¿¡ ¹öÆ° ºÎÂø
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
