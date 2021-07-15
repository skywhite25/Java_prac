
public class Object1 {

	//���� = �ʵ� = ��ü ���� = �Ӽ� = ��������(��𼭵� ��밡��)= �������	
	//non-static : new�� ������ ������ ��� ����(��ü����.age;)
	private int age; //�⺻ �ʱⰪ=0
	private String name; //�⺻ �ʱⰪ = null
	
	//static : �̸��� ��Ÿ���� �ٷ� ��� ���� (Object1.company;)
	static String company; //�⺻�ʱⰪ = null
	
	//static �ʱ�ȭ ���
	static {
		//Ŭ������ �̸��� ��Ÿ���� �ٷ� �ڵ����� ����Ǵ� �κ�
		//static���� ����� ������ ���� �����ϱ� ���ؼ� (�ʱⰪ�� �ֱ� ���ؼ�) ���ȴ�.
		System.out.println("Object1.static �ʱ�ȭ ���");
		//age = 28; static�� ���� �ö󰡰� �������� new�� �ؾ� ��Ÿ���Ƿ� ������ �� ����.
		company = "��¯�ֽ�ȸ��";
	}
	
	//�ʱ�ȭ ���
	{
		//new�� ������ �� ������ �� �� ����
		//static �̳� non-static���� ����� ������ �ʱⰪ�� �����ϱ� ���ؼ� ���ȴ�.
		System.out.println("Object1 �ʱ�ȭ ���");
		age = 23;
		name = "�迹��";
		company = "(��)��¯";
	}
	
	
	//�⺻ ������ - ������ ���� �ϰ� ���߿� ���� �����ؼ� ����, Ŭ���� �̸��� ���ƾ� ��, ���������ϰ� �����ϸ� �ٸ� �����ڰ� ���� ��쿡 �����Ϸ��� �ڵ����� �������ش�.
	public Object1() {
		System.out.println("�⺻������------------------------");
	}
	//�����ڸ� ���� ���� - ������ �� �� ���� �����ؼ� �ʱⰪ�� �����ϱ� ���� ���, ������ ���� �̹� ������ �־�� �Ѵ�.
	public Object1(String name) {
		this.name = name;
		System.out.println("name�� �޴� ������ ����---------------------------");
	}
	public Object1(int age, String name) {
		this(name); //�������� ȣ���� �̿��ؼ� �ʱⰪ ����, ������ ȣ���� �� ���� �����ؾ߸� �Ѵ�.
		this.age = age;
		//this.name = name;
		System.out.println("���̿� �̸��� �޴� �����ڽ���------------------------");
	}

	//getter�� setter�� �̿��� ������ ���� ���� - ĸ��ȭ, Object1���� ������ ������ private�̾�� �Ѵ�.
	//���� : int age�� ���� getter�� setter�� �ۼ��Ͻÿ�.
	public int getAge() {
		return age; 
		}
	public void setAge(int age) { 
		System.out.println("Object1.setAge() ȣ���ؼ� ������...");
		this.age = age;
	}
	public String getName() { 
		return name; 
		}
	public void setName(String name) { 
		this.name = name; 
		}
	
	//������ Ȯ�ο� �޼���
	public String toString() {
		return "Object1[age=" + age + ", name=" + name + ", company=" + company + "]";
	}
	
}
