package ch07Inheritace;

public class Car {
	
	private String model;
	private String company;
	
	//������ �����
	//�⺻ ������
	public Car() {
	}
	//������ �ʱ�ȭ�ϴ� ������
	public Car (String model, String company) {
		this.model = model;
		this.company = company;
	}
	
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
	
	public String toString() {
		System.out.println("Car.toString() ������");
		return "model=" + model + ", company=" + company;
	}
}
