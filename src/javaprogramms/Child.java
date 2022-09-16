package javaprogramms;
class login{
	void verifylogin()
	{
		System.out.println("very login");
	}
}
public class Child  extends login{
	 void addben()
	 {
	 	System.out.println("add ben");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.verifylogin();
		obj.addben();
	}
		void verifylogin()
		{
			super.verifylogin();
			System.out.println("1st");
	}

}

