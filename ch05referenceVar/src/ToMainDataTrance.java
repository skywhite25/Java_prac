import java.util.Arrays;

public class ToMainDataTrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���޵Ǵ� args�� ���� ���
		//��Ŭ�������� args���� ������ �� - Run > Run Configurations
		//> Arguments > Program arguments
		System.out.println(Arrays.deepToString(args));
		//���: [10, �迹��, 010-9102-2453]
		
		
		//0��° (10)���� ���ڷ� �ν��� ���Ѽ� +20 -> 30�� ����غ���
		 int num = Integer.parseInt(args[0]);
		 System.out.println(num + 20);
	}

}
