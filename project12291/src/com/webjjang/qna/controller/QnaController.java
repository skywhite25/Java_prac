package com.webjjang.qna.controller;

import java.util.Scanner;

import com.webjjang.main.controller.Controller;

public class QnaController implements Controller{

	//�����͸� �Է¹޴� Scanner ����� �ʱⰪ ����
	Scanner scanner = new Scanner(System.in);
	
	
	//�������̽����� ��ӹ��� �޼��带 �������ؼ� ����ؾ߸� �Ѵ�.
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				//����ó��
				//��ġ ���
				System.out.println("-------------------------------------------------");
				System.out.println("*���� ��ġ : main > qna.*");
				System.out.println("-------------------------------------------------");
				//�޴����
				System.out.println("-------------------------------------------------");
				System.out.println("1.����Ʈ 2.�ۺ��� 3.�����ϱ� 4.�亯�ϱ� 5.�ۼ��� 6.�ۻ��� 0.�����޴�");
				System.out.println("-------------------------------------------------");
				
				//�޴��Է� �޽��� ���
				System.out.print("�޴��� �����ϼ��� : ");
				
				//�޴��Է�
				String menu = scanner.nextLine();
				
				//�޴�ó��
				switch(menu) {		
				case "1":
					//1.����Ʈ - 1) DB���� ������ �������� 2) ������ ��� {1������ ���ܰ� �߻��ϸ� catch������ �̵��Ͽ� 2���� ������ �� �ǵ��� ó��}
					System.out.println("<<�����亯 ����Ʈ ó��>>");
					break;
				case "2":
					//2.�ۺ��� - 1) DB���� ������ �������� 2) ������ ��� {1������ ���ܰ� �߻��ϸ� catch������ �̵��Ͽ� 2���� ������ �� �ǵ��� ó��}
						System.out.println("<<�����亯 �ۺ��� ó��>>");
						break;
				case "3":
					//3.�����ϱ� - 1) DB���� ������ �������� 2) DB�� ���� {1������ ���ܰ� �߻��ϸ� catch������ �̵��Ͽ� 2���� ������ �� �ǵ��� ó��}
						System.out.println("<<�����亯 �����ϱ� ó��>>");
						break;
				case "4":
					//4.�亯�ϱ� - 1) DB���� ������ �������� 2) ������ ��� 3)���� 4)DB�� ��������
						System.out.println("<<�����亯 �亯�ϱ� ó��>>");
						break;
				case "5":
					//5.���� - 1) DB���� ������ �������� 2) DB�� ����
						System.out.println("<<�����亯 �ۼ��� ó��>>");
						break;
				case "6":
					//���� - 1) DB���� ������ �������� 2) DB�� ����
					System.out.println("<<�����亯 �ۻ��� ó��>>");
					break;
				case "0":
					//ȣ���� ������ ���ư���.
					return;
				default:
					System.out.println("<<�߸��� �޴��� �����ϼ̽��ϴ�.>>");
				
				}
				
			}catch(Exception e) {
				//����ó��
				//�����ڸ� ���� �ڵ�
				e.printStackTrace();
				//����ڸ� ���� �ڵ�
				System.out.println("<<�Խ��� ó�� �� ������ �߻��߽��ϴ�.>>");
			}
		}
		
		
	}

}
