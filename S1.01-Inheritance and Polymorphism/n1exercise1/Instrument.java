package n1exercise1;

abstract class Instrument {
    String nom;
    double preu;
    public Instrument (String nom, double preu){
        this.nom = nom;
        this.preu = preu;
    }
    public abstract void tocar();
}
