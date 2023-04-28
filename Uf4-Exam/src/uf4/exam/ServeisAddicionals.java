package uf4.exam;

public class ServeisAddicionals {

    private String tipusServei;
    private String data;
    private String establimentOrigen;
    private double importTotal;

    public ServeisAddicionals(String tipusServei, String data, String establimentOrigen, double importTotal) {
        this.tipusServei = tipusServei;
        this.data = data;
        this.establimentOrigen = establimentOrigen;
        this.importTotal = importTotal;
    }

    public String getTipusServei() {
        return tipusServei;
    }

    public String getData() {
        return data;
    }

    public String getEstablimentOrigen() {
        return establimentOrigen;
    }

    public double getImportTotal() {
        return importTotal;
    }

    public void setTipusServei(String tipusServei) {
        this.tipusServei = tipusServei;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setEstablimentOrigen(String establimentOrigen) {
        this.establimentOrigen = establimentOrigen;
    }

    public void setImportTotal(double importTotal) {
        this.importTotal = importTotal;
    }
}
