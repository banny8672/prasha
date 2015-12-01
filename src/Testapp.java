import java.awt.Dimension;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Testapp extends JPanel implements ActionListener{

		JButton button;
		
		public Testapp()
		{
			setPreferredSize(new Dimension(200,50));
			JButton button = new JButton("Open");
			button.addActionListener(this);
			add(button);
		}
		
		public static void main(String args[])
		{
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setContentPane(new Testapp());
			frame.pack();
			frame.setLocation(700,400);
			frame.setVisible(true);
			
		}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new Singleton();
	}
	
}
