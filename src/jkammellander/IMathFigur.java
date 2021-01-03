package jkammellander;

public interface IMathFigur {

    // Konstanten der Länge 📏
    public static final String METER = "1";   // 1/299 792 458 s
    public static final String KILOMETER = String.valueOf(Math.pow(Double.parseDouble(METER), 1000));
    public static final String ZENTIMETER = String.valueOf(Math.pow(Double.parseDouble(METER), -100));
    public static final String MILLIMETER = String.valueOf(Math.pow(Double.parseDouble(METER), -1000));

    public void initialisieren();

    public abstract double flaecheBerechnen(double a, double b);

    public abstract double umfangBerechnen(double a, double b);

    public void setEinheit(double einheit);

    public double getEinheit();

    public abstract boolean laengenCheck();

    public abstract double umrechenFaktor();
}
