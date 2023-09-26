import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
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
		GridBagConstraints gridBagConstraints = new GridBagConstraints();

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());

		JPanel settingsPanel = new JPanel();
		settingsPanel.setLayout(new GridBagLayout());

		JLabel printerLabel = new JLabel("Printer: MyPrinter");
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		//gridBagConstraints.insets.bottom = 10;
		settingsPanel.add(printerLabel, gridBagConstraints);
		gridBagConstraints.anchor = GridBagConstraints.CENTER;

		JPanel middlePanel = new JPanel();
		middlePanel.setLayout(new GridBagLayout());
		JPanel checkboxPanel = new JPanel();
		checkboxPanel.setLayout(new GridBagLayout());
		JPanel radioPanel = new JPanel();
		radioPanel.setLayout(new GridBagLayout());

		JRadioButton radioButton1 = new JRadioButton("Selection");
		JRadioButton radioButton2 = new JRadioButton("All");
		JRadioButton radioButton3 = new JRadioButton("Applet");

		ButtonGroup radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(radioButton1);
		radioButtonGroup.add(radioButton2);
		radioButtonGroup.add(radioButton3);

		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		checkboxPanel.add(new JCheckBox("Image"), gridBagConstraints);
		radioPanel.add(radioButton1, gridBagConstraints);

		gridBagConstraints.gridy = 1;
		checkboxPanel.add(new JCheckBox("Text"), gridBagConstraints);
		radioPanel.add(radioButton2, gridBagConstraints);

		gridBagConstraints.gridy = 2;
		checkboxPanel.add(new JCheckBox("Code"), gridBagConstraints);
		radioPanel.add(radioButton3, gridBagConstraints);

		gridBagConstraints.anchor = GridBagConstraints.CENTER;
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		middlePanel.add(checkboxPanel, gridBagConstraints);
		gridBagConstraints.gridx = 1;
		middlePanel.add(radioPanel, gridBagConstraints);

		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		settingsPanel.add(middlePanel, gridBagConstraints);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridBagLayout());

		bottomPanel.add(new JLabel("Print Quality: "));

		String[] qualityArray = {"High", "Medium", "Low"};
		JComboBox<String> qualityComboBox = new JComboBox<String>(qualityArray);
		bottomPanel.add(qualityComboBox);

		bottomPanel.add(new JCheckBox("Print to File"));

		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		settingsPanel.add(bottomPanel, gridBagConstraints);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridBagLayout());

		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		buttonsPanel.add(new JButton("Ok"), gridBagConstraints);
		gridBagConstraints.gridy = 1;
		buttonsPanel.add(new JButton("Cancel"), gridBagConstraints);
		gridBagConstraints.gridy = 2;
		buttonsPanel.add(new JButton("Setup..."), gridBagConstraints);
		gridBagConstraints.gridy = 3;
		buttonsPanel.add(new JButton("Help"), gridBagConstraints);
		
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		panel1.add(settingsPanel, gridBagConstraints);
		gridBagConstraints.gridx = 1;
		panel1.add(buttonsPanel, gridBagConstraints);
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
