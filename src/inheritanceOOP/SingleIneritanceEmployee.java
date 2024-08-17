package inheritanceOOP;

class Employee 
{
	public void work()
	{
		System.out.println("Working good..");
		System.out.println("Employee class And work Mathod executed........");
	}
	public void getSalary()
	{
		System.out.println("Salary 1000000");
		System.out.println("Employee class And getSalary Mathod executed........");
	}
}
 class HRmanager extends Employee
{
	public void work()
	{
			System.out.println("New Employee Work..");
			System.out.println("HRmanager class And work Mathod executed........");
			super.work();
	}
	public void addEmployee()
	{
		System.out.println("New employee added..");
		System.out.println("HRmanager class And addEmployee Mathod executed........");
		super.getSalary();
	}
}
public class SingleIneritanceEmployee 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HRmanager d = new HRmanager();
		System.out.println("Main Method executed. ");
		d.work();
		d.addEmployee();
	}

}

