import javax.swing.*;
import java.awt.*;
import java.io.File;

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
				
//				 String rootPath = System.getProperty("user.dir");
//				 String imgPath = rootPath + File.separator + "img/" + File.separator;
//				 ImageIcon icon = new ImageIcon(imgPath + "icon.png");
//				 frame.setIconImage(icon.getImage());

				frame.setVisible(true);
			}
		});
	}
}
