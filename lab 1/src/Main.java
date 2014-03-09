import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
	static int ilosc = 0;
	static int max = 100;
	static Student[] stud = new Student[max];

	public static void main(String[] args) {
	//	wczytajZWejscia();
		wczytajZPliku();
	//	zapiszDoPliku();
		wypiszWTabeli();
	}

	public static void wypiszWTabeli() {
		System.out.println("________________________________________________________________");
		System.out.printf("|%-19s|%-19s|%10s|%3s|%7s|\n", "Nazwisko", "Imiê",
				"Album", "Rok", "Œrednia");
		System.out.println("________________________________________________________________");
		for (int i = 0; i < ilosc; i++) {
			System.out.println(stud[i]);
		}
		System.out.println("________________________________________________________________");
	}

	public static void wczytajZWejscia() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj kolenjo: nazwisko, imiê, album, rok i œredni¹. Po dodaniu wszystkich wpisz 'Koniec' jako nazwisko.");
		boolean czyJuz = false;
		
		while (ilosc < max && !czyJuz) {
			String nazwisko = sc.next();
			if(!nazwisko.equals("Koniec")) {
				
			String imie = sc.next();
			long album = sc.nextLong();
			int rok = sc.nextInt();
			double srednia = sc.nextDouble();
			
			stud[ilosc] = new Student(nazwisko, imie, album, rok, srednia);
			ilosc+=1;
			System.out.println("Student dodany");
			}
			else {
				czyJuz = true;
				System.out.println("Zakoñczono.");
			}
			
			
		//	System.out.println(stud[ilosc-1]);
			
		}

		sc.close();

	}

	public static void zapiszDoPliku() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("baza.dta"));
			oos.writeInt(ilosc);
			for(int i=0; i<ilosc; i++) {
				oos.writeObject(stud[i]);
			}
		oos.close();
		System.out.println("Zapisano do pliku baza.dta");
		
		} catch (IOException ex) {
			ex.printStackTrace();
		}
				
	}

	public static void wczytajZPliku() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("baza.dta"));
			ilosc = ois.readInt();
			for(int i=0; i<ilosc; i++) {
				stud[i] = (Student) (ois.readObject());
			}
		ois.close();
		System.out.println("Wczytano z pliku baza.dta");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
