// a program to demonstrate Constructor Chaining.
public class ConstructorChaining {
	int x,y;
	public ConstructorChaining() 
	{
		// TODO Auto-generated constructor stub
		this(5);
		System.out.println("Default Constructor");
	}
	
	public ConstructorChaining(int x)
	{
		this(5,10);
	}
	
	public ConstructorChaining(int x, int y)
	{
		System.out.println("x =  "+x +","+"y = "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorChaining();
	}

}
