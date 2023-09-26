import javax.swing.JFrame;

public class JavaGuiDriver
{
	public static void main(String[] args)
    {
		JavaGui  javaGui = new JavaGui("Printer");
		javaGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		javaGui.pack();
		javaGui.setLocation(500,400);
		javaGui.setVisible(true);
	}
}
