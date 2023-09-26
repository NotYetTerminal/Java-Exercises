import javax.swing.JFrame;

public class JavaGuiDriver
{
	public static void main(String[] args)
    {
		JavaGui  javaGui = new JavaGui("ColorSelect");
		javaGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		javaGui.setSize(350, 200);
		javaGui.setLocation(500,400);
		javaGui.setVisible(true);
	}
}
