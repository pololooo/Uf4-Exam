package uf4.exam;

public class Hotel {

    private String nombre;
    private String poblacion;
    private int numHabitaciones;
    private double precioBasePersonaNoche;

    public Hotel(String nombre, String poblacion, int numHabitaciones, double precioBasePersonaNoche) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.numHabitaciones = numHabitaciones;
        this.precioBasePersonaNoche = precioBasePersonaNoche;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getPrecioBasePersonaNoche() {
        return precioBasePersonaNoche;
    }

    public void setPrecioBasePersonaNoche(double precioBasePersonaNoche) {
        this.precioBasePersonaNoche = precioBasePersonaNoche;
    }
}
