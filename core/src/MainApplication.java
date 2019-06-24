import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainApplication
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				JFrame frame = new Frame("GASE Replacement Application");
				frame.setSize(900, 600);
				frame.setMinimumSize(new Dimension(900, 600));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
