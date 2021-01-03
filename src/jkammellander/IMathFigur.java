package jkammellander;

public interface IMathFigur {

    // Konstanten der Länge 📏
    public static final double METER = 1;   // 1/299 792 458 s
    public static final double KILOMETER = 1e3;
    public static final double ZENTIMETER = 1e-2;
    public static final double MILLIMETER = 1e-3;

    public void initialisieren();

    public abstract double flaecheBerechnen(double a, double b);

    public abstract double umfangBerechnen(double a, double b);

    public void setEinheit(double einheit);

    public double getEinheit();

    public abstract boolean laengenCheck();

    public abstract double umrechenFaktor();
}
