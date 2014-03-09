import java.util.Scanner;

public class Main {
	int max = 100;
	Student[] stud = new Student[max];

	public static void main(String[] args) {

	}

	public void wypiszWTabeli() {
		System.out.printf("|%-19s|%-19s|%10d|%3d|%7.2f|\n", "Nazwisko", "Imiê",
				"Album", "Rok", "Œrednia");
		for (int i = 0; i < max; i++) {
			System.out.println(stud[i]);
		}
	}

	public void wczytajZWejscia() {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Podaj kolenjo: nazwisko, imiê, album, rok i œredni¹.");

		for (int i = 0; i < max; i++) {
			if (stud[i] == null) {
				String nazwisko = sc.next();
				String imie = sc.next();
				long album = sc.nextLong();
				int rok = sc.nextInt();
				double srednia = sc.nextDouble();

				stud[i] = new Student(nazwisko, imie, album, rok, srednia);
			}

		}

	}
}
