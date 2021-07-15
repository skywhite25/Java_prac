package ch08Interface;

public interface CalcuInterface {

	//�ܼ� 4Ģ���� �޼��� �����
	public abstract int add(int x, int y); //��� abstract �̹Ƿ� interface�� abstract�� ����ص� �ǰ� ������� �ʾƵ� �ȴ�.
	public int sub(int x, int y);
	//default �޼��� : �ڹ� 8���� ������ ����, adeptor ���α׷����� �⺻ �޼���� �����ϴ� ���� ���ĳ��� ��
	//��ӹ��� �ڽ� Ŭ�������� �������Ͽ� ����ϸ� �������� ���� ����ϰ� �ƴϸ� �⺻ �޼���(default)�� ���
	public default int mul(int x, int y) {
		return 0;
	};
	public int div(int x, int y);
	
	//�հ�� ����� ���ϴ� �޼��� �� �� �����
	public int sum(int[] scores);
	public int avg(int sum, int cnt);
}
