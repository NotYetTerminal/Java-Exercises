public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());

		// a
		// Second instance
		// b
		// Set temperature to 10
		Thermometer thermB = new Thermometer(10);

		// c
		// Get temperature
		double tempB = thermB.getCelsius();

		// d
		// Print temperature
		System.out.println("Temp. of Thermometer B is " + tempB);
		
	} // end main
} // end class ThermTest