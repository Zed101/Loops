package petlje;
public class Ascii {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		TextIO reader = new TextIO();
		reader.readFile("encodedFile.in");
		int numOfLines = reader.getInt();
		String string = "";
		String finish = "";
		
		//System.out.println(numOfLines);
		

//		char c = 'A';
//		int b = (int) c;
//		System.out.println(b + " casting");
	
		while(numOfLines != -1){
			numOfLines--;
		 string = reader.getlnString();
		 
		 for (int i = 0; i < string.length(); i++) {
				char cahar = string.charAt(i);
				
				//System.out.println(cahar);
				int intcar = (int) cahar;
				int correctint = intcar -1;
				char correctchar = (char) correctint;
				//System.out.println(correctchar);
				finish += correctchar;
			}
		}
		
		
		

	//	System.out.println(string);
		
		System.out.println(finish);
		
		
		
	}
}
