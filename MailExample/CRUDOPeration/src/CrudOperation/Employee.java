package CrudOperation;

public class Employee {

	private int eId;
	 private String eName;
	 private String DesigNation;
	 private float eSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDesigNation() {
		return DesigNation;
	}
	public Employee(String eName, String desigNation, float eSalary) {
		super();
		this.eName = eName;
		DesigNation = desigNation;
		this.eSalary = eSalary;
	}
	public Employee(int eId, String eName, String desigNation, float eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		DesigNation = desigNation;
		this.eSalary = eSalary;
	}
	public void setDesigNation(String desigNation) {
		DesigNation = desigNation;
	}
	public float geteSalary() {
		return eSalary;
	}
	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}

	}
