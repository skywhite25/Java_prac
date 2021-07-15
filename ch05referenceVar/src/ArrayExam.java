import java.util.Arrays;

public class ArrayExam {
	
	//���⼭ ���� ������ �˴ϴ�.
	public static void main(String[] args) {		
		System.out.println("�迭 ����");
		int[] intArray = null; // == int intArray[]
		intArray = new int[5];
		
		//���� p.157
		int [] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		System.out.println(arr1);
		//Arrays -> �迭 �����͸� ���ڿ��� ���� ����� �� ���
		System.out.println(Arrays.toString(arr1));
		
		
		//for 0~2 �ε����� �̿��� ���
		for(int i = 0; i <= 2; i++)
			System.out.println(arr1[i]);
		
		//arr1�� ���̸� �̿��� ���
		for(int i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);
		
		//���� for���� �̿��� arr1 ���
		//���� d�� �迭 arr1�� �����͸� ������� �ִ� ��ŭ �� ���� �����ϰ� �ݺ� �����Ѵ�.
		for(int d:arr1)
			System.out.println(d);
		
		//=========================================
		//�迭�� ����� �� �̹� ���� �־��� �ִ� ����� �迭 ����
		// int[] scores = new int [] {83, 90, 87};
		int [] scores = {80, 90, 85};
		
		System.out.println(scores);
		//�� ����ϱ� ���� Arrays ���
		System.out.println(Arrays.toString(scores));
		
		
		//�հ� ���ϱ�
		int sum = 0;
		for(int i = 0; i < scores.length; i++)
			sum += scores[i];
		System.out.println("�հ�:" + sum);
		
		//��� ���ϱ� = �հ� / ���� ����(length)
		//System.out.println((double)  sum / scores.length);
		System.out.println(1.0 * sum / scores.length);
	}
}
