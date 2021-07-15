package ch07Inheritace;

public class SportsCar extends Car {
	
	
	//�⺻������ ������ �� �ۼ�
	public SportsCar() {
		//Car(); -> �޼���� �ν�, �θ� Ŭ������ ������ ȣ���� super() �̿� <-> this() �̿�
		super();
	}
	
	//�𵨰� �����縦 �ʱⰪ���� �޴� ������ �ۼ�
	public SportsCar(String model, String company) {
		super(model, company);
		//this.model=model; -> super ��ӹ��� model�� private�� �����߱� ������ ����� �� ����.
		//this.setModel(model);
	}
	
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//toString() ������ : �������̵�
	public String toString() {
		System.out.println("SoprtsCar.toString()�� ������");
		return "SprotsCar[" + super.toString() + ", type=" + type+ "]"; //type�� �� ���� �ȿ� �����߱� ������ ȣ�� �ʿ����, Car�� �ִ� toString() ȣ��
	}
	
}
