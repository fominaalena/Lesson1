import java.util.Scanner;

public class enterString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Введите строку (для завершения ввода наберите q):");
			String s = in.next();
			if (s.equals("q")) {
				System.out.println("Процесс ввода остановлен");
				break;
			}
		}
	}
}
