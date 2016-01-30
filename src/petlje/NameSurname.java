package petlje;

import java.util.Scanner;

public class NameSurname {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String web = "www.edfdffsdgg.com?name=Boris&surname=Prezime";
		int startName = web.indexOf('=');
		int finishName = web.indexOf('&');
		
		String name = web.substring(startName+1, finishName);
		System.out.println(name);
		
		
		int startSurname = web.indexOf('=', finishName);
		String surname = web.substring(startSurname+1);
		System.out.println(surname);
		
		int dot = web.indexOf('.');
		int dot2 = web.indexOf('.', dot+1);
		
		
		String domain = web.substring(dot+1, dot2);
		System.out.println(domain);
	}

}
