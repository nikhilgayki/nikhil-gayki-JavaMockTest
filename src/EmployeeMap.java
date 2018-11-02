import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Employee{
	int ID;
	String EmployeeName;
}

public class EmployeeMap {
	
	public static void main(String[] args) {
	
	HashMap <String, Employee> hm = new HashMap<String, Employee>();
	
	Employee a = new Employee();
	a.ID= 1678;
	a.EmployeeName= "Nikhil Gayki";
	
	Employee b = new Employee();
	b.ID=3456;
	b.EmployeeName= "Harshal Nahake";
	
	hm.put("ID1", a);
	hm.put("ID2", b);
	
	Set <String> s = hm.keySet();
	
	Iterator<String> itr = s.iterator();
	while(itr.hasNext()){
		Employee emp = hm.get(itr.next());
		System.out.println("ID = "+emp.ID);
		System.out.println("Name = "+emp.EmployeeName);
		System.out.println("------------------------------------------");
		
		}

	}
}