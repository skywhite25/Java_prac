package com.webjjang.main.controller;

import java.util.Scanner;

import com.webjjang.board.controller.BoardController;
import com.webjjang.board.controller.QnaController;

public class MainController {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*ȯ���մϴ�.*");
		
		while(true) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("���� ��ġ�� main �Դϴ�.");
			System.out.println("----------------------------------------------------------------------");
			
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.�Խ��� 2.�����亯 0.����");
			System.out.println("----------------------------------------------------------------------");
			
			System.out.print("�޴��� �����ϼ��� : ");
			
			String menu = scanner.nextLine();
			
			switch(menu) {
			case "1": 
				System.out.println("�Խ��� ó��");
				execute(new BoardController());
				break;
			case "2":
				System.out.println("�����亯 ó��");
				execute(new QnaController());
				break;
			case "0":
				System.out.println("*���α׷��� �����մϴ�.*");
				
				System.exit(0);
			default:
				System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�.");
			}
		}
		
	}
	
	private static void execute(Controller controller) {
		System.out.println("MainController.execute(controller) ���� ��");	
		
		System.out.println(controller.getClass().getSimpleName() + ".execute() �����Ϸ� ��");
		
		controller.execute();
	}

}
