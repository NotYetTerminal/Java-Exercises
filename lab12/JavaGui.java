import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JavaGui extends JFrame
{
	// Constructor
	public JavaGui(String title)
	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridBagLayout());

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setLayout(new GridBagLayout());
		panel2.setLayout(new GridBagLayout());

		// sets up grid layout details
		GridBagConstraints c = new GridBagConstraints();
		// item position in grid cells
		c.gridx = 0;
		c.gridy = 0;
		// item padding
		c.insets = new InsetsUIResource(10, 10, 10, 10);
		// item position in the cell
		c.anchor = GridBagConstraints.WEST;
		panel1.add(new JCheckBox("Snap to Grid"), c);

		// a panel with both the label and input field
		JPanel xPanel = new JPanel();
		xPanel.setLayout(new GridBagLayout());
		xPanel.add(new JLabel("X: "));
		JTextField xField = new JTextField();
		xField.setPreferredSize(new DimensionUIResource(30, 20));
		xPanel.add(xField);
		
		c.gridx = 1;
		panel1.add(xPanel, c);

		c.gridx = 0;
		c.gridy = 1;
		panel1.add(new JCheckBox("Show Grid"), c);

		// a panel with both the label and input field
		JPanel yPanel = new JPanel();
		yPanel.setLayout(new GridBagLayout());
		yPanel.add(new JLabel("Y: "));
		JTextField yField = new JTextField();
		yField.setPreferredSize(new DimensionUIResource(30, 20));
		yPanel.add(yField);
		
		c.gridx = 1;
		panel1.add(yPanel, c);

		// sets new grid options
		// sets up three buttons
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 0;
		c2.gridy = 0;
		c2.insets = new InsetsUIResource(5, 0, 5, 0);
		JButton okButton = new JButton();
		okButton.setText("OK");
		DimensionUIResource buttonDimension = new DimensionUIResource(80, 30);
		okButton.setPreferredSize(buttonDimension);
		panel2.add(okButton, c2);

		c2.gridy = 1;
		JButton cancelButton = new JButton();
		cancelButton.setText("Cancel");
		cancelButton.setPreferredSize(buttonDimension);
		panel2.add(cancelButton, c2);

		c2.gridy = 2;
		JButton helpButton = new JButton();
		helpButton.setText("Help");
		helpButton.setPreferredSize(buttonDimension);
		panel2.add(helpButton, c2);

		// sets new grid options
		// adds the two main panels
		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 0;
		c3.gridy = 0;
		c3.insets = new InsetsUIResource(0, 10, 0, 10);
		add(panel1, c3);
		
		c3.gridx = 1;
		add(panel2, c3);

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
