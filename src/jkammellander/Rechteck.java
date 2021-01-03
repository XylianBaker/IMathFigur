package jkammellander;

/**
 * Diese Klasse erstellt ein Rechteck und dessen Methoden, wobei die Klasse von der
 * Klasse MathFigur erbt.
 * @author Jan Kammellander
 * @version 2021-01-04
 */
public class Rechteck extends MathFigur{
    // Attribute
    private double a, b;

    /**
     * Konstruktor der Klasse
     * @param a Die Länge des Redchtecks
     * @param b Die Breite des Rechtecks
     */
    public Rechteck(double a, double b) {
        if (!laengenCheck()) {
            this.a = a;
            this.b = b;
        }
    }

    /**
     * Diese Methode setzt sinnvolle Standardwerte eines Rechtecks
     */
    @Override
    public void initialisieren() {
        this.a = 10;
        this.b = 5;
    }

    /**
     * Diese Methode berechnet den Flächeninhalt eines Rechtecks
     *
     * @return Der Flächeninhalt eines Rechtecks
     */
    @Override
    public double flaecheBerechnen() {
        return this.a * this.b;
    }

    /**
     * Diese Methode berechnet den Umfang eines Rechtecks
     *
     * @return Der Umfang eines Rechtecks
     */
    @Override
    public double umfangBerechnen() {
        return this.a*2 + this.b*2;
    }

    /**
     * Diese Methode prüft die Länge und Breite auf einen gültigen Bereich
     *
     * @return true, wenn die Länge und Breite gültigen Bereich liegt
     */
    @Override
    public boolean laengenCheck() {
        return this.a > 0 && this.b > 0;
    }
}
