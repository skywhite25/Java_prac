import java.util.Scanner;

public class NoticeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Է� ��ü �ҷ��´�. - ��ü ���� - new
		Scanner scanner = new Scanner(System.in);
		
		//1.ȯ�� �λ� - �������׿� ������.
		System.out.println("�������׿� �����̽��ϴ�.");
		
		//���ѹݺ� - while
		while(true) {
			//2.��ġ ��� -"/��������
			System.out.println("\\��������");
			//3.�޴����
				//1.����Ʈ 2.�۾��� 3.�ۺ���
				//4.�ۼ��� 5.�ۻ��� 0.���� - ���� ���� ����
			System.out.println("1.����Ʈ 2.�۾��� 3.�ۺ���");
			System.out.println("4.�ۼ��� 5.�ۻ��� 0.����");
			//4.�޴��Է¸޽���
			System.out.println("�޴� �Է� --> ");
			//5.�޴��Է�
			String data = scanner.nextLine();
			//6.�Է��� �޴� ó�� ��ġ�� - switch()
			int menu = Integer.parseInt(data);
			switch(menu) {
			case 1:
				System.out.println("�������� ����Ʈ ó����....��");
				break;
			case 2:
				System.out.println("�������� �۾��� ó����....��");
				break;
			case 3:
				System.out.println("�������� �ۺ��� ó����....��");
				break;
			case 4:
				System.out.println("�������� �ۼ��� ó����....��");
				break;
			case 5:
				System.out.println("�������� ����Ʈ ó����....��");
				break;
			case 6:
				System.out.println("�������� �ۻ��� ó����....��");
				break;
			case 0:
				System.out.println("���α׷� ����");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("�޴��� �߸� ����");
			}//end of switch
		}
	}

}
