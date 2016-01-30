package petlje;

public class DoMinus1 {

	public static void main(String[] args) {

		TextIO textIOObject = new TextIO();
		textIOObject.readFile("input1.in");
		int sum = 0;
		int num = 0;
		
		while (num != -1) {
			num = textIOObject.getInt();
			if (num != -1) {
				sum = sum + num;
			}

		}
		System.out.println(sum);

	}

}
