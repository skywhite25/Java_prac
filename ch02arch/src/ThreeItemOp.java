import java.util.Scanner;

public class ThreeItemOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//���ڸ� �Է¹޴´�.
		System.out.println("������ �Է��ϼ��� : ");
		String data = scanner.nextLine();
		int score = Integer.parseInt(data);
		//60�� �̻��̸� �հ�, �̸��̸� ���հ� ���
		//�⺻ if(����) ~; else ó����; �� ���
		if(score >= 60)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
		
		//���׿����� = ���� ������ -> ����� ���;� �Ѵ�.
		//(����)?true�� ó��:false�� ó��
		//(score >= 60)? System.out.println("�հ�"):System.out.println("���հ�");
		System.out.println((score >= 60)?"�հ�":"���հ�");
		String result = (score >= 60)?"�հ�":"���հ�";
		System.out.println(result);
		scanner.close();	}//end of main

}
