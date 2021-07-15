package ch10exception;

import java.util.Scanner;

public class ScoreInputPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//���� �Է�
		int score = 0;
		//���ڰ� �ƴϸ� ���ѹݺ��Ѵ�. -���ܰ� �߻��ߴ� -> catch�� ����.
		while(true) {
		//�Է��� �����Ͱ� ���ڰ� �ƴϸ� "���ڰ� �ƴմϴ�." ��� -> ���α׷� ����
			try {
				//����ó�� �õ�
				System.out.println("������ �Է��ϼ���");
				String data = scanner.nextLine();
				score = Integer.parseInt(data);
				break; // �������� �����Ͱ� ������ while�� ��������
			}catch(NumberFormatException e) { 
				//����ó�� - NumberFormatException
				//�����ڸ� ���� �޽���
				//e.printStackTrace();
				//����ڿ��� �����ִ� �޽���
				System.out.println("���ڸ� �Է��ϼž߸� �մϴ�.");
			}finally {
				System.out.println("������ ó��(�ݵ�� ����):try~catch~finally");
			}//end of try~catch~finally
			
		}//end of while
		
		//60�� �̻��̸� �հ� �ƴϸ� ���հ�
		if(score >= 60)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
		
		System.out.println("���α׷� ����");
		scanner.close();
	}

}
