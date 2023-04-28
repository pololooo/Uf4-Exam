package uf4.exam;

public class Restaurant extends ServeisAddicionals {

    private String platsDemanats;
    private int numTaula;

    public Restaurant(String tipusServei, String data, String establimentOrigen, double importTotal, String platsDemanats, int numTaula) {
        super(tipusServei, data, establimentOrigen, importTotal);
        this.platsDemanats = platsDemanats;
        this.numTaula = numTaula;
    }

    public String getPlatsDemanats() {
        return platsDemanats;
    }

    public int getNumTaula() {
        return numTaula;
    }

    public void setPlatsDemanats(String platsDemanats) {
        this.platsDemanats = platsDemanats;
    }

    public void setNumTaula(int numTaula) {
        this.numTaula = numTaula;
    }
}
