/*
 * ����Ŭ DB�� �´� ���α׷� �ۼ�
 * list�� write�� �ۼ��ϸ� �ǰ� �������� ��ӹޱ�.
 * �θ� Ŭ��������  list()�� write()�� �߻����� ������� ������ �ݵ�� �������ؼ� ������ �ؾ� ������ ��������.
 */

package ch07Inheritace;

public class OracleBoardDAO extends BoardDAO{

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("OracleBoardDAO.list() - ����Ŭ�� �Խ��� ����Ʈ �ۼ�");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("OracleBoardDAO.write() - ����Ŭ�� �Խ��� �۾��� �ۼ�");
	}
	
}
