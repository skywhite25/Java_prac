package ch07Inheritace;

public class Car2 {
	
	private String model;
	private String company;
	
	//getter()�� setter()
	public String getModel() { //model�� ���� getter()
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getCompany() { //company�� ���� getter()
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void start() {
		System.out.println("����Ѵ�.");
	}
	
	public void stop() {
		System.out.println("�����.");
	}
}
