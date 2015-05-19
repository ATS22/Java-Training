
public class SwitchLuni {
	public static void main(String[] args) {
		
		int luna = 8;
		String StringLuna;
		
		switch (luna) {
		case 1: StringLuna = "Ianuarie";
				break;
		case 2: StringLuna = "Februarie";
				break;
		case 3: StringLuna = "Martie";
				break;
		case 4: StringLuna = "Aprilie";
				break;
		case 5: StringLuna = "Mai";
				break;
		case 6: StringLuna = "Iunie";
				break;
		case 7: StringLuna = "Iulie";
				break;
		case 8: StringLuna = "August";
				break;
		case 9: StringLuna = "Septembrie";
				break;
		case 10: StringLuna = "Octombrie";
				break;
		case 11: StringLuna = "Noiembrie";
				break;
		case 12: StringLuna = "Decembrie";
				break;
		default: StringLuna = "Luna inexistenta";
		}
		System.out.println(StringLuna);
		
		
		int i = luna;
		
		for ( i = luna; i<11; i++) {
			System.out.println ("Count is: " + i);
		}
	}
}
