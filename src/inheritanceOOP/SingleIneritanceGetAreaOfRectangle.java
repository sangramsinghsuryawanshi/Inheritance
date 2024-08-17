package inheritanceOOP;

class Shape 
{
	public void getArea()
	{
		System.out.println("Area Of rectangle");
		System.out.println("Shape class And getArea Mathod executed........");
	}
}
 class Rectangle extends Shape
{
	public void getArea()
	{
		super.getArea();
		int l=20,w=34;
		int area=l*w;
		System.out.println("Area ofRectangle: "+area);
		System.out.println("Rectangle class And getArea Mathod executed........");
	}
}
public class SingleIneritanceGetAreaOfRectangle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Rectangle d = new Rectangle();
		System.out.println("Main Method executed. ");
		d.getArea();

	}

}


