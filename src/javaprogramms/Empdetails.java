package javaprogramms;

public class Empdetails {
	String empname;
	String id;
	int salary;
	String empdesig;
	static String companyname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Empdetails emp=new Empdetails("jk","us001",2100,"hr");
data();
emp.display();
Empdetails emp1=new Empdetails("pk","us001",2100,"tech");
emp1.display();
	}
Empdetails(String empname_temp,String id_temp,int salary_temp,String empdesig_temp)
{
empname=empname_temp;
id=id_temp;
salary=salary_temp;
empdesig=empdesig_temp;
	}
void display()
{
	System.out.println("name is "+empname);
	System.out.println("id is "+id);
	System.out.println("salary is "+salary);
	System.out.println("desig is "+empdesig);
	System.out.println("company name is "+companyname);
	System.out.println("----------------");
	

}
static void data()
{
	companyname="Evry";
}
static {
	System.out.println("TOP MOST PRO");
}
}
