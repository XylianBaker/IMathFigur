package jkammellander;

/**
 * Diese Klasse beinhaltet Methoden zum berechnen und definieren von Figuren.
 * @author Jan Kammellander
 * @version 2021-01-03
 */
public interface IMathFigur {

    // Konstanten der Länge 📏
    double METER = 1;   // 1/299 792 458 s
    double KILOMETER = 1e3;
    double ZENTIMETER = 1e-2;
    double MILLIMETER = 1e-3;

    /**
     * Diese Methode setzt sinnvolle Standardwerte eines Objektes
     */
    public abstract void  initialisieren();

    /**
     * Diese Methode berechnet den Flächeninhalt einer Figur
     * @return Der Flächeninhalt einer Figur
     */
    public abstract double flaecheBerechnen();

    /**
     * Diese Methode berechnet den Umfang einer Figur
     * @return Der Umfang einer Figur
     */
    public abstract double umfangBerechnen();

    /**
     * Diese Methode setzt die Einheit einer Figur
     * @param einheit Die Einheit einer Figur
     */
    public void setEinheit(double einheit);

    /**
     * Gibt die Enheit der Figur zurück
     * @return Die Enheit der Figur
     */
    public double getEinheit();

    /**
     * Diese Methode prüft die Länge auf einen gültigen Bereich
     * @return true, wenn die Länge im gültigen Bereich liegt
     */
    public abstract boolean laengenCheck();

    /**
     * Diese Methode berechnet den Umrechnungsfaktor von der gespeicherten Einheit zu Meter
     * @return Der Umrechnungsfaktor von der gespeicherten Einheit zu Meter
     */
    public double umrechenFaktor();
}
