import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("fkeldhqjxms aksemfrl dPwp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon cherrIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectImageIcon = new ImageIcon("images/selectedCherry.jpg");

		ButtonGroup g = new ButtonGroup();

		JRadioButton apple = new JRadioButton("tkrh");
		JRadioButton pear = new JRadioButton("qo", true);
		JRadioButton cherry = new JRadioButton("cpfl", cherrIcon);

		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectImageIcon);

		g.add(apple);
		g.add(pear);
		g.add(cherry);

		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RadioButtonEx();
	}

}
