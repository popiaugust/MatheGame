// import javafx.scene.layout.Pane;
// import javafx.fxml.FXMLLoader;
// import java.io.IOException;
// import java.util.Random;

// /*
// Einfachste Variante einer Aufgabe
// Zwei Zahlen werden zufällig gewählt. Wenn das Ergebnis die Summe der Zahlen war, ist die Aufgabe richtig gelöst worden
 // */

// public class Divi extends Aufgabe
// {
    // // Die beiden Zahlen
    // private int zahl1;
    // private int zahl2;
    // private int zahl3;

    // // Zufallsgenerator
    // private Random random; 

    // // Darstellung der Aufgabe
    // private EinfacheAufgabeController controller;

    // // Konstruktor
    // public Divi()
    // {
        // super(); //Aufruf des Konstruktors der Superklasse, könnte hier auch weggelassen werden

        // punkte = 5;  // Soviele Punkte ist diese einfache Aufgabe wert

        // // Erstellt ein Objekt für neue Zufallszahlen
        // random = new Random();     

    // }

    // // Methoden
    // /*
     // * Diese Methode wird noch nicht verwendet
     // */
    // public  void richtigeLoesungAnzeigen(){}

    // /*
     // * Erstellt eine neue Aufgabe
     // * Wählt die beiden Zahlen zahl1 und zahl2 neu zwischen 0 und 100
     // */
    // public void neu()
    // {
        // zahl1 = random.nextInt(14)+1;
        // zahl2 = random.nextInt(14)+1;
        // zahl3 = zahl1 * zahl2;
        // controller.neueAufgabe(zahl3, zahl1, ":");
    // }

    // /*
     // * Überprüft, ob die gegebene Antwort richtig war
     // */
    // public boolean loesungUeberpruefen(){
        // int antwort = controller.getAntwort();
        // if (zahl3 / zahl1 == antwort)
        // {
            // return true;
        // }
        // else
        // {
            // return false;
        // }

    // }

    // /*
     // * Erstellt eine Darstellung für die einfache Aufgabe und gibt das Pane mit der Oberfläche zurück
     // * Mit jedem Aufruf wird eine neue einfache Aufgabe mit anderen Zahlen erstellt
     // */
    // public  Pane darstellungErstellen(){
        // // Lädt die Oberfläche 
        // FXMLLoader loader = new FXMLLoader(getClass().getResource("einfacheaufgabe_view.fxml")); 

        // try {
            // Pane view = (Pane) loader.load();
            // controller = loader.getController();
            // // Füllt sie mit neuen Zahlen
            // neu();
            // // Gibt die neue Oberfläche zurück
            // return view;
        // }catch(IOException e) {
            // e.printStackTrace();
        // }

        // return null;
    // }

// }
