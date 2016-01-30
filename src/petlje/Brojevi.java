package petlje;

public class Brojevi {

	public static void main(String[] args) {
		TextIO ObjectIO = new TextIO();
		ObjectIO.readFile("prvibroj.in");
		int number = ObjectIO.getInt();
		int firstNumber = number;

		int min = 1000;
		
		while (firstNumber != 0) {
			firstNumber--;
//			int brojSacuvan = 0;
			int broj = ObjectIO.getInt();
			if (broj < min){
				min = broj;
			}
			
			
			
			
//			int broj2 = 0;
//			int manjiBrojevi = 0;
//			
//			brojSacuvan = broj;
//			System.out.println(brojSacuvan + " sacuvani broj");
//			firstNumber--;
//			broj2 = ObjectIO.getInt();
//			System.out.println(broj2 + "broj novi");
//			
//			
//			if (brojSacuvan < broj2) {
//				System.out.println(brojSacuvan + "MANJI JE");
//				manjiBrojevi = brojSacuvan;
//				System.out.println(manjiBrojevi + "ovo su manji brojevi");
//			}
						
		}
		System.out.println(min);

	}
}