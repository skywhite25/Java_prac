/*
/ * ����Ŭ DB�� �´� ���α׷� �ۼ�
 * list�� write�� �ۼ��ϰ� �������� ��ӹޱ�.
 * �θ� Ŭ��������  list()�� write()�� �߻����� ������� ������ �ݵ�� �������ؼ� ������ �ؾ� ������ ��������.
 */

package ch07Inheritace;

public class MySQLBoardDAO extends BoardDAO{

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("MySQLBoardDAO.list() - MySQL�� �Խ��� ����Ʈ �ۼ�");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("MySQLBoardDAO.write() - MySQL�� �Խ��� �۾��� �ۼ�");
	}
	
}
