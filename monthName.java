import java.util.Scanner;

public class monthName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� �������� ������ � ������� �����:");
		String m = in.next();
		if (m.equals("�������")||m.equals("������")||m.equals("�������")) {
			System.out.println("����");
		}
		if (m.equals("����")||m.equals("������")||m.equals("���")) {
			System.out.println("�����");
		}
		if (m.equals("����")||m.equals("����")||m.equals("������")) {
			System.out.println("����");
		}
		if (m.equals("��������")||m.equals("�������")||m.equals("������")) {
			System.out.println("�����");
		}
	}
}
