package javaprogramms;
abstract class jeevan 
{
	abstract void m1();
	
}
public class AbstractExample extends jeevan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample obj=new AbstractExample();
		obj.m1();
	}
	void m1()
	{
		System.out.println("M1");
	}

}
