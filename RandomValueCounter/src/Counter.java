import java.util.Random;

public class Counter {
	public static void main(String[] args) throws InterruptedException {

		int number;
		Random a = new Random();

		number = a.nextInt(100);

		while (number > 0) {
			number--;
			System.out.println(number);

			Thread.sleep(1000);
		}
	}
}