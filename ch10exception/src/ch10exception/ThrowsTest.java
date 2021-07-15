package ch10exception;

import java.util.Scanner;

public class ThrowsTest {
	
	static Scanner scanner = new Scanner(System.in);
	
	static int a, b; //���������� ����, ��� �޼��忡 ��� ����
	
	public static void main(String[] args) {
		
		//1.�����͸� �޴´�.
		inData(); //a, b �����Ͱ� ���õ�
		
		//2.������ ������ �Ѵ�.
		int result = divOp(); //divOp()�� ���� ����� �� ����� ���ϵ�
		
		//3.����� ����Ѵ�.
		print(result);
	}
	
	//�����͸� �Է¹޴� �޼���(����ϴϱ� void)
	static void inData() {
		try {
			//����ó��	
		//ù��° ������ �ޱ�
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		String data = scanner.nextLine();
		a = Integer.parseInt(data);
		
		//�ι�° ������ �ޱ�
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		data = scanner.nextLine();
		b = Integer.parseInt(data);
		} catch(NumberFormatException e) {
			//����ó��
			//�����ڸ� ���� �ڵ�
			//e.printStackTrace();
			//����ڸ� ���� �ڵ�
			System.out.println("���ڸ� �Է��ϼ���.");
			
		}
	}
	
	//�����⸦ �����ϴ� �޼���
	static int divOp() {
		try {
			//����ó��
			return a / b;
		} catch(ArithmeticException e) {
			//����ó��
			//�����ڸ� ���� �ڵ�
			//e.printStackTrace();
			//����ڸ� ���� �ڵ�
			System.out.println("���� 0���δ� ���� �� �����ϴ�.");
			return -9999;
		}
		
	}
	
	//����� ����ϴ� �޼���
	static void print(int result) {
		System.out.println(a + " / " + b + " = " + result);
	}
	
}
