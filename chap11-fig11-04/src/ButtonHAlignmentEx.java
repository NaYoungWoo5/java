import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class ButtonHAlignmentEx extends JFrame {
	public ButtonHAlignmentEx() {
		setTitle("버튼 정렬");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");// normalIcon용 이미지
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ButtonHAlignmentEx();
	}
} 