import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {
	public static int clicks = 0;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Dark Wave");
		frame.setSize(600,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout Layout = new FlowLayout();
		frame.setLayout(Layout);
		JButton b1 = new JButton("Clicks: "+clicks);
		JButton b2 = new JButton("Button");
		frame.add(b1);
		frame.add(b2);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clicks++;
				System.out.println("Clicks: "+ clicks);
			}
			
		});
		frame.pack();
	
		frame.setVisible(true);
	}
}
