package programs;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		if(a>20)
		{
			System.out.println("Bis greater than a ");
		}
		else
		{
			System.out.println("A is greater than b ");
		}
		if(false)
		{
			System.out.println("false ");
		}
		else
		{
			System.out.println("true ");
		}
		
		int x=100,y=200,z=200;
		if(x>y&&x>z)
		{
			System.out.println("x is greater");
		}
		else if(y>z)
		{  System.out.println("y is greater");
			
		}
		else
		{
			System.out.println("z is greater");
		}
		
			
			
	}

}
