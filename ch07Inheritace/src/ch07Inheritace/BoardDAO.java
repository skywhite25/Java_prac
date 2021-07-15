/*�θ� Ŭ����
 * ���� - ���� + ��ȸ�� ����, ����, ���� : ���⼭ ����
 * ���� �ڵ� - ����Ʈ, ���� : �޼���� ������ ��Ű�� ������ �ڽ� Ŭ�������� �ϵ��� �Ѵ�.
 */

package ch07Inheritace;

//�߻� �޼��带 ������ �ִ� Ŭ���� = �߻�Ŭ����
public abstract class BoardDAO {
	
	//1.����Ʈ - ���⼭ �������� �ʰ� �ڽ� Ŭ�������� ���� �ڵ��ϵ��� �Ѵ�.
	public abstract void list(); // �������� �����Ƿ� {} �����ϰ� �߻�޼���� �����
	
	//2.�ۺ���
	  //��ȸ�� 1����
	public void increase() {
		System.out.println("BoardDAO.increas()���� �� - ��ȸ�� 1����");
	}
	  //�ۺ��� ������
	public void view() {
		System.out.println("BoardDAO.view()���� �� - �ۺ��� ������ �������� - select");
	}
	
	//3.�۾��� - ���⼭ �������� �ʰ� �ڽ� Ŭ�������� ���� �ڵ��ϵ��� �Ѵ�.
	public abstract void write();
	
	//4.�ۼ���
	public void update() {
		System.out.println("BoardDAO.update()���� �� - �ۼ���");
	}
	
	//5.�ۻ���
	public void delete() {
		System.out.println("BoardDAO.delete()���� �� - �ۻ���");
	}
}
