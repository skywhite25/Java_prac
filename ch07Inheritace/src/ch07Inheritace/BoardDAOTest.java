package ch07Inheritace;

public class BoardDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�߻�Ŭ������ ���������Ѱ�? => ���� �����ϳ� list�� write �߻�޼���鿡 ���� ������ ���� �ؾ߸� �Ѵ�.
		BoardDAO dao1 = new BoardDAO() {
			
			@Override
			public void write() {
				// TODO Auto-generated method stub
				System.out.println("�߻�Ŭ������ �߻�޼��� write() ��������");
				
			}
			
			@Override
			public void list() {
				// TODO Auto-generated method stub
				System.out.println("�߻�Ŭ������ �߻�޼��� list() ��������");

			}
		};
		dao1.write();
		dao1.view();
		
		OracleBoardDAO odao = new OracleBoardDAO();
		odao.list(); //��µ�
		MySQLBoardDAO mdao = new MySQLBoardDAO();
		mdao.list(); //��µ�
		
		//����Ŭ���� ó���Ǵ� ����Ʈ
		execute(odao, 1); //��µ�
		//MySQL���� ó���Ǵ� ����Ʈ
		execute(mdao, 1); //��µ�
		
	}
	
	public  static void execute(BoardDAO dao, int menu) { //�θ�Ŭ�����̹Ƿ� �ڵ�ĳ����
		switch(menu) {
		case 1:
			dao.list();
			break;
		case 2:
			dao.increase(); //��ȸ�� ����
			dao.view();
			break;
		case 3:
			dao.write();
			break;
		case 4:
			dao.update();
			break;
		case 5:
			dao.delete();
			break;
		default:
			System.out.println("BoardDAOTest.execute() ���� �� - ó�� ���� ��ȣ�� �ƴմϴ�.");
		}
	}

}
