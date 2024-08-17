package inheritanceOOP;

class Anmialy
{
	void run()
	{
		System.out.println("Animal running.");
	}
}
class Dogy extends Anmialy
{
	void eat()
	{
	System.out.println("Dog eating.");	
	}
}
class Caty extends Anmialy
{
	void play()
	{
		System.out.println("Cat playing.");
	}
}

public class HierarchicalInheritanceDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dogy d = new Dogy();
		d.run();
		d.eat();

		Caty c = new Caty();
		c.run();
		c.play();
	}

}
