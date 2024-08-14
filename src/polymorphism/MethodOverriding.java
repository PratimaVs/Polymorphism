package polymorphism;

class parent{
	
	public void display()
	{
		System.out.println("Parent class method");
	}
	
	public void show()
	{
		System.out.println("Parent class show");
	}
	
	public void disp()
	{
		System.out.println("Parent class disp");
	}
}

class child extends parent{
	public void display()
	{
		System.out.println("Child class method");
	}
	
	public void show()
	{
		System.out.println("Child class show");
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		parent obj1 = new parent();
		obj1.show();
		obj1.display();
		obj1.disp();
		
		parent obj2 = new child();
		obj2.disp();
		obj2.display();
		obj2.show();
		
		child obj3 = new child();
		obj3.disp();
		obj3.display();
		obj3.show();

	}

}
