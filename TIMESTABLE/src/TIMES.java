import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TIMES extends JFrame {
	private JLabel sumLabel;
	public TIMES() {
     	setTitle("99窜!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(new FlowLayout());
		JButton btn = new JButton("备备窜");
		btn.addActionListener(new MyActionListener());
		c.add(btn);

		/*
		Panel p = new Panel();
		p.setSize(150, 150);
		add(p);
*/	
		sumLabel = new JLabel("g");
		c.add(sumLabel);
		setSize(550, 90);
		setVisible(true);
		
		
	}
	

	/*private class Panel extends JPanel {
		Panel() {
			setBackground(Color.PINK);
			add(new JLabel("免仿 >> "));
			add(new JTextField(30));
		}
	}
	*/

	/*
		private JCheckBox[] fruits = new JCheckBox[3];
		private String[] names = { "备", "备", "窜" };
		private JLabel sumLabel;

		
			setTitle("99窜");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());

			MyItemListener listener = new MyItemListener();
			for (int i = 0; i < fruits.length; i++) {
				fruits[i] = new JCheckBox(names[i]);
				fruits[i].setBorderPainted(true);
				c.add(fruits[i]);
				fruits[i].addItemListener(listener);
			}
			sumLabel = new JLabel();
			c.add(sumLabel);

			setSize(250, 200);
			setVisible(true);
		}

		class MyItemListener implements ItemListener {

			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					if (e.getItem() == fruits[0])
						for(int a = 1; a < 10; a ++){
							for(int b = 1; b < 10; b++){
								sumLabel.setText(a + b + "+" + "=" + a+b);		
							}
						}
				}
			}
		}
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TIMES();
	}
}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("备备窜"))

			for (int a = 2; a <= 9; a++) {
				for (int c = 2; c < 10; c++) {
					
				b.setText(a + "*" + c + "=" + a * c);
					// System.out.println
				}

				System.out.println();
			}

		else
			b.setText("备备窜");
	}
}