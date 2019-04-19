import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("이벤트 리스너 예쪵ㅇㅇㅇㅇ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionLustener());
		c.add(btn);

		setSize(350, 150);
		setVisible(true);

	}

	private class MyActionLustener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("ADADAD"))
				b.setText("액션");
			else
				b.setText("Actosdo");

			InnerClassListener.this.setTitle(b.getText());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();

	}

}
