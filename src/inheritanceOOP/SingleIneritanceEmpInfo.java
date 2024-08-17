package inheritanceOOP;

class Person  
{
	public void getFirstName(String fname)
	{
		System.out.println("FirstName:--> "+fname);
		System.out.println("Person class And getFirstName Mathod executed........");
	}
	public void getLastName(String lname)
	{
		System.out.println("LastName:--> "+lname);
		System.out.println("Person class And getLastName Mathod executed........");
	}
}
 class Employee1 extends Person
{
	public void getEmployeeId(int id,String fname,String lname)
	{
			System.out.println("Employee Id:--> "+id);
			System.out.println("Employee class And getEmployeeId Mathod executed........");
			super.getFirstName(fname);
			super.getLastName(lname);
	}
	public void getLastName1(String lname)
	{
		System.out.println("LastName:--> "+lname);
		System.out.println("Employee class And getLastName Mathod executed........");
	}
}
public class SingleIneritanceEmpInfo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employee1 e = new Employee1();
		e.getEmployeeId(1,"ABC","XYZ");
		e.getLastName1("XYZ");
	

	}

}
