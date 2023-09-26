//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class ConvertTemp extends JFrame
{
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	// Constructor
	public ConvertTemp(String title)
	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		// Attach listener to text field
		fahrenField.addActionListener(new FahrenheitListener());

		// Add Celsius label and text field to frame
		add(new JLabel("Celsius"));
		add(celsiusField);
		// Attach listener to text field
		celsiusField.addActionListener(new CelsiusListener());

		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end costructor

	// listener for fahrenheit input
	class FahrenheitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
			// get value from field
            String inputValue = evt.getActionCommand();
			// check if input is correct
			try
			{
				double number = Double.parseDouble(inputValue);
				// perform calculations
				number = (number - 32) * 5.0 / 9.0;
				// rounds result
				number = Math.round(number * 100.0) / 100.0;
				// set value of other field
				celsiusField.setText(String.valueOf(number));
			}
			catch (Exception e)
			{
				celsiusField.setText("Error: " + e);
			}
        }
	}
	
	// listener for celsius input
	class CelsiusListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
			// get value from field
            String inputValue = evt.getActionCommand();
			// check if input is correct
			try
			{
				double number = Double.parseDouble(inputValue);
				// perform calculations
				number = (number * 5.0 / 9.0) + 32;
				// rounds result
				number = Math.round(number * 100.0) / 100.0;
				// set value of other field
				fahrenField.setText(String.valueOf(number));
			}
			catch (Exception e)
			{
				fahrenField.setText("Error: " + e);
			}
        }
	}


	// Listener for window
	class WindowCloser extends WindowAdapter
	{
		public void windowClosing(WindowEvent evt)
		{
			System.exit(0);
		}
	}

}//end class