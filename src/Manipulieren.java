import java.util.ArrayList;
import java.util.Scanner;

public class Manipulieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listeZufallszahlen = new ArrayList<Integer>();
		ArrayList<Integer> listeIndices = new ArrayList<Integer>();
		Scanner meinScanner = new Scanner(System.in);
		int eingabeZahl;
		int zaehler = 0;
		//HAllo
		
		//Aufgabe 1. Zahlen hinzufügen
		for(int i = 0; i < 20 ; i++) {
			listeZufallszahlen.add((int) (Math.random() * 9 + 1));
		}
		
		//Aufgabe 2. Ausgabe
		System.out.println("Liste mit 20 Zufallszahlen");
		for(int zufallszahl : listeZufallszahlen){
			System.out.println(zufallszahl);
		}
		
		//Aufgabe 3. Eingabe einer Zahl
		System.out.print("Bitte gebe eine Zahl ein (1-9):");
		eingabeZahl = meinScanner.nextInt();

		
		//Aufgabe 4. Wie oft existiert diese Zahl
		for(int i = listeZufallszahlen.size()-1; i >=0; i--) {
			
			if(eingabeZahl == listeZufallszahlen.get(i)) {
				zaehler++;
				//Aufgabe 5.
				listeIndices.add(i);
			}
		}

		System.out.print("Die Zahl: " + eingabeZahl + " kommt " + zaehler + " mal in der Liste vor. \n");
		
		//Aufgabe 5. Anzeige der Indices
		System.out.print("Die Zahl kommt an folgenden Indices in der Liste vor:");
		
		for(int indices : listeIndices){
			System.out.print(" " +indices);
		}
		
		//Aufgabe 6. Löschen der Indices
		for(int i = listeZufallszahlen.size()-1; i >=0; i--) {	
			for(int indices : listeIndices){
				if(i == indices) {
					listeZufallszahlen.remove(i);
				}
			}
		}
		
		System.out.println("\nDie gefundenen Werte wurde geloescht. Die List hat nur noch " + listeZufallszahlen.size() + " Zahlen");
		System.out.println("Liste nach Loeschung von "+ eingabeZahl +":");
		//Aufgabe 7. Ausgabe Liste
		for(int zufallszahl : listeZufallszahlen){
			System.out.println(zufallszahl);
		}	
		
		listeIndices.clear();
		
		//Aufgabe 8. Hinzufügen einer 0 nach einer 5
		for(int i = listeZufallszahlen.size()-1; i >=0; i--) {
			
			if(listeZufallszahlen.get(i) == 5) {
				listeIndices.add(i);
			}
		}
		
		for(int indices : listeIndices){
				listeZufallszahlen.add(indices + 1,0);
		}
		
		System.out.println("Liste nach Einfuegen von 0 hinter jeder 5");
		
		//Aufgabe 9. Ausgabe Liste
		for(int zufallszahl : listeZufallszahlen){
			System.out.println(zufallszahl);
		}	
	}

}
