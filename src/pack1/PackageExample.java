package pack1;

public class PackageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackageExample obj=new PackageExample();
		int total=obj.add(50,60);
		System.out.println("total="+total);

	}
	public int add(int x, int y)
	{
		int sum=x+y;
		return sum;
		
	}

}
