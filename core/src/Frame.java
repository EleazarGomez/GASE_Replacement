import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private JTextArea inputTextArea;
	private JTextArea outputTextArea;
	private JScrollPane inputScroll;
	private JScrollPane outputScroll;
	private JButton generateButton;
	private JLabel inputLabel;
	private JLabel outputLabel;
	private JPanel inputPane;
	private JPanel outputPane;
	private JPanel buttonPane;
	
	public Frame(String title)
	{
		super(title);
		
		// Text Areas
		inputTextArea = new JTextArea(14, 40);
		inputTextArea.setFont(new Font("Consolas", Font.PLAIN, 14));
		inputTextArea.setTabSize(4);
		
		/* FOR TESTING */
		inputTextArea.setText("public class ParticipantSO implements StringSerializable {\r\n" + 
				"    private String m_participantID;\r\n" + 
				"    private String m_name;\r\n" + 
				"    private String m_group;\r\n" + 
				"    private String m_software;\r\n" + 
				"    private String m_version;\r\n" + 
				"    private int m_availability;\r\n" + 
				"    private int m_capacity;\r\n" + 
				"    private long m_lastSeen;\r\n" + 
				"    private long m_lastUpdated;\r\n" + 
				"    private int m_valid;\r\n" + 
				"    private int m_disabled;\r\n" + 
				"    private int m_activeTestcases;\r\n" + 
				"    private String m_levelOfAutomation;\r\n" + 
				"    private String m_excludedParticipants;\r\n" + 
				"    private String m_capabilities;\r\n" + 
				"\r\n" + 
				"    private String m_excludedParticipantsShadowField;\r\n" + 
				"    private Set m_excludedParticipantsSet;\r\n" + 
				"    private String m_capabilitiesShadowField;\r\n" + 
				"    private ParticipantConstants.Capability[] m_capabilitiesSet;");
		/* FOR TESTING */
		
		outputTextArea = new JTextArea(10, 40);
		outputTextArea.setFont(new Font("Consolas", Font.PLAIN, 14));
		outputTextArea.setTabSize(4);
		outputTextArea.setEditable(false);
		
		inputScroll = new JScrollPane (inputTextArea);
		outputScroll = new JScrollPane (outputTextArea);
		
		// Generate button
		generateButton = new JButton("Generate");
		generateButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
		generateButton.setFocusable(false);
		
		// Labels
		inputLabel = new JLabel("Input");
		outputLabel = new JLabel("Output");
		inputLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		inputLabel.setFont(new Font("Serif", Font.BOLD, 15));
		inputLabel.setLabelFor(inputTextArea);
		outputLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		outputLabel.setFont(new Font("Serif", Font.BOLD, 15));
		outputLabel.setLabelFor(outputTextArea);
		
		// Lay out input text area
        inputPane = new JPanel();
        inputPane.setLayout(new BoxLayout(inputPane, BoxLayout.PAGE_AXIS));
        inputPane.add(inputLabel);
        inputPane.add(Box.createRigidArea(new Dimension(0,5)));
        inputPane.add(inputScroll);
        inputPane.setBorder(BorderFactory.createEmptyBorder(10,50,10,50));
        
        // Lay out output text area
        outputPane = new JPanel();
        outputPane.setLayout(new BoxLayout(outputPane, BoxLayout.PAGE_AXIS));
        outputPane.add(outputLabel);
        outputPane.add(Box.createRigidArea(new Dimension(0,5)));
        outputPane.add(outputScroll);
        outputPane.setBorder(BorderFactory.createEmptyBorder(10,50,10,50));

        //Lay out the generate button.
        buttonPane = new JPanel();
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
				String data = inputTextArea.getText();
				Logic lo = new Logic();
				String result = lo.getResult(data);
				outputTextArea.setText(result);
			}
		});
	}
}
