import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Singleton extends JFrame{
	static JPanel panel;
	static JLabel label;
	static String str = "";
	
	public Singleton()
	{
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setPreferredSize(new Dimension(200,100));
		pack();
		setLocation(750, 280);
		java.util.Date now = new java.util.Date();
		str = now.toString();
		label = new JLabel(str);
		add(label);
		setVisible(true);
	}
}
