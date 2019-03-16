class Employee
{
	int empId;
	String empName;
	String date;
	String desigCode;
	String dept;
	int basic;
	int hra;
	int it;
	Employee(int empId, String empName, String date, String desigCode, String dept, int basic, int hra, int it)
	{
		this.empId=empId;
		this.empName=empName;
		this.date=date;
		this.desigCode=desigCode;
		this.dept=dept;
		this.basic=basic;
		this.hra=hra;
		this.it=it;
	}
	void getData()
	{
		System.out.print(empId+" "+empName+" "+date+" "+desigCode+" "+dept+" ");
	}
	int getId()
	{
		return empId;
	}
}
class Salary
{
	String desigCode;
	String designation;
	int da;
	Salary(String desigCode, String designation, int da)
	{
		this.desigCode=desigCode;
		this.designation=designation;
		this.da=da;
	}
	void getData()
	{
		System.out.println(desigCode+" "+designation+" "+da);
	}
}
class Project1
{
	public static void main(String args[])
	{
		Employee[] emp ={new Employee(1001,"Ashish","01/04/2009","e","R&D",20000,8000,3000),
			 new Employee(1002,"Sushma","23/08/2012","c","PM",30000,12000,9000),
			 new Employee(1003,"Rahul","12/11/2008","k","Acct",10000,8000,1000),
			 new Employee(1004,"Chahat", "29/01/2013","r","Front Desk",12000,6000,2000),
			 new Employee(1005,"Ranjan","16/07/2005","m","Engg",50000, 20000, 20000),
			 new Employee(1006,"Suman","1/1/2000","e","Manufacturing",23000, 9000, 4400),
			 new Employee(1007, "Tanmay", "12/06/2006","c","PM", 29000, 12000, 10000)
			 };
			 
		Salary[] sal={new Salary("e", "Engineer", 20000),
					  new Salary("c", "Consultant", 32000),
					  new Salary("k", "Clerk", 12000),
					  new Salary("r", "Receptionist",15000),
					  new Salary("m", "Manager", 40000)
					};
		boolean flag=false;
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].empId==Integer.parseInt(args[0]))
			{
				for(int j=0;j<sal.length;j++)
				{
					if(emp[i].desigCode.equals(sal[j].desigCode))
					{
						emp[i].getData();
						int salary= emp[i].basic+emp[i].hra+sal[i].da-emp[i].it;
						//sal[j].getData();
						System.out.print(" "+salary);
						flag=true;
						break;
					}
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Data Not Found");
		}
	}
}