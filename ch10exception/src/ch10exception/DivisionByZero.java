package ch10exception;

import java.util.Scanner;

public class DivisionByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String data = null; //���� �߰� �ּҰ� ���� ������ �ʱ�ȭ
		
		//������ ó���� ���������� ���� ������ ���� �ݺ�
		while(true) {
		//�������� ó���� �ǵ��� ���� ó��		
			try{
				//����ó��
				//2���� ���ڸ� �Է��ϼ���
				System.out.println("ù��° ���ڸ� �Է��ϼ���.");
				data = scanner.nextLine();
				int a = Integer.parseInt(data);
				System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
				data = scanner.nextLine();
				int b = Integer.parseInt(data);
				//���� ���ڸ� �ڿ� ���ڷ� ���� ��� ���
				System.out.println("ù��° ����" + a + "/" + "�ι�° ����" + b + "=" +(a/b));
				break;
			}catch(ArithmeticException e) {
				//����ó��
				//�����ڸ� ���� ���� ��� - ������ �Ϸ�Ǹ� �ּ�ó��
				//e.printStackTrace();
				//����ڸ� ���� ���� ���
				System.out.println("�� ��° ���ڴ� 0�� �Է��Ͻø� �ȵ˴ϴ�.");
			}finally {
				System.out.println("������ó��(�ݵ�� ����):try~catch~finally");
			}
			
		}//end of while
		scanner.close();
		System.out.println("���α׷� ����");
	}

}
