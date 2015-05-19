
public class NoteExamen {
	public static void main(String[] args) {
		
		int rezultat = 8;
		char nota;
		
		if (rezultat >= 90) {
			nota = 'A';
		} else if (rezultat >= 80) {
			nota = 'B';
		} else if (rezultat >= 70) {
			nota = 'C';
		} else if (rezultat >= 60) {
			nota = 'D';
		} else if (rezultat >= 50) {
			nota = 'E';
		} else if (rezultat >= 40) {
			nota = 'F';
		} else if (rezultat >= 30) {
			nota = 'G';
		} else if (rezultat >= 20) {
			nota = 'H';
		} else if (rezultat >= 10) {
			nota = 'I';
		} else {
			nota = 'J';
		}
		System.out.println( "Nota luata la examen este " + nota + "." );
		
		if (rezultat < 10) {
			System.out.println ("Ai cazut examenul.");
		}
	}
}