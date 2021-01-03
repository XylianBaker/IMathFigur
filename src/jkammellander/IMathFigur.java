package jkammellander;

public interface IMathFigur {

    // Konstanten der Länge 📏
    public static final double METER = 1;   // 1/299 792 458 s
    public static final double KILOMETER = METER * 1000;
    public static final double ZENTIMETER = METER / 100;
    public static final double MILLIMETER = METER / 1000;

    public void initialisieren();

    public abstract double flaecheBerechnen(double a, double b);

    public abstract double umfangBerechnen(double a, double b);

    public void setEinheit(double einheit);

    public double getEinheit();

    public abstract boolean laengenCheck();

    pu
}
