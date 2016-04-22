 class encapsulationex{
	private String empname;
	private int salary;
	private int empid;

	public int getEmpSalary(){
		return salary;
	}


	public String getEmpName(){
		return empname;
	}


	public int getEmpId(){
		return empid;
	}

	public void setEmpsalary(int newsalary){
		salary=newsalary;

	}


	public void setEmpid(int newId){
		empid=newId;

	}

	public void setEmpName(String newname){
		empname=newname;

	}
} 

public class assignment3{
	public static void main(String[] args){
		encapsulationex obj=new encapsulationex();
		obj.setEmpName("Neeraj Mishra");
		obj.setEmpid(2821);
		obj.setEmpsalary(1000);
		System.out.println("Employee Id:- "+ obj.getEmpId());
		System.out.println("Employee name:- "+ obj.getEmpName());
		System.out.println("Employee salary:- "+ obj.getEmpSalary());
	}
}