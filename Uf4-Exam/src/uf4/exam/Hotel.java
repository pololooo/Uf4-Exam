package uf4.exam;

public class Hotel {

    private String nom;
    private String poblacio;
    private int numHabitacions;
    private double preuBase;

    public Hotel(String nom, String poblacio, int numHabitacions, double preuBase) {
        this.nom = nom;
        this.poblacio = poblacio;
        this.numHabitacions = numHabitacions;
        this.preuBase = preuBase;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public int getNumHabitacions() {
        return numHabitacions;
    }

    public void setNumHabitacions(int numHabitacions) {
        this.numHabitacions = numHabitacions;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }
}
