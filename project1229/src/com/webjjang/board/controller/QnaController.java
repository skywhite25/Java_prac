package com.webjjang.board.controller;

import java.util.Scanner;

import com.webjjang.main.controller.Controller;

public class QnaController implements Controller{

	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		while(true) {
			try {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("���� ��ġ�� Qna �Դϴ�.");
			System.out.println("----------------------------------------------------------------------");
			
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.����Ʈ 2.�ۺ���  3.�����ϱ� 4.�亯�ϱ� 5.�ۻ��� 0.�����޴�");
			System.out.println("----------------------------------------------------------------------");
			
			System.out.println("�޴��� �����ϼ��� : ");
			
			String menu = scanner.nextLine();
			switch(menu) {
			
			case "1":
				System.out.println("�����亯 ����Ʈ ó��");
				break;
			case "2":
				System.out.println("�����亯 �ۺ��� ó��");
				break;
			case "3":
				System.out.println("�����亯 �����ϱ� ó��");
				break;
			case "4":
				System.out.println("�����亯 �亯�ϱ� ó��");
				break;
			case "5":
				System.out.println("�����亯 �ۻ��� ó��");
				break;
			case "0":
				return;
			default:
				System.out.println("�߸��� �޴��� �����߽��ϴ�.");
				}
			} catch(Exception e) {
				System.out.println("�������� �۾� �� ������ �߻��Ǿ����ϴ�.");
			}
		}
		
	
	}
	
	
}

