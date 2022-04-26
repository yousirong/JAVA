import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class MyClass implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("beep");
	}
}


public class LAB타이머이벤트처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener listener = new MyClass();
		Timer t = new Timer(1000, listener);
		t.start();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}

}
