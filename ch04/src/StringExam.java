
public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strVar1 = "�迹��";
		String strVar2 = "�迹��";
		
		System.out.println(strVar1 + "-1/" + strVar2 + "-2");
		System.out.println(strVar1 == strVar2);
		
		String strVar3 = new String("�迹��");
		String strVar4 = new String("�迹��");
		
		System.out.println(strVar3 + "-new 3/" + strVar4 + "-new 4");
		System.out.println(strVar3 == strVar4); //�ּҰ� �޶� false �� ����
		
		System.out.println(strVar1 + "-1/" + strVar3 + "-new 3");
		System.out.println(strVar1 == strVar3); //�ּҰ� �޶� false �� ����
				
		//������ ���ڿ��̳� Ŭ������ ������ ���� ���� equals()�� ����ؾ��Ѵ�.
		//-�̶� ���α׷��� �ۼ��Ǿ� �־�� �Ѵ�.
		
		//���ڿ� String�� �񱳴� ==�� ���ϸ� �ּҸ� ���ϰ� �ǹǷ� equals()�� ���ؾ��Ѵ�.
		System.out.println(strVar1 + "-1/" + strVar3 + "-new 3 :equals ��");
		System.out.println(strVar1.equals(strVar3)); //equals()�� ������ ��
		
		System.out.println(strVar3 + "-new 3/" + strVar4 + "-new 4 :equals ��");
		System.out.println(strVar3.equals(strVar4));
		
		System.out.println(strVar1 + "-1/" + strVar2 + "-2 :equals ��");
		System.out.println(strVar1.equals(strVar2));
	}

}