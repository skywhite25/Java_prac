package ch08Interface;

public class CalcuMultiInterfaceClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4Ģ ������ �ַ� �ϴ� �κ�
		FourOpInterface calcu1 = new CalcuMultiInterfaceClass();
		System.out.println("�� : " + calcu1.add(10, 20)); //Ÿ���� 4Ģ ����Ÿ������ ���������Ƿ� 4Ģ���길 ó���ϰ� �ȴ�.
		
		//�հ�� ����� �ַ� �ϴ� �κ�
		int[] scores = {100, 80, 90, 85};
		SumAvgInterface calcu2 = new CalcuMultiInterfaceClass();
		int sum = calcu2.sum(scores); //sum�� ���� ���
		System.out.println("4���� �� : " + sum);
		System.out.println("4���� ��� : " + calcu2.avg(sum, scores.length));
	}

}
