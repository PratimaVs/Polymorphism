package polymorphism;

public class MethodOverloading {
	
	static void addition(int a,float b)
	{
		System.out.println("Argument type(integer,float)");
	}
	
	static void addition(int a,double b)
	{
		System.out.println("Argument type(integer,double)");
	}
	
	static void addition(int a,int b)
	{
		System.out.println("Argument type(integer,integer)");
	}
	
	
	
	public static void main(String[] args)
	{
		MethodOverloading m = new MethodOverloading();
		m.addition(1,2);
		m.addition(1,2.3f);
		m.addition(2,2.5);
	}
}
