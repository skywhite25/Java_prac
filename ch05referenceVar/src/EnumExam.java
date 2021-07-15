import java.util.Calendar;

public class EnumExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String week = "";
		week = "Monday";
		System.out.println("������ ����:" + week);
		week = "MON";
		System.out.println("������ ����:" + week);
		
		Week today = Week.TUESDAY;
		System.out.println("������ ����:" + today);
		
		//ordinal -> ���� : 0���� ������ ����
		System.out.println("TUESDAY�� ����:" + today.ordinal());
		today = Week.SUNDAY;
		System.out.println("SUNDAY�� ����:" + today.ordinal());
		//compareTo(enum ��) -> ���� enum�� ���� ������
		System.out.println(today.compareTo(Week.SUNDAY));
		
		
		//calendar�� �̿��� ö
		//���� ��¥ ����
		//Calendar.getInstance() -> new�� ���ִ� ó���� �Ѵ�.
		//Ŭ���� : ���డ���� �ڵ尡 �ϵ��ũ�� ����Ǿ� �ִ� ��
		//Ŭ������ ���θ޸�(RAM)�� �ø��� ���� �����̶�� ��.
		//�����Ǿ��� �޸𸮿� ���۰����� ���� ��ü��� ��.
		//Ŭ������ ���� ����� �۾��� �ν��Ͻ�ȭ.
		//Ŭ������ ������ ���� ����� ���� ��(������ ����)�� �ν��Ͻ���� �Ѵ�.
		//�ν��Ͻ� == ��ü
		//Calendar - ��¥ ������ ������ �ִ� ��ü
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		//�⵵�� ����� ����
		System.out.println(now.get(1));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(Calendar.HOUR_OF_DAY);
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
	}

}
