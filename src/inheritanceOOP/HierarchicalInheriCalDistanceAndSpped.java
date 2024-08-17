package inheritanceOOP;

class vehicle1
{
	public void veh(int m1,int m2,String m3)
	{
		int dist=m1*m2;
		int speed=m2/m1;
		System.out.println("Motercycle distance traveled: "+dist);
		System.out.println("Motercycle speed: "+speed);
		System.out.println("vehicle class And veh Mathod executed........");
	}
	public void ca1(int c1,int c2,String c3)
	{
		int dist=c1*c2;
		int speed=c2/c1;
		System.out.println("Car distance traveled: "+dist);
		System.out.println("Car speed: "+speed);
		System.out.println("vehicle class And ca1 Mathod executed........");
	}
	public void truc(int t1,int t2,String t3)
	{
		int dist=t1*t2;
		int speed=t2/t1;
		System.out.println("Truck distance traveled: "+dist);
		System.out.println("Truck speed: "+speed);
		System.out.println("vehicle class And truc Mathod executed........");
	}
}
class Truck extends vehicle1
{
	public void tru(int model,int year,String type)
	{
		System.out.println("Model--> "+model+" Year--> "+year+" Fuel Type--> "+type+" ");
		System.out.println("Truck class And tru Mathod executed........");
		super.truc(model,year,type);
	}
}
class Car2 extends vehicle1
{
	public void ca(int model,int year,String type)
	{
		System.out.println("Model--> "+model+" Year--> "+year+" Fuel Type--> "+type+" ");
		System.out.println("Car2 class And ca Mathod executed........");
		super.ca1(model,year,type);
	}
}
class MoterCycle extends vehicle1
{
	public void moter(int model,int year,String type)
	{
		System.out.println("Model--> "+model+" Year--> "+year+" Fuel Type--> "+type+" ");
		System.out.println("MoterCycle class And moter Mathod executed........");
		super.veh(model,year,type);
	} 
}
public class HierarchicalInheriCalDistanceAndSpped 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MoterCycle m = new MoterCycle();
		m.moter(102,2023,"p");
		
		Car2 c = new Car2();
		c.ca(101,2024,"p");
		
		Truck t = new Truck();
		t.tru(103,2022,"d");

	}

}
