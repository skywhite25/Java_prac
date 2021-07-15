package ch15collection;

import java.util.ArrayList;
import java.util.List;

//Collection���� List�� ��ӹ��� ArratList : ������ ���� - �迭�� �(�˻��� ���� ����, �����Ͱ� ���� ������ �Ǹ� �������� ����)
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//13�� ���׸� : ���� ���(����)�� Ÿ���� �ۿ��� �����ؼ� �� Ÿ�Կ� �´� �͸� ������ �� �ֵ��� ���� Ÿ�Կ� ���� �ڵ带 ����� �ִ� ��
		//��� �����͸� ���� �����ϰ� �ϴ� Object
		//List<'�迭�� �� Ÿ��'>
		List<Object> list = new ArrayList<>();   //import�� �ؾ��Ѵ�->ctrl+space(List�� ArrayList �� ��)
		
		//list�� ���� ������ ������ ����.
		list.add("�迹��"); //String -> Object : Object�� ��ӹ޾ұ� ������ �ڵ�ĳ����(String<Object)
		//int�� ����Ŭ���� : Integer - int �� �ȿ� ������ �����鼭 ó���� �����ϰ� �ϴ� Ŭ����
		//int <=> Integer - ĳ���� ���� ��� ����. �ڽ�, ��ڽ��� �ڵ����� �̷�� ����.(����ڽ�, �����ڽ�)
		int x = 23;
		Integer xi = x; //����ڽ�, int -> Integer����
		x = xi; //�����ڽ�, Integer -> int
		list.add(xi);
		list.add(23); //int -> Integer -> Object
		
		boolean gender = true;
		Boolean genderB = gender; //����ڽ�, gender�� �����ͼ� gender��� Ŭ������ ��������.
		list.add(genderB);
		list.add(gender); //boolean -> Boolean -> Object
		
		System.out.println(list);
		
		
		
		//���ڿ��� ������ �� �ִ� list
		List<String> stringList = new ArrayList<>();
		stringList.add("����");
		//stringList.add(10);  => stringList�� String�� ������ �� �ֵ��� ���׸��߱� ������ ���ڸ� ������ ������ ����.
			
		//int�� ������ �� �ִ� list
		//List<int> intList = new ArrayList<E>();  => list��ü�� Object�� ���, ������ �� Object�� �ƴ� int�� �� �� ����.
		List<Integer> intList = new ArrayList<>();
		intList.add(10); // 10 : int -> Integer�� �ڵ�ĳ����
		
		//BoardVO�� ������ �� �ִ� list
		//list �ȿ� �ƹ��ų� �־������ �����͸� ������ ����� �Ϸ��� �ϸ� 
		List<BoardVO> boardList = new ArrayList<>();
		BoardVO vo1 = new BoardVO();
		vo1.setNo(100);
		boardList.add(vo1);
		//boardList.add("�迹��"); //BoardVOo �����Ͱ� �ƴϸ� ������ ����.
		boardList.add(new BoardVO()); //no�� �⺻ �ʱⰪ�� 0�� ����.
		System.out.println(boardList);
		System.out.println(boardList.size());
		
		//�����͸� �� ���� ������ ����ϴ� ���α׷� �ۼ�
		for(int i = 0; i < boardList.size(); i++) {
			//��ü�� ��µȴ�.
			System.out.println(boardList.get(i));
			//��ü �ȿ� �ִ� no ���
			System.out.println(boardList.get(i).getNo());
		}
		
		//�ּҸ� �����ͼ� ������ �����ϸ� ������ ���� �ּҸ� ã�ư��� ���� �ּ��̹Ƿ� ����� �������� ����� �ȴ�.
		boardList.get(1).setNo(500); //1��° �ּҸ� ���� ����Ǿ��ִ� ���� �ٲ۴�.
		//�����͸� �� ���� ������ ����ϴ� ���α׷� �ۼ�
		for(int i = 0; i < boardList.size(); i++) {
			//��ü�� ��µȴ�.
			System.out.println(boardList.get(i));
			//��ü �ȿ� �ִ� no ���
			System.out.println(boardList.get(i).getNo());
				}
		
		//���������δ� ������ ��� �����͸� ������� ������ ��� -> foreach == ����for��
		for(BoardVO vo : boardList) {
			System.out.println(vo.getNo());
		}
		
	}//end of main()
		
}//end of class()

//Ŭ���� - ���� Ŭ�������� ���� �����Ǿ� �ִ� ���� ������ ���������� ������ �ϴ� ���� ��Ƶ� ��, ���� public Ŭ�������� �ַ� ����ϴ� ��찡 ����.)
//�������� �ϸ� Ŭ���� ������ ���� ����� ����.
class BoardVO{
	private int no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
}
