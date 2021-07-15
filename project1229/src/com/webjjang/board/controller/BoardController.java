package com.webjjang.board.controller;

import java.util.Scanner;

import com.webjjang.main.controller.Controller;


public class BoardController implements Controller{

	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void execute() {
		//System.out.println(getClass().getSimpleName());
		
		while(true) {
			try {
				System.out.println("----------------------------------------------------------------------");
				System.out.println("���� ��ġ�� board �Դϴ�.");
				System.out.println("----------------------------------------------------------------------");
				
				System.out.println("----------------------------------------------------------------------");
				System.out.println("1.����Ʈ 2.�ۺ���  3.�۾��� 4.�ۼ��� 5.�ۻ��� 0.�����޴�");
				System.out.println("----------------------------------------------------------------------");
				
				System.out.println("�޴��� �����ϼ��� : ");
				
				
				String menu = scanner.nextLine();
				
				switch(menu) {
				case "1":
					System.out.println("�Խ��� ����Ʈ ó��");
					break;
				case "2":
					System.out.println("�Խ��� �ۺ��� ó��");
					break;
				case "3":
					System.out.println("�Խ��� �۾��� ó��");
					break;
				case "4":
					System.out.println("�Խ��� �ۼ��� ó��");
					break;
				case "5":
					System.out.println("�Խ��� �ۻ��� ó��");
					break;
				case "0":
					return;
				default:
					System.out.println("�߸��� �޴��� �����߽��ϴ�.");
					}
				}catch(Exception e) {
					System.out.println("�Խ��� �۾� �� ������ �߻��߽��ϴ�.");
			}
			
	}
	
}
}
