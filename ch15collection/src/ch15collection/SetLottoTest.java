package ch15collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetLottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ζ� ���α׷� �ۼ�
		//1.�������� ���� ����� ���� -> Math.random() : 0.0 <= r < 1.0 : ������ ���ؼ� *45 -> 0.0 <= r*45 < 45.0
		//���������� �����. -> 0 <= (int) (r*45) < 45 ==> 0~ 44 : ������ ���ؼ� +1 -> 1 <= (int) (r*45) +1 < 46
		//2.�迭�� �����.
		
		int[] lotto = new int[7]; //7���� ���ڰ� ���� �迭 �����
		int bonus = 0;
		//���� ���ڸ� �߻����Ѽ� �������� ������ �ߺ����� �ʵ��� ó���� 6���� �����͸� �����´�.
		int index = 0;
		while(index < 7) {
			int num = (int)(Math.random() * 45) + 1;
			System.out.println("���� ���� : " + num);
			
			boolean check = false; // �ߺ��� ���� �ʾҴٴ� ��
			
			for(int i = 0; i < index; i++) { //���� ������(-1)�� ���� ���� ������(num)�� �ߺ��� �Ǵ��� ���ϱ� ���� �ݺ�ó��
				if(lotto[i] == num) { //�����Ͱ� �ߺ��̸�
					check = true; // �ߺ��� �Ǿ��ٰ� (true)ǥ�ø� �Ѵ�
					break; //for �ݺ����� ����������.
				}
				
			}
			if(!check) { //�ߺ��� ���� �ʾ�����
				lotto[index] = num; //���ڸ� lotto�迭�� ����
				index ++; //���� ��ȣ�� �ޱ����� index�� 1������Ų��.
			}
			System.out.println(Arrays.toString(lotto));
						
		}
		Arrays.sort(lotto, 0, lotto.length - 1); //�迭�� �����͸� ���� ������ ���� (0~6������ ����) => �������� ���ʽ� ��ȣ
		System.out.println("��÷ �ζ� ��ȣ : " + Arrays.toString(lotto));
		
		
		
		//Ư������ ��� : \n -> �ٹٲ�, \\ -> \, \" -> "
		System.out.println("\n\n=================================Set�� �̿��� �ζǹ�ȣ ����=========================================");
		//�ߺ��� ���� ���� �����͸� ����
		Set<Integer> lottoSet = new HashSet<>(); //Set<>�̶� HashSet<>���� ctrl+space���� �ڹ���ƿ ����
		
		//set�� ������ ������ 6���� ������� 6�̵Ǹ� ����������.
		//while(lottoSet.size() < 6) {
			// 1 ~ 45 ������ ���� ���ڸ� ����� ����.
			//int num = (int)(Math.random() * 45) + 1; 
			//System.out.println("�߻��� ���� ���� : " + num); *
			
			//set�� �����͸� �߰� - �����ʹ� ����� ����.
			//lottoSet.add(num);(Math.random() * 45) + 1; 
			//System.out.println(lottoSet); *���� ���� �� ���
		//}
		
		while(lottoSet.size() < 6) 
			lottoSet.add((int)(Math.random() * 45) + 1); 
		
		System.out.println(lottoSet);
		
		//���ʽ� ���� ���ϱ�
		while(true) {
			//���� ���ڸ� �����.
			int num = (int)(Math.random() * 45) + 1;
			if(!lottoSet.contains(num)) { //�ζ� ��ȣ�� ���ԵǾ� ���� ������(�ߺ��� ���� ������)
				bonus = num; //���ʽ� ��ȣ�� ����
				break; //while���� ����������.
		
			}
		}
		
		//�����ؼ� ����ϰ� �ʹ� --> 1.set�� ������ �����Ƿ� ������ �ִ� �迭��(toArray) �����.
		Object[] arr = lottoSet.toArray();
		//2.�迭 ����
		Arrays.sort(arr);
		//3.���ĵ� �迭 ���
		System.out.println(Arrays.toString(arr));
		//4.���ʽ� ���� ���
		System.out.println("���ʽ� : " + bonus);

		
		}
	

}
