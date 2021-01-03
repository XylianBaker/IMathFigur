package jkammellander;

public abstract class MathFigur implements IMathFigur{
    // Attribut
    private double einheit;

    /**
     * Diese Methode setzt die Einheit einer Figur
     *
     * @param einheit Die Einheit einer Figur
     */
    @Override
    public void setEinheit(double einheit) {
        this.einheit = einheit;
    }

    /**
     * Gibt die Enheit der Figur zurück
     *
     * @return Die Enheit der Figur
     */
    @Override
    public double getEinheit() {
        return this.einheit;
    }

    /**
     * Diese Methode berechnet den Umrechnungsfaktor von der gespeicherten Einheit zu Meter
     *
     * @return Der Umrechnungsfaktor von der gespeicherten Einheit zu Meter
     */
    @Override
    public double umrechenFaktor() {
        return getEinheit();
    }
}
