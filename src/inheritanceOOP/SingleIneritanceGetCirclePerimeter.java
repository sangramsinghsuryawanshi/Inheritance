package inheritanceOOP;
class Shape1 
{
	public void getPerimeter(int r)
	{
		double peri=2*3.14*r;
		System.out.println("peremeter Of circle: "+peri);
		System.out.println("Shape class And getPerimeter Mathod executed........");
	}
	public void getArea(int area)
	{
		System.out.println("Area Of cicle: "+area);
		System.out.println("Shape1 class And getArea Mathod executed........");
	}
}
 class Circle extends Shape1
{
	 public void getPerimeter(int r)
	{
		System.out.println("Get peremeter Of circle");
		System.out.println("Circle class And getPerimeter Mathod executed........");
		super.getPerimeter(r);
	}
	 public void getArea()
	{
		int l=20,w=34;
		int area=l*w;
		System.out.println("Area Of cicle");
		System.out.println("Circle class And getArea Mathod executed........");
		super.getArea(area);
	}
}
public class SingleIneritanceGetCirclePerimeter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Circle e = new Circle();
		e.getPerimeter(4);
		e.getArea();

	}

}
