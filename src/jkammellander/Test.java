package jkammellander;

/**
 * Diese Klasse testet die Methoden der Klassen MathFigur und Rechteck.
 * @author Jan Kammellander
 * @version 2021-01-04
 */
public class Test {
    public static void main(String[] args) {
        Rechteck r = new Rechteck(3,2);
        r.setEinheit(IMathFigur.ZENTIMETER);
        System.out.println("Der Umfang des Rechtecks: " + r.umrechenFaktor()*r.umfangBerechnen() + " m");
        System.out.println("Die Einheit: " + r.getEinheit() + " m");
        System.out.println("Der Flächeninhalt des Rechtecks: " + r.umrechenFaktor()*r.flaecheBerechnen() + " m");
    }
}
