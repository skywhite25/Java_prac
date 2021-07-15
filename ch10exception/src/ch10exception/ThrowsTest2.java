package ch10exception;

import java.util.Scanner;

public class ThrowsTest2 {
	
	static Scanner scanner = new Scanner(System.in);
	
	static int a, b; //���������� ����, ��� �޼��忡 ��� ����
	
	public static void main(String[] args) {
		
		try {
			//����ó��
			//1.�����͸� �޴´�.
			inData(); //a, b �����Ͱ� ���õ�
			
			//2.������ ������ �Ѵ�.
			int result = divOp(); //divOp()�� ���� ����� �� ����� ���ϵ�
		
			//3.����� ����Ѵ�.
			print(result);
			/*}catch(NumberFormatException e) {
				//����ó��
				System.out.println("���ڸ� �Է��ϼ���.");
			}catch(ArithmeticException e) {
				//����ó��
				System.out.println("�ι�° ���ڴ� 0�� �ƴϾ�߸� �մϴ�. ��� ���ڴ� 0���� ���� �� �����ϴ�.");
				*/
			}catch(Exception e) {
				System.out.println("������ ���� ���� �� ������ �߻��Ǿ����ϴ�.");
			}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	//�����͸� �Է¹޴� �޼���(����ϴϱ� void)
	static void inData() throws NumberFormatException {
		//ù��° ������ �ޱ�
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		String data = scanner.nextLine();
		a = Integer.parseInt(data);
		
		//�ι�° ������ �ޱ�
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		data = scanner.nextLine();
		b = Integer.parseInt(data);
		}
	
	
	//�����⸦ �����ϴ� �޼���
	static int divOp() throws ArithmeticException{
			return a / b;	
	}
	
	//����� ����ϴ� �޼���
	static void print(int result) throws Exception{
		System.out.println(a + " / " + b + " = " + result);
	}
	
}
