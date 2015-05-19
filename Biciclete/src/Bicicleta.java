public class Bicicleta {
	int nr;
	String c;

	Bicicleta(int nr, String c) {
		this.nr = nr;
		this.c = c;
	}

	void deplasare(int d) {
		System.out.println("Bicicleta de culoare " + this.c + " se deplaseaza " + d + "m.");
	}
}