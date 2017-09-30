package baseline;

/**
 *
 * @author Chris Kemerait
 */
import baseline.ui.MainWindow;
import javax.swing.JFrame;
import baseline.logical_layer.StudentInfoManager;

public class Main
{

	public static void main(String[] args)
	{
		StudentInfoManager manager = new StudentInfoManager();
		JFrame startUpWin = new MainWindow (manager);
		startUpWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
