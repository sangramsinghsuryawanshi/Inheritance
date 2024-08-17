package inheritanceOOP;

class Vehical 
{
	public void driver()
	{
		System.out.println("Driver repairing a vehical........");
		System.out.println("Vehical class And driver Mathod executed........");
	}
}
 class Car extends Vehical
{
	public void driver()
	{
		super.driver();
		System.out.println("Driver repairing a car.......");
		System.out.println("Car class And driver Mathod executed........");
	}
}
public class SingleIneritanceCar 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car d = new Car();
		System.out.println("Main Method executed. ");
		d.driver();

	}

}

