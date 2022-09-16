package javaprogramms;
abstract class JK
{
	abstract void jeevan();
	void m2()
	{
		System.out.println("welcome");
	}
}
public class AbstractExam extends JK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExam obj=new AbstractExam();
		obj.jeevan();
		obj.m2();

	}
	void jeevan()
	{
		System.out.println("BYE");
	}

}
