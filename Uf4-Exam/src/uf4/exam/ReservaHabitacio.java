package uf4.exam;

import java.util.*;

public class ReservaHabitacio {

    private int numReserva;
    private String hotel;
    private Date checkIn;
    private Date checkOut;
    private int numPersonas;
    private ArrayList<String> serviciosContratados;
    private double costeBasePorNoche;
    private double costeTotal;

    public ReservaHabitacio(int numReserva, String hotel, Date checkIn, Date checkOut, int numPersonas, ArrayList<String> serviciosContratados, double costeBasePorNoche) {
        this.numReserva = numReserva;
        this.hotel = hotel;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numPersonas = numPersonas;
        this.serviciosContratados = serviciosContratados;
        this.costeBasePorNoche = costeBasePorNoche;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public ArrayList<String> getServiciosContratados() {
        return serviciosContratados;
    }

    public void setServiciosContratados(ArrayList<String> serviciosContratados) {
        this.serviciosContratados = serviciosContratados;
    }

    public double getCosteBasePorNoche() {
        return costeBasePorNoche;
    }

    public void setCosteBasePorNoche(double costeBasePorNoche) {
        this.costeBasePorNoche = costeBasePorNoche;
    }

    public double getCosteTotal() {
        return costeTotal;
    }
}
