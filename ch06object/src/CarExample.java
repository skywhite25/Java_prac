
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//class Car�� ����ؾ� �Ѵ�. ->���� ->ȣ��
		//new : ��ü ����
		//new �ڿ� �ִ� Car() -> ������(������ �� ����ϴ� ��)
		Car myCar = new Car();
		System.out.println(myCar);
		
		//���� ���
		System.out.println(myCar.model);
		myCar.model = "��Ÿ��";
		System.out.println(myCar.model);
		//print()�� ȣ�� -> �� �޼���� ���� �����ϰ� �ٽ� ���ƿ´�.
		myCar.print();
		System.out.println("�ٽ� ����� main()�Դϴ�.");
	}

}
