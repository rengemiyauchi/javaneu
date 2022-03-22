package files;
import java.util.Scanner;
/*
 * Doings am 22.03.2022
 * 	-	Konsolenausgabe reproduzieren
 * 	-	Kommentare setzen
 * 	-	Klassen erstellen und Objekte der jeweiligen Klassen mit Wertzuweisung
 * 	-	Optional: Nutzereingaben mit Taschenrechnerfunktion als Konsoleausgabe (Variable+)
 */
public class Beginner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Erste Konsolenausgabe erfolgt hier - Hallo Welt!"); // Schritt 1: Konsolenausgabe
		
		System.out.println("Geben Sie die erste Zahl ein: "); // Schritt 2: Einlesen des Wertes 1
		Scanner firstOne = new Scanner(System.in);
		double value1 = firstOne.nextDouble();
		
		System.out.println("Geben Sie die zweite Zahl ein: "); // Schritt 2: Einlesen des Wertes 2
		Scanner secondOne = new Scanner(System.in);
		double value2 = secondOne.nextDouble();
		
		double resultAdd = value1 + value2;
		double resultSub = value1 - value2;
		double resultMul = value1 * value2;
		double resultDiv = value1 / value2;
		
		System.out.println("\nDas Ergebnis der Addition der eingegebenen Werte lautet: " + resultAdd);
		System.out.println("Das Ergebnis der Subtraktion der eingegebenen Werte lautet: " + resultSub);
		System.out.println("Das Ergebnis der Multiplikation der eingegebenen Werte lautet: " + resultMul);
		System.out.println("Das Ergebnis der Division der eingegebenen Werte lautet: " + resultDiv + "\n\n");
		
		Scanner rechenart = new Scanner(System.in);
		System.out.println("Geben Sie zusätzlich die Art der Rechnung ein (a) für Addition, (s) für Subtraktion, (m) für Multiplikation, (d) für Division: "); // Schritt 2: Einlesen des Wertes 2
		String grechenart = rechenart.nextLine();
		
		//String Abgleich immer mit equals durchführen!
		if(grechenart.equals("a")) {
			System.out.println("Sie haben sich für Addition entschieden. Das Ergebnis lautet " + (value1 + value2));
		}
		else if(grechenart.equals("s")) {
			System.out.println("Sie haben sich für Subtraktion entschieden. Das Ergebnis lautet " + (value1 - value2));
		}
		else if(grechenart.equals("m")) {
			System.out.println("Sie haben sich für Multiplikation entschieden. Das Ergebnis lautet " + (value1 * value2));
		}
		else if(grechenart.equals("d")) {
			System.out.println("Sie haben sich für Division entschieden. Das Ergebnis lautet " + (value1 / value2));
		}
		else {
			System.out.println("Sie haben etwas anderes als die erlaubten Zeichen angegeben. Das Programm wird jetzt beendet!");
		}
		
		firstOne.close();
		secondOne.close();
		rechenart.close();
	}

}
