package inheritanceOOP;

 class Animal 
{
	public void makeSounnd()
	{
		System.out.println("Animals are sleeping");
		System.out.println("Animal class And MakeSound Mathod executed........");
	}
}
 class Cat extends Animal
{
	public void makeSounnd()
	{
		super.makeSounnd();
		System.out.println("Cat are eating");
		System.out.println("Cat class And MakeSound Mathod executed........");
	}
}
public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cat d = new Cat();
		d.makeSounnd();
		System.out.println("Main Method executed. ");
	}

}
