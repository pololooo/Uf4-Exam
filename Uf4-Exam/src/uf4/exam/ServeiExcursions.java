package uf4.exam;

public class ServeiExcursions extends ServeisAddicionals {

    private String recorregut;
    private String horaInici;
    private String horaArribada;

    public ServeiExcursions(String tipusServei, String data, String establimentOrigen, double importTotal, String recorregut, String horaInici, String horaArribada) {
        super(tipusServei, data, establimentOrigen, importTotal);
        this.recorregut = recorregut;
        this.horaInici = horaInici;
        this.horaArribada = horaArribada;
    }

    public String getRecorregut() {
        return recorregut;
    }

    public void setRecorregut(String recorregut) {
        this.recorregut = recorregut;
    }

    public String getHoraInici() {
        return horaInici;
    }

    public void setHoraInici(String horaInici) {
        this.horaInici = horaInici;
    }

    public String getHoraArribada() {
        return horaArribada;
    }

    public void setHoraArribada(String horaArribada) {
        this.horaArribada = horaArribada;
    }

}
