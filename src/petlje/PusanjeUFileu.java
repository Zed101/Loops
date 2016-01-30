package petlje;

public class PusanjeUFileu {

	public static void main(String[] args) {
		TextIO writer = new TextIO();
		writer.writeFile("Bla.out");
		writer.putln(1);
		writer.put("Bora");
		writer.putln();
		writer.putln("zeljka");
		writer.putln(27);
		
		int broj = 1;
		writer.putln(broj);
		String s = "gojfoig";
		writer.putln(s);
		
		while( broj != 10){
			writer.putln(broj++);
		}
		
		for (int i = 0; i < 10; i++) {
			writer.putln(i);
		}
		
		
		
		System.out.println("Zavrsio");
	
	}

}
