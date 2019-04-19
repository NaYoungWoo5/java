import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Notepad extends JFrame {
	public Notepad() {
		setTitle("���� ���� - �޸���");
		createMenu();
		createToolBar();
		setSize(500, 400);
		setVisible(true);
		
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("����(F)"));
		mb.add(new JMenu("����(E)"));
		mb.add(new JMenu("����(O)"));
		mb.add(new JMenu("����(V)"));
		mb.add(new JMenu("����"));

		this.setJMenuBar(mb);
	}

	private void createToolBar() {
		JToolBar bar = new JToolBar("���� ���� - �޸���");
		bar.add(new JTextField(""));
		
		add(bar, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new Notepad();
	}
}