
public class Singleton {
	//2.�����ؼ� �����صд�.
	private static Singleton singleton = new Singleton();
	
	//1.prinvate-���� Ŭ���������� ���� ����
	private Singleton() {
		
	}
	
	//3.�ٸ� ������ ��(�ּ�)�� ������ �� �ִ� �޼��带 �����.
	public static Singleton getInstance() {
		return singleton;
	}
}
