package jkammellander;

public abstract class MathFigur implements IMathFigur{
    /**
     * Diese Methode setzt sinnvolle Standardwerte eines Objektes
     */
    @Override
    public void initialisieren() {

    }

    /**
     * Diese Methode setzt die Einheit einer Figur
     *
     * @param einheit Die Einheit einer Figur
     */
    @Override
    public void setEinheit(double einheit) {

    }

    /**
     * Gibt die Enheit der Figur zurück
     *
     * @return Die Enheit der Figur
     */
    @Override
    public double getEinheit() {
        return 0;
    }

    /**
     * Diese Methode berechnet den Umrechnungsfaktor von der gespeicherten Einheit zu Meter
     *
     * @return Der Umrechnungsfaktor von der gespeicherten Einheit zu Meter
     */
    @Override
    public double umrechenFaktor() {
        return 0;
    }
}
