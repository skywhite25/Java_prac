package com.webjjang.board.controller;

import java.util.Scanner;

import com.webjjang.main.controller.Controller;

public class BoardController implements Controller{

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
				System.out.println("*���� ��ġ : main > board.*");
				System.out.println("-------------------------------------------------");
				//�޴����
				System.out.println("-------------------------------------------------");
				System.out.println("1.����Ʈ 2.�ۺ��� 3.�۾��� 4.�ۼ��� 5.�ۻ��� 0.�����޴�");
				System.out.println("-------------------------------------------------");
				
				//�޴��Է� �޽��� ���
				System.out.print("�޴��� �����ϼ��� : ");
				
				//�޴��Է�
				String menu = scanner.nextLine();
				
				//�޴�ó��
				switch(menu) {		
				case "1":
					//1.����Ʈ - 1) DB���� ������ �������� 2) ������ ��� {1������ ���ܰ� �߻��ϸ� catch������ �̵��Ͽ� 2���� ������ �� �ǵ��� ó��}
					System.out.println("<<�Խ��� ����Ʈ ó��>>");
					break;
				case "2":
					//2.�ۺ��� - 1) DB���� ������ �������� 2) ������ ��� {1������ ���ܰ� �߻��ϸ� catch������ �̵��Ͽ� 2���� ������ �� �ǵ��� ó��}
						System.out.println("<<�Խ��� �ۺ��� ó��>>");
						break;
				case "3":
					//3.�۾��� - 1) DB���� ������ �������� 2) DB�� ���� {1������ ���ܰ� �߻��ϸ� catch������ �̵��Ͽ� 2���� ������ �� �ǵ��� ó��}
						System.out.println("<<�Խ��� �۾��� ó��>>");
						break;
				case "4":
					//4.�ۼ��� - 1) DB���� ������ �������� 2) ������ ��� 3)���� 4)DB�� ��������
						System.out.println("<<�Խ��� �ۼ��� ó��>>");
						break;
				case "5":
					//�ۻ��� - 1) DB���� ������ �������� 2) DB�� ����
						System.out.println("<<�Խ��� �ۻ��� ó��>>");
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
