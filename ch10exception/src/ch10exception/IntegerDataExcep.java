package ch10exception;

import java.util.Scanner;

public class IntegerDataExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//����ó��
		// ���� �����͸� �ϳ� �޾Ƽ� ����ϴ� ���α׷� �ۼ� - ����ó��				
		// ���� ���
		try {
			// ���� ������ �ϳ��� ���ڿ��� �Է¹ް� 
			System.out.println("���ڸ� �Է��ϼ���.");
			String data = scanner.nextLine();
			// ���ڷ� ��ȯ�Ѵ�.
			int a = Integer.parseInt(data);
			System.out.println(a);		
			// ���� �����Ͱ� �ƴմϴ�. ����Ѵ�.
		}catch(NumberFormatException e) {
			//����ó��
			//�����ڸ� ���ϳ� ���� ���� ���
			e.printStackTrace();
			System.out.println("���� �����Ͱ� �ƴմϴ�.");
		}
		
		
		scanner.close();
		
	}

}
