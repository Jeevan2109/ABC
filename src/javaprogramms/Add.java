package javaprogramms;

public class Add {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Add a=new Add();
		System.out.println(a.add(12, 14));
		System.out.println(a.add(2.4f, 2.2f));
		System.out.println(a.add(2, 2, 2));
	}

	 int add(int a,int b)
	{
		return (a+b);
	}

	float add (float a,float b)
	{
		return (a+b);
	}
      int  add (int a,int b,int c)
	{
		
		return (a+b+c);
	}
}

	
		



	
	