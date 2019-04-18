import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx(){
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
	Container c = getContentPane();
	
	c.setLayout(new BorderLayout(30,20));
	c.add(new JButton("Calculate"),BorderLayout.CENTER);
	c.add(new JButton("add"),BorderLayout.NORTH);
	c.add(new JButton("sub"),BorderLayout.SOUTH);
	c.add(new JButton("mul"),BorderLayout.EAST);
	c.add(new JButton("div"),BorderLayout.WEST);
	
	setSize(300,200);
	setVisible(true);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();

	}

}
