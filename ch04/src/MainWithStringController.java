import java.util.Scanner;

public class MainWithStringController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//1.�λ�
		System.out.println("�氡�氡");
		//���ѹݺ� ------ ����
		while(true) {
			//�޴� ���
			System.out.println("1.�������� 2.�Խ��� 3.�α��� 0.���α׷� ����");
			//�޴� ����
			System.out.println("�޴��� �����ϼ���.");
			String menu = scanner.nextLine();
			//�޴� ó��
			//if () else if �� �ڵ� ó��
			/*
			if(menu.equals("1"))
				System.out.println("�������� ó����. ��~~~");
			else if(menu.equals("2"))
				System.out.println("�Խ��� ó����. ��~~~");
			else if(menu.equals("3"))
				System.out.println("�α��� ó����. ��~~~");
			else if(menu.equals("0")) {
				System.out.println("���̹���");
				scanner.close();
				System.exit(0); //�����ڿ� ���� �������� -> 0						
			} else
				System.out.println("�߸��� �޴��� �����߽��ϴ�.");	
				*/
			
			
			
			//switch case�� �ڵ� 
			switch(menu) {
			case "1": //menu�� ���ڿ��̱� ������ ""�����
				System.out.println("�������� ó����. ��~~");
				break;
			case "2": //menu�� ���ڿ��̱� ������""
				System.out.println("�Խ��� ó����. ��~~");
				break;
			case "3": //menu�� ���ڿ��̱� ������""
				System.out.println("�α��� ó����. ��~~");
				break;
			case "0": //menu�� ���ڿ��̱� ������""
				System.out.println("���̹���");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("�߸��� �޴��� �Է��ϼ̽��ϴ�.");
			}//end of switch
		}
		//���ѹݺ�------��
}
}
