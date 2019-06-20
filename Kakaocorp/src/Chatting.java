import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Chatting extends JFrame {
	private JTextField startTf = new JTextField(17);
	private JButton calcBtn = new JButton("전송");
	private JButton emoticonBtn = new JButton("이모티콘");
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;

	public Chatting() {
		super("채팅 클라이언트 0번 ");
		setSize(410, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(startTf);
		c.add(calcBtn);
		c.add(emoticonBtn);

		setVisible(true);
		setupConnection();
		
		emoticonBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg1) {
				// TODO Auto-generated method stub
				try {
					String startText1 = startTf.getText().trim();
					
					startTf.setText("");
					
					if (startText1.length() == 0)
							return;
					
						out.write("나영우 : t( -_- t )\n");
						out.flush();
						/*S*/
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("클라이언트 0번 : 서버로부터 연결 종료");
					return;
				}
			}
		});
		
		calcBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String startText = startTf.getText().trim();
					
					startTf.setText("");
					
					if (startText.length() == 0) 
							return;
					
						out.write("나영우 : "+startText + "\n");
						out.flush();
						/*S*/
					
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("클라이언트 0번 : 서버로부터 연결 종료");
					return;
				}
			}
		});
	}

	public void setupConnection() {
		try {
			socket = new Socket("localhost", 9998);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chatting();
	}

}

