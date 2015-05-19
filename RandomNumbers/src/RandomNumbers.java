import java.util.Arrays;
import java.util.Random;


public class RandomNumbers {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] a = new int[10];
		
		for (int i=0; i<a.length; i++) {
			a[i] = r.nextInt(100);
			Arrays.sort(a);
		}
				
		for (int i=0; i<a.length; i++) {
			System.out.println("a[" +i+ "]="+a[i]+" ");
		}
		
		//for (int item : a ) {
			//System.out.println("Count is: " + item);
		//}
		
	}
}