
abstract class EmployeeDetails{
	
	abstract void IdentityDetails(int ID, String Name);
	
	void OrganisationDetails(){
		System.out.println("Company Name =  Figmd India");
	}
}

public class AbsractDemoClass extends EmployeeDetails {
	
	public static void main(String[] args) {
		
		AbsractDemoClass a = new AbsractDemoClass();
		a.IdentityDetails(1001,"Nikhil Gayki");
		a.OrganisationDetails();
	}

	@Override
	void IdentityDetails(int ID, String Name) {
		
		System.out.println("Employee Id = "+ID);
		System.out.println("Employee Name = "+Name);
		
	}
}
