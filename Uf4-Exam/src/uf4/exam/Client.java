package uf4.exam;

public class Client {

    private String nom;
    private String cognoms;
    private String adreca;
    private String correuElectronic;
    private String telefon;

    public Client(String nom, String cognoms, String adreca, String correuElectronic, String telefon) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.adreca = adreca;
        this.correuElectronic = correuElectronic;
        this.telefon = telefon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getCorreuElectronic() {
        return correuElectronic;
    }

    public void setCorreuElectronic(String correuElectronic) {
        this.correuElectronic = correuElectronic;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
