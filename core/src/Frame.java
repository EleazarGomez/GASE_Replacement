import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Frame extends JFrame
{
	public Frame(String title)
	{
		super(title);
		
		// Set layout manager
		setLayout(new BorderLayout());
		
		// Create Swing component
		final JTextArea textArea = new JTextArea();
		JButton button = new JButton("Generate");
		
		// Add Swing components to content pane
		Container c = getContentPane();
		
		c.add(textArea, BorderLayout.CENTER);
		c.add(button, BorderLayout.SOUTH);
		
		// Add behavior
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("Hello\n");
			}
		});
	}
}
