
public class Object1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Object1Test.main() - ����");
		Object1 obj1;
		try {
			//Ŭ������ ������ �����ϴ��� Ȯ���ϴ� �ڵ� - ���翩�θ� Ȯ���ϴ� ���� �ƴ϶� static �ʱ�ȭ ����� ���� �Ǵ� �޸𸮿� �ö󰣴�.
			Class.forName("Object1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		obj1 = new Object1();
		
		System.out.println("�⺻�����ڸ� �̿��� obj1[main���� ���]: " + obj1);
		//���� ����
		obj1.setAge(40);
		System.out.println("���̸� 40���� ������ obj1[main���� ���]: " + obj1);
		
		int age = 30;
		String name = "ȫ�浿";
		Object1 obj2 = new Object1(age, name);
		
		System.out.println("���̿� �̸��� ���޹��� ������ obj2[main���� ���]: " + obj2);
	}
	
}
