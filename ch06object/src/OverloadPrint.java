//�� �ڵ� ���ΰ� op
public class OverloadPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "�迹��";
		int age = 23;
		OverloadPrint op = new OverloadPrint();
		op.print(name);
		op.print(age);
	}

	//���� �̸��� �Ķ���� ������ ������ �Ķ������ Ÿ���� Ʋ���� overload �����ش�.
	//�����͸� �����ؼ� ����Ѵ�
	public void print(String str) { //���ڿ� str�� �޾Ƽ�
		System.out.println("���ڿ� ��� : " + str); //���
	}
	
	//���� �̸��� �Ķ���� ������ ������ �Ķ������ Ÿ���� Ʋ���� overload �����ش�.
	//�����͸� �����ؼ� ����Ѵ�.
	public void print(int x) { //������ x�� �޾Ƽ�
		System.out.println("int ��� : " + x); //���
	}
}
