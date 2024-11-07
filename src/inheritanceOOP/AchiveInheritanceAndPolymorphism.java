package inheritanceOOP;

import java.util.Scanner;
class APolymor
{
	 APolymor(int a) 
	{
		System.out.println(a);
	}
	public int isAIAP(int a,int b)
	{
		return a+b;
	}
}
public class AchiveInheritanceAndPolymorphism extends APolymor
{

	 AchiveInheritanceAndPolymorphism(int a) 
	{
		super(10);
		System.out.println(a);
	}
	 public AchiveInheritanceAndPolymorphism() 
	 {
		this(12);
	}
	public int isAIAP(int a,int b)
	{
		System.out.println("Parent class Addtion: "+super.isAIAP(a, b));
		return a+b;
	}
	public int isAIAP(int p,int q,int r)
	{
		return p*q*r;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any two number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter Any Three number: ");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		AchiveInheritanceAndPolymorphism AIAP = new AchiveInheritanceAndPolymorphism();
		int t=AIAP.isAIAP(a, b);
		System.out.println("Addition of two Number is: "+t);
		int m=AIAP.isAIAP(p, q, r);
		System.out.println("Multiplication of three Number is: "+m);
	}
}
