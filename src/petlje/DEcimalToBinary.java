package petlje;

public class DEcimalToBinary {

	public static void main(String[] args) {
		TextIO reader = new TextIO();
		reader.readFile("decimal.in");
		int broj = reader.getInt();
		TextIO writer = new TextIO();
		writer.writeFile("binary.out");
		String binarni = Integer.toBinaryString(broj);
		writer.putln(binarni);
	}

}
