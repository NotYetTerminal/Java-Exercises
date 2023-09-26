import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class JavaGui extends JFrame
{
	// Constructor
	public JavaGui(String title)
	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridBagLayout());

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());
		
		String[] colourArray = {"Red", "Green", "Blue", "Black", "White"};
		JComboBox<String> colourList = new JComboBox<String>(colourArray);

		// sets up grid layout details
		GridBagConstraints c = new GridBagConstraints();
		// item position in grid cells
		c.gridx = 0;
		c.gridy = 0;
		// item padding
		c.insets = new InsetsUIResource(10, 10, 10, 10);
		// item position in the cell
		panel1.add(colourList, c);

		// a panel with both the checkboxes
		JPanel middlePanel = new JPanel();
		middlePanel.setLayout(new GridBagLayout());
		c.gridx = 0;
		c.gridy = 0;
		middlePanel.add(new JCheckBox("background"), c);
		c.gridx = 1;
		middlePanel.add(new JCheckBox("foreground"), c);
		
		c.gridx = 0;
		c.gridy = 1;
		panel1.add(middlePanel, c);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridBagLayout());
		c.gridx = 0;
		c.gridy = 0;
		bottomPanel.add(new JButton("Ok"), c);
		c.gridx = 1;
		bottomPanel.add(new JButton("Cancel"), c);
		
		c.gridx = 0;
		c.gridy = 2;
		panel1.add(bottomPanel, c);
		
		add(panel1);

		// Attach window listener
		addWindowListener(new WindowCloser());
	}

	// Listener for window
	class WindowCloser extends WindowAdapter
	{
		public void windowClosing(WindowEvent evt)
		{
			System.exit(0);
		}
	}

}
