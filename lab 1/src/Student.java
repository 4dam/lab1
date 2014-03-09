public class Student {

	public String nazwisko;
	public String imie;
	public long album;
	public int rok;
	public double srednia;
	
	public static String format = "|%-19s|%-19s|%10d|%3d|%7.2f|";
	
	public Student(String nazwisko, String imie, long album, int rok,
			double srednia) {
		this.nazwisko = nazwisko;
		this.imie = imie;
		this.album = album;
		this.rok = rok;
		this.srednia = srednia;
	}

	public void wyswietl() {
		System.out.printf(format, nazwisko, imie,
				album, rok, srednia);
	}

	public String toString() {
		return String.format(format, nazwisko, imie, album, rok, srednia);
	}
	
}