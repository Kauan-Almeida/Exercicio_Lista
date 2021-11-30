package entities;

public class Empresa {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Empresa() {
	}
	public Empresa(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	
	public void newSalary(double amount) {
		salary += salary * amount  /100.0;
	}
	@Override
	public String toString() {
		return id
			+ ", "	
			+name
			+ ", "
			+ String.format("%.2f", salary);
	}
}