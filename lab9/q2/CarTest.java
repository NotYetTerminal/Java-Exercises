public class CarTest
{
	public static void main(String args[])
    {
		Car car = new Car("saloon", 4, 6);
		System.out.println("Import duty: " + car.calculateDuty());

		Hgv hgv = new Hgv(2, 4, 6);
		System.out.println("Import duty: " + hgv.calculateDuty());
	}
}