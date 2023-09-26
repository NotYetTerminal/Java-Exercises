import javax.swing.JFrame;

public class ChangeColourDriver
{
	public static void main(String[] args)
    {
		//ChangeColour changeColour = new ChangeColour("Button");
		MyColours changeColour = new MyColours("Button");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(640, 400);
		changeColour.setVisible(true);
	}//end main
}//end class