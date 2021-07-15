import java.util.Arrays;

public class NonFixParameterTest {
 
	//����. �ڹٿ��� ó�� ���۵Ǵ� main �޼��带 �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		System.out.println("NonFixParameterTest.main() ������");
		int kor = 100; //����
		int eng = 80;
		int meth = 90;
				
		//�� ������ �����հ踦 ���ϼ���.
		//�հ� ���ϱ�
		//�Ʒ� �迭�� �޴� sum() ����ϱ� ���ؼ� �迭�� �����.
		//int sum = sum(new int[] {kor, eng, meth}); //new���� �����ؼ� �迭�� �����
		
		//Ÿ���� int�� ���� ���� �����͸� �޴� �޼���� �迭�� �޴´�.
		int sum = sum(kor, eng, meth);
		System.out.println("sum = " + sum);
		
	}
	
	//�ߺ������ų� ���������� �ҽ��� ������.
	//�հ� ���ϴ� �޼��� �����
	//Ÿ���� �迭�� �����͸� �޴� sum �޼���
	/*public static int sum(int[] scores) { 
		System.out.println("NonFixParameterTest.sum().scores : " + Arrays.toString(scores)); //�Ѿ�� ������ Ȯ��
		int result = 0; //returnŸ�԰� �Ȱ��� ���� ����
		for(int i=0; i < scores.length; i++)
			result += scores[i];
		return result;
	}
	 */
	//Ÿ���� int �������� �����͸� �޴� sum �޼��� -> �� �� scores�� �迭�̴�. ...�� ������ �Ű����������� ����� �����ϴ�.
	public static int sum(int ... scores) { //���� �����Ͱ� �Ѿ�� �� �ڵ����� �迭�� �����. 
		System.out.println("NonFixParameterTest.sum().scores : " + Arrays.toString(scores)); //�Ѿ�� ������ Ȯ��
		int result = 0; //returnŸ�԰� �Ȱ��� ���� ����
		for(int i=0; i < scores.length; i++)
			result += scores[i];
		return result;
	}
	
}
