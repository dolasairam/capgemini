import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataFlow {
	static List<Employee> emp=new ArrayList<Employee>();
	public void inputs(Employee e)
	{
		emp.add(e);
	}
	public void sortingByName()
	{
		Comparator<Employee> com=(a,b)->{return a.getFirstName().compareTo(b.getFirstName());};
		Collections.sort(DataFlow.emp,com);
		System.out.println(emp);
		
	}
}
