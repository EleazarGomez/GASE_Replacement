import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame
{
	public Frame(String title)
	{
		super(title);
		
		// Text Areas
		final JTextArea inputTextArea = new JTextArea(14, 40);
		final JTextArea outputTextArea = new JTextArea(10, 40);
		JScrollPane inputScroll = new JScrollPane (inputTextArea, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JScrollPane outputScroll = new JScrollPane (outputTextArea, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		outputTextArea.setEditable(false);
		
		// Generate button
		JButton generateButton = new JButton("Generate");
		generateButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
		generateButton.setFocusable(false);
		
		// Labels
		JLabel inputLabel = new JLabel("Input", JLabel.CENTER);
		JLabel outputLabel = new JLabel("Output", JLabel.CENTER);
		inputLabel.setLabelFor(inputTextArea);
		inputLabel.setHorizontalTextPosition(JLabel.CENTER);
		inputLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		outputLabel.setLabelFor(outputTextArea);
		outputLabel.setHorizontalTextPosition(JLabel.CENTER);
		outputLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		// Lay out input text area
        JPanel inputPane = new JPanel();
        inputPane.setLayout(new BoxLayout(inputPane, BoxLayout.PAGE_AXIS));
        inputPane.add(inputLabel);
        inputPane.add(Box.createRigidArea(new Dimension(0,5)));
        inputPane.add(inputScroll);
        inputPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        // Lay out output text area
        JPanel outputPane = new JPanel();
        outputPane.setLayout(new BoxLayout(outputPane, BoxLayout.PAGE_AXIS));
        outputPane.add(outputLabel);
        outputPane.add(Box.createRigidArea(new Dimension(0,5)));
        outputPane.add(outputScroll);
        outputPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        //Lay out the generate button.
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.PAGE_AXIS));
        buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        buttonPane.add(Box.createHorizontalGlue());
        buttonPane.add(generateButton);
        buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));

        //Put everything together, using the content pane's BorderLayout.
        Container contentPane = getContentPane();
        contentPane.add(inputPane, BorderLayout.NORTH);
        contentPane.add(outputPane, BorderLayout.CENTER);
        contentPane.add(buttonPane, BorderLayout.SOUTH);
		
		// Add button behavior
		generateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				outputTextArea.append("Hello\n");
			}
		});
	}
}
