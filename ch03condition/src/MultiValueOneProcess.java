import java.util.Scanner;

public class MultiValueOneProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//���� ������ �ޱ�
		System.out.println("���� �Է��ϼ���");
		String data = scanner.nextLine();
		int month = Integer.parseInt(data);
		
		//3,4,5:��, 6,7,8:����, 9,10,11:����, �׿�:�Է¿���
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("������ ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("������ �ܿ��Դϴ�.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("������ �����Դϴ�.");
			break;
		default :
			System.out.println("�߸��� �����͸� �Է��ϼ̽��ϴ�.");
		}
		scanner.close();   
	}

}
