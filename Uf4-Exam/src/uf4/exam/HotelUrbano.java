package uf4.exam;

public class HotelUrbano extends Hotel {

    private int numSalones;
    private boolean wifiGratis;
    private boolean servicioHabitacion;
    private boolean servicioBugaderia;
    private boolean servicioGimnasio;

    public HotelUrbano(String nombre, String poblacion, int numHabitaciones, double precioBasePersonaNoche,
            int numSalones, boolean wifiGratis, boolean servicioHabitacion, boolean servicioBugaderia, boolean servicioGimnasio) {
        super(nombre, poblacion, numHabitaciones, precioBasePersonaNoche);
        this.numSalones = numSalones;
        this.wifiGratis = wifiGratis;
        this.servicioHabitacion = servicioHabitacion;
        this.servicioBugaderia = servicioBugaderia;
        this.servicioGimnasio = servicioGimnasio;
    }

    // Getters y setters
    public int getNumSalones() {
        return numSalones;
    }

    public void setNumSalones(int numSalones) {
        this.numSalones = numSalones;
    }

    public boolean isWifiGratis() {
        return wifiGratis;
    }

    public void setWifiGratis(boolean wifiGratis) {
        this.wifiGratis = wifiGratis;
    }

    public boolean isServicioHabitacion() {
        return servicioHabitacion;
    }

    public void setServicioHabitacion(boolean servicioHabitacion) {
        this.servicioHabitacion = servicioHabitacion;
    }

    public boolean isServicioBugaderia() {
        return servicioBugaderia;
    }

    public void setServicioBugaderia(boolean servicioBugaderia) {
        this.servicioBugaderia = servicioBugaderia;
    }

    public boolean isServicioGimnasio() {
        return servicioGimnasio;
    }

    public void setServicioGimnasio(boolean servicioGimnasio) {
        this.servicioGimnasio = servicioGimnasio;
    }
}
