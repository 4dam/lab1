import java.util.Scanner;

public class Main {
	int max;
	Student[] stud = new Student[max];

	public static void main(String[] args) {

	}

	public void wypiszWTabeli() {
		System.out.printf("|%-19s|%-19s|%10d|%3d|%7.2f|\n", "Nazwisko", "Imiê", "Album", "Rok", "Œrednia" );
		for (int i = 0; i < max; i++) {
			System.out.println(stud[i]);
		}
	}
	
	public void wczytajZWejscia() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj kolenjo: nazwisko, imiê, album, rok i œredni¹.");
		
		if(stud.length < max) {
			String nazwisko = sc.next();
			String imie = sc.next();
			long album = sc.nextLong();
			int rok = sc.nextInt();
			double srednia = sc.nextDouble();
			//JAK TU DODAC STUDENTA DO TABLICY?!
					
		}
		else { System.out.println("Za du¿o studentów.");
	}

}
}
