package petlje;

public class NajmanjiBroj {

	public static void main(String[] args) {

		TextIO ObjectIO = new TextIO();
		TextIO.readFile("isti.in");
		
		int number = ObjectIO.getInt();
		int firstNumber = number;
		
		int min = 1000;

		while (firstNumber != 0) {
			firstNumber--;
			int numbers = ObjectIO.getInt();
			
			if (numbers < min) {
				min = numbers;
				System.out.println(min + "minnn");
			}
			
		}

		System.out.println(min);
	}

}
