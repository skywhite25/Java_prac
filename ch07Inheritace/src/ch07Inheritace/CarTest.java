package ch07Inheritace;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.��ӹ��� ���� ����� �� �ִ�.
		//  -�ڽ� Ŭ���� ����
		SportsCar sc = new SportsCar();
		String model = "��Ÿ��";
		sc.setModel(model);
		System.out.println(sc.getModel());
		
		//  -�ڽ� Ŭ������ ����(�ʱⰪ�� ����)
		String company = "����";
		SportsCar sc1 = new SportsCar(model, company);
		//sc1�� ������ �ִ� toString()�� ȣ���ؼ� ���ڿ��� �޾� ó���Ѵ�.
		System.out.println(sc1);
		
		Car c1 = new Car();
		System.out.println(c1.getCompany());
		
		Car c2 = new SportsCar(); //�ڵ�ĳ����(�θ� Ŭ������ �� ū ������ ������ �ֱ� ������ ����)
		//System.out.println(c2.getType); -> Car Ÿ�Կ��� type�̶�� ������Ƽ ��ü�� ��� ����.
		System.out.println(((SportsCar)c2).getType()); //c2�� SportsCar�� ����ĳ����. Car Ÿ�Կ� SportsCar �����ؼ� �־����� �Ѵ�.
		//���� ĳ������ �̿��ؼ� type ������Ƽ�� ����ϰڴٰ� �����ؾ� SportsCar�� �ִ� type ������Ƽ����� ����.
	}

}
