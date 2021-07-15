package com.webjjang.main.controller;

import java.util.Scanner;

import com.webjjang.board.controller.BoardController;
import com.webjjang.qna.controller.QnaController;

public class MainController {

	//main�޼��忡�� ����ϴ� Scanner�̹Ƿ� static
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ȯ���λ�
		System.out.println("=================================================");
		System.out.println("*ȯ���մϴ�.*");
		System.out.println("=================================================");

		//���� �޴��� ���ѷ���
		while(true) {
			//��ġ���
			System.out.println("-------------------------------------------------");
			System.out.println("*���� ��ġ : main.*");
			System.out.println("-------------------------------------------------");
			
			//�޴����
			System.out.println("-------------------------------------------------");
			System.out.println("1.�Խ��� 2.�����亯 0.����");
			System.out.println("-------------------------------------------------");
			
			//�޴��Է� �޽��� ���
			System.out.print("�޴��� �����ϼ��� : ");
			
			//�޴��Է�
			String menu = scanner.nextLine();
			
			//�޴�ó��
			switch(menu) {
			case "1":
				System.out.println("<<�Խ��� ó��>>");
				//������ BoardController�� �ּҸ� �Ʒ��� ���� �޼���(execute())�� �������ش�.
				execute(new BoardController()); //�Է� �� ctrl+space ������
				break;
			case "2":
				System.out.println("<<�����亯 ó��>>");
				execute(new QnaController());
				break;
			case "0":
				System.out.println("*���α׷��� �����մϴ�.*");
				System.exit(0);
				break;
			default:
				System.out.println("<<�߸��� �޴��� �����ϼ̽��ϴ�.>>");
			} //end of switch()
			
		} //end of while()
	} //end of main()

	//Controller�� �����ϴ� �޼��� �ۼ� -> Controller ��ü(�ּ�)�� �޾Ƽ� �����ϴ� �޼���
	private static void execute(Controller controller) {
		//����Ǵ� ��ġ ���
		System.out.println("MainController.execte() ���� ��");
		//���޹��� ��ü�� Ŭ���� �̸��� �����ϴ� �޼��� ���
		System.out.println(controller.getClass().getSimpleName() + "execute() ���� ����");
		//���޹��� ��ü�� ���� - �޼��带 ȣ���ؼ� ����
		controller.execute();
		
		
	}
	
}
