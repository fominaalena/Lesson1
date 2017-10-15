import java.util.Scanner;

public class monthName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите название месяца с большой буквы:");
		String m = in.next();
		if (m.equals("Декабрь")||m.equals("Январь")||m.equals("Февраль")) {
			System.out.println("Зима");
		}
		if (m.equals("Март")||m.equals("Апрель")||m.equals("Май")) {
			System.out.println("Весна");
		}
		if (m.equals("Июнь")||m.equals("Июль")||m.equals("Август")) {
			System.out.println("Лето");
		}
		if (m.equals("Сентябрь")||m.equals("Октябрь")||m.equals("Ноябрь")) {
			System.out.println("Осень");
		}
	}
}
