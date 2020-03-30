package timeSheetsNotifier;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Notifier {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Reminder");
		frame.setSize(400, 100);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		
		JLabel text = new JLabel("If you have not done so already, please fill out your timesheet.", JLabel.CENTER);
		frame.add(text);
		
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		       frame.dispose();
		    }
		});
		frame.add(button);
		
		frame.setVisible(true);
	}

}
