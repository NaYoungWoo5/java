import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Notepad extends JFrame {
	public Notepad() {
		setTitle("제목 없음 - 메모장");
		createMenu();
		createToolBar();
		setSize(500, 400);
		setVisible(true);
		
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("파일(F)"));
		mb.add(new JMenu("편집(E)"));
		mb.add(new JMenu("서식(O)"));
		mb.add(new JMenu("보기(V)"));
		mb.add(new JMenu("도움말"));

		this.setJMenuBar(mb);
	}

	private void createToolBar() {
		JToolBar bar = new JToolBar("제목 없음 - 메모장");
		bar.add(new JTextField(""));
		
		add(bar, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new Notepad();
	}
}