
public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton st1 = Singleton.getInstance(); //�ּҸ� �޾ƿ´�.
		Singleton st2 = Singleton.getInstance();
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1 == st2); //�ּҰ� ��
	}

}
