
public class OverloadCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2���� �����͸� ���ϴ� �޼��带 �ۼ�
		//add()
		
		//�Ʒ� �޼������ ����Ϸ��� ��ü�� �����ؾ��Ѵ�.
		OverloadCalcu oc = new OverloadCalcu();
		//add(10, 20) - int ���ϱ����� int, add(2.3, 4.5)-double ���ϱ����� double,
		// add("�ڹ�", "¯") -���ڿ� �̾� ���̱����� string
		//int ������ �ϴ� add()
		System.out.println(oc.add(10,  20)); //��ȣ ���� ���� ���� -> �� �޼���� ���� ����ϰ� ��� -> println ����
		System.out.println(oc.add(2.3,  4.5));
		System.out.println(oc.add("java",  "jjang"));
		System.out.println(oc.add(10,  20.0)); //10�� int, double�� �� ���Եǰ� 20.0�� double�̹Ƿ� double�� ���(int < double)
		System.out.println(oc.add("" + 10,  "java"));//10�� ���ڿ��� �ٲٱ�. (""+����) �� �ٲٸ� ���ڰ� ���ڿ��� ��ȯ��
		
		//������ ���� ���길 �����ϵ��� �ڵ��� �ϰ� �ִ�.
		//Overload�� ����ϸ� �������� � ���� ������ ���� ������ �� �� �ִ�.
		//�Ʒ��� ���� ��� �� ������ ���� ���� Ʋ���� ���´�.�׷��� �̷� ���� Overload�� �̿��� �ͺ��� �޼��� �̸��� �ٸ��� �ϴ� ���� �����Ѵ�.
		//int ������ ���� addInt(), double ������ ���� addDouble()�� ����� ���� �����Ѵ�.
		System.out.println((int)oc.add(2.7,  4.5)); //�Է��� ���ڴ� double�̶� double�޼��忡�� ��������� ����� int�� ����Ѵ�.
		System.out.println(oc.add((int)2.7,  (int)4.5)); //���ʿ� ���ڸ� int�� ��ȯ�Ͽ��� ������ int �޼��忡�� ����Ѵ�.
	}	
	
	//�̰� ������ ������ �޼������ �����.
	public int add(int x, int y) {
		System.out.println("int ���� ����: ");
		return x + y; 
	}
	public double add(double x, double y) {
		System.out.println("double ���� ����: ");
		return x + y;
	}
	public String add(String x, String y) {
		System.out.println("String ���� ����: ");
			return x + y;
	}
}
