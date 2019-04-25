import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		setTitle("텍스트필드 ㅇ에쪠");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("dmfma"));
		c.add(new JTextField(20));
		c.add(new JLabel("gkrrk"));
		c.add(new JTextField("zjavbxj", 20));
		c.add(new JLabel("wnth"));
		c.add(new JTextField("tjdnftl..,20"));

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
