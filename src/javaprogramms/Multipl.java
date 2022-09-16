package javaprogramms;

interface A
{
	void m1();
}
interface B extends A
{
	void m2();
}
interface C
{
	void m3();
}
public class Multipl implements B,C {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipl obj=new Multipl();
		obj.m1();
		obj.m2();
		obj.m3();

	}
	public void m1()
	{
		System.out.println("yes");
	}
	public void m2()
	{
		System.out.println("NO");
	}
	public void m3()
	{
		System.out.println("HMMM");
	}

}
