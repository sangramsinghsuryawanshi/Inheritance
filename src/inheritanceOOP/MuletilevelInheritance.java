package inheritanceOOP;

class Animale1
{
	public void eat()
	{
		System.out.println("Eating..");
	}
}
class Dog1 extends Animale1
{
	public void bark()
	{
		System.out.println("Barking..");
	}
}
class BabyDog extends Dog1
{
	public void weep()
	{
		System.out.println("Weeping..");
	}
}
public class MuletilevelInheritance 
{
	public static void main(String[] args) 
	{
		BabyDog b = new BabyDog();
		b.bark();
		b.eat();
		b.weep();
	}
}
