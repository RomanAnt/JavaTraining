package apprenderJava;

public class FraseOMatic {

	public static void main(String[] args) 
	{
		String[] wordListOne = {"��������������","���-�������","3000-��������",
				"��������","�������� �������","��������","�� ������ ��� ����������",
				"�����������","�����","����� ����","����� ������������ ����","����������"};
		
		String[] wordListTwo = {"��������������","�������","������ �������","���������������",
				"�����������","�������������","����������������","���������","������������� ��",
				"�����������������", "�������","���������������","�������������� � �������",
				"�����������","���������� ��","�����","����������","����������"};
		
		String[] wordListThree = {"�������","����� ���������","����� �� ���������",
				"��� ���������","������","������","������� ����������� ��������",
				"������","������ �������","�����","�������","������ ����������"};
		
		int oneLenth = wordListOne.length;
		int twoLenth = wordListTwo.length;
		int threeLenth = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLenth);
		int rand2 = (int) (Math.random() * twoLenth);
		int rand3 = (int) (Math.random() * threeLenth);
		
		String theFrase = wordListOne[rand1] +" "+ wordListTwo[rand2] +" "+ wordListThree[rand3];
		
		System.out.println("\n\t��, ��� ��� �����, ��� - " + theFrase + ".");
		

	}

}
