import javax.swing.*;
import java.awt.*;

public class MainApplication
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				JFrame frame = new Frame("GASE Replacement Application");
				frame.setSize(875, 600);
				frame.setMinimumSize(new Dimension(875, 600));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
