package inheritanceOOP;

class Parent1
{
	String name="sangram";
	int a=10;
	void disp()
	{
		System.out.println("Parent class method: "+name);
		System.out.println("Prent1 class completed..");
	}
}
class Child1 extends Parent1
{
	String name1="sangram s";
	int a1=12;
	void dis()
	{
		System.out.println("Child1 class method calling parent class Parent1 instance variable using super: "+(super.name));
		super.disp();
		System.out.println("Child1 class method calling parent class Parent1 instance variable using super: "+(super.a));
		System.out.println("Child1 class completed..");
	}
}
class Child2 extends Child1
{
	void dis2()
	{
		System.out.println("Child2 class method calling parent class of child1 instance variable using super: "+(super.name1));
		System.out.println("Child2 class method calling parent class of child1 instance variable using super: "+(super.a1));
		System.out.println("Child2 class completed..");
		super.dis();
	}
}
public class SuperKeyInheri 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.dis2();
	}

}
