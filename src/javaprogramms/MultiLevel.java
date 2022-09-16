package javaprogramms;

public class MultiLevel extends Child {
void Transfer()
{
	System.out.println("Transfered");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevel obj2=new MultiLevel();
		obj2.verifylogin();
		obj2.addben();
		obj2.Transfer();
		

	}
	void addben()
	{
		super.addben();
		System.out.println("2nd");
	}

}
