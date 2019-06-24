import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Frame extends JFrame
{
	public Frame(String title)
	{
		super(title);
		
		// Set layout manager
		setLayout(new BorderLayout());
		
		// Create Swing component
		final JTextArea textArea1 = new JTextArea();
		final JTextArea textArea2 = new JTextArea();
		
		textArea2.setEditable(false);
		
		JButton button = new JButton("Generate");
		
		// Add Swing components to content pane
		Container c = getContentPane();
		
		c.add(textArea1, BorderLayout.NORTH);
		c.add(textArea2, BorderLayout.SOUTH);
		c.add(button, BorderLayout.SOUTH);
		
		// Add scroll bars
		JScrollPane scroll_1 = new JScrollPane (textArea1, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JScrollPane scroll_2 = new JScrollPane (textArea2, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		super.add(scroll_1);
		super.add(scroll_2);
		
		// Add behavior
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				textArea1.append("Hello\n");
			}
		});
	}
}
