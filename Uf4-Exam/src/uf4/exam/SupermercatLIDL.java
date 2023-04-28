package uf4.exam;

public class SupermercatLIDL extends ServeisAddicionals {

    private String compteHabitacio;
    private boolean portarCompraHotel;

    public SupermercatLIDL(String tipusServei, String data, String establimentOrigen, double importTotal, String compteHabitacio, boolean portarCompraHotel) {
        super(tipusServei, data, establimentOrigen, importTotal);
        this.compteHabitacio = compteHabitacio;
        this.portarCompraHotel = portarCompraHotel;
    }

    public String getCompteHabitacio() {
        return compteHabitacio;
    }

    public void setCompteHabitacio(String compteHabitacio) {
        this.compteHabitacio = compteHabitacio;
    }

    public boolean isPortarCompraHotel() {
        return portarCompraHotel;
    }

    public void setPortarCompraHotel(boolean portarCompraHotel) {
        this.portarCompraHotel = portarCompraHotel;
    }
}
