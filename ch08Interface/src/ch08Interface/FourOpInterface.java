package ch08Interface;

public interface FourOpInterface {
	
	//�ܼ� 4Ģ���� �޼��� �����
		public abstract int add(int x, int y); //��� abstract �̹Ƿ� interface�� abstract�� ����ص� �ǰ� ������� �ʾƵ� �ȴ�.
		public int sub(int x, int y);
		//default �޼��� : �ڹ� 8���� ������ ����, adeptor ���α׷����� �⺻ �޼���� �����ϴ� ���� ���ĳ��� ��
		//��ӹ��� �ڽ� Ŭ�������� �������Ͽ� ����ϸ� �������� ���� ����ϰ� �ƴϸ� �⺻ �޼���(default)�� ���
		public int mul(int x, int y);
		public int div(int x, int y);
		
}
