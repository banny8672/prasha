import java.awt.Dimension;
import java.awt.Label;
import java.security.SignatureException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Singleton1 extends JFrame{
	
	private static Singleton1 uniqueInstance;
	private static JLabel labelStored = null;
	static JPanel panel;
	static JLabel label;
	static String str = "";
	
	private Singleton1()
	{
		
	}
	
	public static Singleton1 getInstance()
	{
		if(uniqueInstance == null)
		{
			uniqueInstance = new Singleton1();
		}
		return uniqueInstance;
	}

	public void getTime(){
		if (labelStored!=null) {
			remove(labelStored);
		}
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setPreferredSize(new Dimension(200,100));
		pack();
		setLocation(750, 300);
		java.util.Date now = new java.util.Date();
		str = now.toString();
		labelStored = label = new JLabel(str);
		add(label);
		setVisible(true);
	}

}

