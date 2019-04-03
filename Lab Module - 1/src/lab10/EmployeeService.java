package lab10;

/**
 * @author DOLA SAI RAM
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
	
	public static void main(String args[])
	{
		Stream<Employee> st1=EmployeeRepository.getEmployees().stream();
		st1.forEach(e->System.out.println(e.getFirstName()+" "+
					e.getLastName()+" "+e.getHireDate()+" "+e.getHireDate().getDayOfWeek()));
		System.out.println("******************************");
		System.out.println("    ");
		EmployeeService es = new EmployeeService();
		System.out.println("Employees in each department");
		es.countEmployeesInEachDepartment();
		System.out.println("******************************");
		System.out.println("    ");
		System.out.println("Employees in get day of the week");
		es.getDayOfWeek();
		System.out.println("******************************");
		System.out.println("    ");
		System.out.println("Employee start date");
		es.getEmployeesStartDate();
		System.out.println("******************************");
		System.out.println("    ");
		System.out.println("Employee with out department");
		es.getEmployeeWithOutDepartment();
		es.getTotalSalary();
		
	}
	
	public void getEmployeesStartDate()
	{
		Stream<Employee> st1=EmployeeRepository.getEmployees().stream();
		System.out.println("Enter the Week of the Days");
		Scanner sc=new Scanner(System.in);
		String week= sc.next();
		
		st1.filter((e)->e.getHireDate().getDayOfWeek().equals(week.toUpperCase())).forEach(e->System.out.println(e.getFirstName()+" "+
					e.getLastName()+" "+e.getHireDate()+" "+e.getHireDate().getDayOfWeek()));

	}
	public void countEmployeesInEachDepartment()
	{
		Stream<Employee> st1=EmployeeRepository.getEmployees().stream();
		Map<Department,Long> m = st1.filter(e->e.getDepartment()!=null).
				collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		m.forEach((k,v)->{
			System.out.println(k.getDepartmentName()+"\t"+v);
		});
	}
	
	public void getDayOfWeek()
	{
		Stream<Employee> st1=EmployeeRepository.getEmployees().stream();
		st1.forEach(e->System.out.println(e.getFirstName()+" "+
					e.getLastName()+" "+e.getHireDate()+" "+e.getHireDate().getDayOfWeek()));

	}
	
	public double getTotalSalary()
	{
		Stream<Employee> st = EmployeeRepository.getEmployees().stream();
		List<Double> li = st.map((e)->e.getSalary()).collect(Collectors.toList());
		Stream<Double> str = li.stream();
		Optional<Double> opt = str.reduce((a,b)->a+b);
		return opt.get();
	}
	
	public void getDepartmentNames()
	{
		Stream <Department> st = EmployeeRepository.getDepartments().stream();
		List<String> li = st.map((d)->d.getDepartmentName()).collect(Collectors.toList());
		Stream<String> str = li.stream();
		System.out.println("The department Names:");
		str.distinct().forEach((e)->{System.out.println(e);});
	}
	
	public void getSeniorEmployee()
	{
		Stream<Employee> st11 = EmployeeRepository.getEmployees().stream();
		Optional<Employee> opt=st11.max((a,b)->a.getHireDate().compareTo(b.getHireDate()));
		System.out.println();
	}
	
	public void getServiceDuration()
	{
		Stream<Employee> st1=EmployeeRepository.getEmployees().stream();
		st1.forEach((e)->{
			System.out.println(e.getFirstName()+" "+Period.between(e.getHireDate(), LocalDate.now()));
	});
	}
	
	public void getEmployeeWithOutDepartment()
	{
		Stream<Employee> st1=EmployeeRepository.getEmployees().stream();
		st1.filter((e)->e.getDepartment()==null).forEach(e->System.out.println(e.getFirstName()+" "+e.getLastName()));
	}
	
	public void getDepartmentWithoutEmployee()
	{
		Stream<Employee> st1=EmployeeRepository.getEmployees().stream();
		Map<Department,List<Employee>> m = st1.filter(e->e.getDepartment()!=null).filter(e->e.getFirstName()!=null).collect(Collectors.groupingBy(e->e.getDepartment()));
		Set<Department> set =m.keySet();
		set.forEach(e->System.out.println(e));
	}
}
