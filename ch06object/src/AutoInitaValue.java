
public class AutoInitaValue {

	//��ġ �� : ���� ���� => Ŭ���� �ȿ� �ִ� �ʵ�=�׸�=�Ӽ� => ��ü�� ������ �ִ� ���� : ��ü����
	//�ʱⰪ�� �������� ���� => �⺻������ �ڵ� ���õȴ�.
		static int a;
		static boolean b;
		static String str;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���� ���� ��� : int - " + a + ", boolean - " + b + ", String - " + str);	
		
		
		//main �ȿ����� ������ �Ǵ� ��������
		//�ʱⰪ�� �������� ����  => �ڵ� �ʱ�ȭ�������� �ʴ´�. �������鼭 �ʱⰪ�� ������� �Ѵ�
		//=> �� �������� ����Ϸ��� ���������� �ʱⰪ�� �����Ͽ��߸��� ����� �� �ִ�.
		int a2 = 0;
		boolean b2 = false;
		String str2 = null;
		
		System.out.println("���� ���� ��� : int - " + a2 + ", boolean - " + b2 + ", String - " + str2);
	}

}
