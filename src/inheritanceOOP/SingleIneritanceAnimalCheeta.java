package inheritanceOOP;

class AnimalCheetha
{
	public void move()
	{
		System.out.println("Animals running..");
		System.out.println("AnimalCheetha class And move Mathod executed........");
	}
}
 class Cheetha extends AnimalCheetha
{
	public void move()
	{
		System.out.println("Cheetha running..");
		System.out.println("Cheetha class And move Mathod executed........");
		super.move();
	}
}
public class SingleIneritanceAnimalCheeta 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cheetha d = new Cheetha();
		System.out.println("Main Method executed. ");
		d.move();

	}

}
